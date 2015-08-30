package com.lacunasoftware.restpki;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Authentication {
	
	private RestPkiClient client;

    private boolean done = false;
    private PKCertificate pkCertificate;

	public Authentication(RestPkiClient client) {
		this.client = client;
	}
	
	public String start() throws RestException {
        AuthenticationGetResponse response = client.getRestClient().get("Api/Authentication", AuthenticationGetResponse.class);
		return response.getNonce();
	}
	
	public ValidationResults complete(String nonce, String certificate, String signature, SecurityContext securityContext) throws RestException {
		
		AuthenticationPostRequest request = new AuthenticationPostRequest();
		request.setNonce(nonce);
		request.setCertificate(certificate);
		request.setSignature(signature);
		request.setSecurityContextId(securityContext.getId());

        AuthenticationPostResponse response = client.getRestClient().post("Api/Authentication", request,AuthenticationPostResponse.class);

        ValidationResults vr = new ValidationResults(response.getValidationResults());
        if (response.getCertificate() != null) {
            this.pkCertificate = new PKCertificate(response.getCertificate());
        }
        done = true;
		return vr;
	}

    public PKCertificate getPKCertificate() {
        checkDone();
        return this.pkCertificate;
    }

    private void checkDone() {
        if (!done) {
            throw new RuntimeException("The method complete() has not been called");
        }
    }

}
