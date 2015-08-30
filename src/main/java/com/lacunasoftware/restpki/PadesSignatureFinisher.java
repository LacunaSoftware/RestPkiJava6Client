package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PadesSignatureFinisher {

    private RestPkiClient client;
    private String token;
    private String signature;

    private boolean done = false;
    private byte[] signedPdf;
    private String callbackArgument;

    public PadesSignatureFinisher(RestPkiClient client) {
        this.client = client;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void finish() throws RestException {

        if (token == null) {
            throw new RuntimeException("The token was not set");
        }
        if (signature == null) {
            throw new RuntimeException("The signature was not set");
        }

        PadesSignaturePostSignedBytesRequest request = new PadesSignaturePostSignedBytesRequest();
        request.setSignature(signature);

        String actionUrl = String.format("Api/PadesSignatures/%s/SignedBytes", token);
        PadesSignaturePostSignedBytesResponse response = client.getRestClient().post(actionUrl, request, PadesSignaturePostSignedBytesResponse.class);

        this.signedPdf = new ObjectMapper().convertValue(response.getSignedPdf(), byte[].class);
        this.callbackArgument = response.getCallbackArgument();

        this.done = true;
    }

    public byte[] getSignedPdf() {
        checkDone();
        return signedPdf;
    }

    public String getCallbackArgument() {
        return callbackArgument;
    }

    private void checkDone() {
        if (!done) {
            throw new RuntimeException("The method finish() has not been called");
        }
    }
}
