package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Class used to perform the first of the two steps required to perform a CAdES signature.
 * <p>
 * Note on confidentiality: the file to be signed is stored on the server between the first and second steps,
 * but never unencrypted. The content is encrypted using AES-128 and <b>the key is not stored on the server</b>,
 * it is instead mixed into the token that is returned and which is necessary on the second step. In other
 * words, the server stores the file but is unable to read it on its own, therefore the file contents cannot be
 * compromised, even in the event of a complete data leakage.
 * </p>
 */
public class CadesSignatureStarter extends SignatureStarter {

	private byte[] contentToSign;
	private byte[] cmsToCoSign;
	private Boolean encapsulateContent;

	/**
	 * Create a new instance using the given RestPkiClient.
	 *
	 * @param client the RestPkiClient which shall be used.
	 */
	public CadesSignatureStarter(RestPkiClient client) {
		super(client);
	}

	/**
	 * Sets the content to be signed
	 *
	 * @param stream a pre-opened InputStream linked to the file that will be signed. The stream is NOT closed by this method.
	 * @throws IOException if an error occurs while reading the stream.
	 */
	public void setContentToSign(InputStream stream) throws IOException {
		this.contentToSign = Util.readStream(stream);
	}

	/**
	 * Sets the content to be signed as a byte array
	 *
	 * @param content Binary content to be signed
	 */
	public void setContentToSign(byte[] content) {
		this.contentToSign = content;
	}

	/**
	 * Sets the path of the file to be signed
	 *
	 * @param path Path of the file to be signed.
	 * @throws IOException if an error occurs while reading the file.
	 */
	public void setFileToSign(String path) throws IOException {
		this.contentToSign = Files.readAllBytes(Paths.get(path));
	}

	/**
	 * Sets the CMS to be co-signed
	 *
	 * @param stream a pre-opened InputStream linked to the CMS file that will be co-signed. The stream is NOT closed by
	 *               this method.
	 * @throws IOException if an error occurs while reading the stream.
	 */
	public void setCmsToCoSign(InputStream stream) throws IOException {
		this.cmsToCoSign = Util.readStream(stream);
	}

	/**
	 * Sets the CMS to be co-signed as a byte array
	 *
	 * @param cmsToCoSign Binary content of the CMS to be co-signed
	 */
	public void setCmsToCoSign(byte[] cmsToCoSign) {
		this.cmsToCoSign = cmsToCoSign;
	}

	/**
	 * Sets the path of the CMS file to be co-signed
	 *
	 * @param path Path of the CMS file to be co-signed.
	 * @throws IOException if an error occurs while reading the file.
	 */
	public void setCmsToCoSign(String path) throws IOException {
		this.cmsToCoSign = Files.readAllBytes(Paths.get(path));
	}

	/**
	 * Optionally denotes whether the resulting CMS should include the content signed. If omitted or set to null, the
	 * following rules apply:
	 * <p>If no CmsToSign is given, the resulting CMS will include the content</p>
	 * <p>If a CmsToCoSign is given, the resulting CMS will include the content if and only if the CmsToCoSign also
	 * includes the content</p>
	 */
	public void setEncapsulateContent(Boolean encapsulateContent) {
		this.encapsulateContent = encapsulateContent;
	}

	@Override
	public ClientSideSignatureInstructions start() throws RestException {

		if (contentToSign == null && cmsToCoSign == null) {
			throw new RuntimeException("The content to sign was not set and no CMS to be co-signed was given");
		}
		if (certificate == null) {
			throw new RuntimeException("The certificate was not set");
		}
		if (signaturePolicyId == null) {
			throw new RuntimeException("The signature policy was not set");
		}

		CadesSignaturePostRequest request = new CadesSignaturePostRequest();
		request.setCertificate(certificate);
		request.setSignaturePolicyId(signaturePolicyId);
		request.setSecurityContextId(securityContextId);
		request.setCallbackArgument(callbackArgument);
		request.setEncapsulateContent(encapsulateContent);
		if (contentToSign != null) {
			request.setContentToSign(new ObjectMapper().convertValue(contentToSign, String.class));
		}
		if (cmsToCoSign != null) {
			request.setCmsToCoSign(new ObjectMapper().convertValue(cmsToCoSign, String.class));
		}

		CadesSignaturePostResponse response = client.getRestClient().post("Api/CadesSignatures", request, CadesSignaturePostResponse.class);

		if (response.getCertificate() != null) {
			this.certificateInfo = new PKCertificate(response.getCertificate());
		}

		ClientSideSignatureInstructions signatureInstructions = new ClientSideSignatureInstructions(
			response.getToken(),
			response.getToSignData(),
			response.getToSignHash(),
			response.getDigestAlgorithmOid()
		);
		this.done = true;

		return signatureInstructions;
	}

	@Override
	public String startWithWebPki() throws RestException {

		if (contentToSign == null && cmsToCoSign == null) {
			throw new RuntimeException("The content to sign was not set and no CMS to be co-signed was given");
		}
		if (signaturePolicyId == null) {
			throw new RuntimeException("The signature policy was not set");
		}

		CadesSignaturePostRequest request = new CadesSignaturePostRequest();
		request.setCertificate(certificate); // may be null
		request.setSignaturePolicyId(signaturePolicyId);
		request.setSecurityContextId(securityContextId);
		request.setCallbackArgument(callbackArgument);
		request.setEncapsulateContent(encapsulateContent);
		if (contentToSign != null) {
			request.setContentToSign(new ObjectMapper().convertValue(contentToSign, String.class));
		}
		if (cmsToCoSign != null) {
			request.setCmsToCoSign(new ObjectMapper().convertValue(cmsToCoSign, String.class));
		}

		CadesSignaturePostResponse response = client.getRestClient().post("Api/CadesSignatures", request, CadesSignaturePostResponse.class);

		if (response.getCertificate() != null) {
			this.certificateInfo = new PKCertificate(response.getCertificate());
		}
		this.done = true;

		return response.getToken();
	}
}
