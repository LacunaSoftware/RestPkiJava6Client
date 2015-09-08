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

    /**
     * Sets the token previously yielded by the first step.
     * @param token The token, a 43-character case-sensitive string containing only letters, numbers and the characters
     * "-" and "_" (therefore URL and HTML safe).
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Sets the signature performed using the user certificate's private key.
     * @param signature The signature operation output, encoded in Base64 (this is the format returned by the Web PKI component's signData and signHash methods).
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Performs the step (should only be called after calling setToken() and setSignature()). This method throws
     * a ValidationException if the validation of the signature or of the user's certificate fails.
     * @throws RestException If an error occurs while calling the REST PKI API or if validation of the signature or of the user's certificate fails.
     */
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

    /**
     * Returns the signed PDF (must only be called after calling the finish() method).
     * @return The signed PDF's bytes.
     */
    public byte[] getSignedPdf() {
        checkDone();
        return signedPdf;
    }

    /**
     * Returns the callback argument, if one was passed during the first step (must only be called after
     * calling the finish() method).
     * @return The callback argument passed previously on the first step, or null if no argument was passed.
     */
    public String getCallbackArgument() {
        return callbackArgument;
    }

    private void checkDone() {
        if (!done) {
            throw new RuntimeException("The method finish() has not been called");
        }
    }
}
