package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

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

	/**
	 * Writes the signed PDF to a file (must only be called after calling the finish() method).
	 * @param path The path to the file.
	 * @throws IOException
	 */
	public void writeSignedPdfToFile(String path) throws IOException {
		writeSignedPdfToFile(new File(path));
	}

	/**
	 * Writes the signed PDF to a file (must only be called after calling the finish() method).
	 * @param file The destination file.
	 * @throws IOException
	 */
	public void writeSignedPdfToFile(File file) throws IOException {
		if (!done) {
			throw new RuntimeException("The writeSignedPdfToFile() method can only be called after calling the finish() method");
		}
		Storage.writeFile(file, signedPdf);
	}

}
