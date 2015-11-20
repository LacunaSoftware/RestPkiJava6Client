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
 * Class used to perform the first of the two steps required to perform a PAdES signature.
 * <p>
 * Note on confidentiality: the PDF to be signed is stored on the server between the first and second steps,
 * but never unencrypted. The content is encrypted using AES-128 and <b>the key is not stored on the server</b>,
 * it is instead mixed into the token that is returned and which is necessary on the second step. In other
 * words, the server stores the PDF but is unable to read it on its own, therefore the PDF contents cannot be
 * compromised, even in the event of a complete data leakage.
 * </p>
 */
public class PadesSignatureStarter extends SignatureStarter {

	private byte[] pdfContent;
	private PadesVisualRepresentation visualRepresentation;

	/**
	 * Create a new instance using the given RestPkiClient.
	 *
	 * @param client the RestPkiClient which shall be used.
	 */
	public PadesSignatureStarter(RestPkiClient client) {
		super(client);
	}

	/**
	 * Sets the PDF to be signed
	 *
	 * @param stream a pre-opened InputStream linked to the PDF that will be signed. The stream is NOT closed by this method.
	 * @throws IOException if an error occurs while reading the stream.
	 */
	public void setPdfToSign(InputStream stream) throws IOException {
		this.pdfContent = Util.readStream(stream);
	}

	/**
	 * Sets the PDF to be signed
	 *
	 * @param content Binary content of the PDF
	 */
	public void setPdfToSign(byte[] content) {
		this.pdfContent = content;
	}

	/**
	 * Sets the file path of the PDF to be signed
	 *
	 * @param path File path of the PDF to be signed.
	 * @throws IOException if an error occurs while reading the file.
	 */
	public void setPdfToSign(String path) throws IOException {
		this.pdfContent = Files.readAllBytes(Paths.get(path));
	}

	/**
	 * Optional, sets the settings for the signature's visual representation.
	 *
	 * @param visualRepresentation The visual representation's settings.
	 */
	public void setVisualRepresentation(PadesVisualRepresentation visualRepresentation) {
		this.visualRepresentation = visualRepresentation;
	}

	/**
	 * Performs the first step, should be called after setting the necessary parameters. If you intend to use
	 * the Web PKI component on the client-side, use the startWithRestPki() method instead.
	 *
	 * @return An instance of ClientSideSignatureInstructions with the information necessary to perform the client-side
	 * signature and later call the server back with the results.
	 * @throws RestException if an error occurs when calling REST PKI
	 */
	@Override
	public ClientSideSignatureInstructions start() throws RestException {

		if (pdfContent == null) {
			throw new RuntimeException("The pdf to sign was not set");
		}
		if (certificate == null) {
			throw new RuntimeException("The certificate was not set");
		}
		if (signaturePolicyId == null) {
			throw new RuntimeException("The signature policy was not set");
		}

		PadesSignaturePostRequest request = new PadesSignaturePostRequest();
		request.setPdfToSign(new ObjectMapper().convertValue(pdfContent, String.class));
		request.setCertificate(certificate);
		request.setSignaturePolicyId(signaturePolicyId);
		request.setSecurityContextId(securityContextId);
		request.setCallbackArgument(callbackArgument);
		if (visualRepresentation != null) {
			request.setVisualRepresentation(visualRepresentation.toModel());
		}

		PadesSignaturePostResponse response = client.getRestClient().post("Api/PadesSignatures", request, PadesSignaturePostResponse.class);

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

	/**
	 * Performs the first step, should be called after setting the necessary parameters. This method should
	 * be used if the Web PKI component is being used on the client-side.
	 *
	 * @return The token that should be passed on the signWithRestPki method of the Web PKI component
	 * (on the client-side logic).
	 * @throws RestException if an error occurs when calling REST PKI
	 */
	@Override
	public String startWithWebPki() throws RestException {

		if (pdfContent == null) {
			throw new RuntimeException("The pdf to sign was not set");
		}
		if (signaturePolicyId == null) {
			throw new RuntimeException("The signature policy was not set");
		}

		PadesSignaturePostRequest request = new PadesSignaturePostRequest();
		request.setPdfToSign(new ObjectMapper().convertValue(pdfContent, String.class));
		request.setCertificate(certificate); // may be null
		request.setSignaturePolicyId(signaturePolicyId);
		request.setSecurityContextId(securityContextId);
		request.setCallbackArgument(callbackArgument);
		if (visualRepresentation != null) {
			request.setVisualRepresentation(visualRepresentation.toModel());
		}

		PadesSignaturePostResponse response = client.getRestClient().post("Api/PadesSignatures", request, PadesSignaturePostResponse.class);

		if (response.getCertificate() != null) {
			this.certificateInfo = new PKCertificate(response.getCertificate());
		}
		this.done = true;

		return response.getToken();
	}
}
