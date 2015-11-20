package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

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

}
