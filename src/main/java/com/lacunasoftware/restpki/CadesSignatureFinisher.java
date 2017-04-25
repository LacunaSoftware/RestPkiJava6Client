package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Class used to perform the final of the two steps required to perform a CAdES signature.
 */
public class CadesSignatureFinisher extends SignatureFinisher {

	private byte[] cms;

	public CadesSignatureFinisher(RestPkiClient client) {
		super(client);
	}

	@Override
	public byte[] finish() throws RestException {

		if (token == null) {
			throw new RuntimeException("The token was not set");
		}

		CadesSignaturePostSignedBytesResponse response;
		if (signature == null) {
			String actionUrl = String.format("Api/CadesSignatures/%s/Finalize", token);
			response = client.getRestClient().post(actionUrl, null, CadesSignaturePostSignedBytesResponse.class);
		} else {
			PadesSignaturePostSignedBytesRequest request = new PadesSignaturePostSignedBytesRequest();
			request.setSignature(signature);
			String actionUrl = String.format("Api/CadesSignatures/%s/SignedBytes", token);
			response = client.getRestClient().post(actionUrl, request, CadesSignaturePostSignedBytesResponse.class);
		}

		this.cms = new ObjectMapper().convertValue(response.getCms(), byte[].class);
		this.callbackArgument = response.getCallbackArgument();
		this.certificateInfo = new PKCertificate(response.getCertificate());
		this.done = true;

		return this.cms;
	}

	/**
	 * Returns the signed PDF (must only be called after calling the finish() method).
	 *
	 * @return The signed PDF's bytes.
	 */
	public byte[] getCms() {
		if (!done) {
			throw new RuntimeException("The getCms() method can only be called after calling the finish() method");
		}
		return cms;
	}

	/**
	 * Writes the CMS to a file (must only be called after calling the finish() method).
	 * @param path The path to the file.
	 * @throws IOException
	 */
	public void writeCmsToFile(String path) throws IOException {
		writeCmsToFile(new File(path));
	}

	/**
	 * Writes the CMS to a file (must only be called after calling the finish() method).
	 * @param file The file.
	 * @throws IOException
	 */
	public void writeCmsToFile(File file) throws IOException {
		if (!done) {
			throw new RuntimeException("The writeCmsToFile() method can only be called after calling the finish() method");
		}
		Storage.writeFile(file, cms);
	}

}
