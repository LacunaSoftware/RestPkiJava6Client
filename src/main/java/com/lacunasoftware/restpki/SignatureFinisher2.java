package com.lacunasoftware.restpki;

public abstract class SignatureFinisher2 {

    protected RestPkiClient client;
    protected String token;
    protected byte[] signature;
    protected Boolean forceBlobResult;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public SignatureFinisher2(RestPkiClient client) {
        this.client = client;
        this.forceBlobResult = false;
    }

    /**
     * Sets the token previously yielded by the first step.
     *
     * @param token The token, a 43-character case-sensitive string containing only letters, numbers and the characters
     * "-" and "_" (therefore URL and HTML safe).
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Sets the signature performed using the user certificate's private key (should not be used if the signature was
     * started with the method startWithWebPki()).
     *
     * @param signature The signature operation output
     */
    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    /**
     * 
     * @param forceBlobResult
     */
    public void setForceBlobResult(Boolean forceBlobResult) {
        this.forceBlobResult = forceBlobResult;
    }

    /**
     * Finalizes the signature process, returning the SignatureResult instance, that contains the
     * signature information, including the signer certificate and the signature file.
     *
     * @return An instance of SignatureResult with the result information from the signature.
     * @throws RestException if an error occurs when calling REST PKI.
     */
    public SignatureResult finish() throws RestException {

        if (token == null) {
            throw new RuntimeException("The token was not set");
        }

        checkCompatibility();

        CompleteSignatureRequest request = new CompleteSignatureRequest();
        request.setForceBlobResult(forceBlobResult);
        request.setSignature(Util.encodeBase64(signature));

        SignatureResultModel response = client.getRestClient().post(getApiRoute(), request, SignatureResultModel.class);

        return new SignatureResult(client, response.getSignatureFile(), response.getCertificate(), response.getCallbackArgument());
    }

    protected abstract void checkCompatibility();
    protected abstract String getApiRoute();
}
