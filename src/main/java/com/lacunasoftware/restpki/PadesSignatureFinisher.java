package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class used to perform the final of the two steps required to perform a PAdES signature.
 */
public class PadesSignatureFinisher extends SignatureFinisher {

	private byte[] signedPdf;

	public PadesSignatureFinisher(RestPkiClient client) {
		super(client);
	}

	@Override
	public byte[] finish() throws RestException {

		if (token == null) {
			throw new RuntimeException("The token was not set");
		}

		PadesSignaturePostSignedBytesResponse response;
		if (signature == null) {
			String actionUrl = String.format("Api/PadesSignatures/%s/Finalize", token);
			response = client.getRestClient().post(actionUrl, null, PadesSignaturePostSignedBytesResponse.class);
		} else {
			PadesSignaturePostSignedBytesRequest request = new PadesSignaturePostSignedBytesRequest();
			request.setSignature(signature);
			String actionUrl = String.format("Api/PadesSignatures/%s/SignedBytes", token);
			response = client.getRestClient().post(actionUrl, request, PadesSignaturePostSignedBytesResponse.class);
		}

		this.signedPdf = new ObjectMapper().convertValue(response.getSignedPdf(), byte[].class);
		this.callbackArgument = response.getCallbackArgument();
		this.certificateInfo = new PKCertificate(response.getCertificate());
		this.done = true;

		return this.signedPdf;
	}

	/**
	 * Returns the signed PDF (must only be called after calling the finish() method).
	 *
	 * @return The signed PDF's bytes.
	 */
	public byte[] getSignedPdf() {
		if (!done) {
			throw new RuntimeException("The getSignedPdf() method can only be called after calling the finish() method");
		}
		return signedPdf;
	}

}
