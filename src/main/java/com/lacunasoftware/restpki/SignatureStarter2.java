package com.lacunasoftware.restpki;

import java.io.IOException;

public abstract class SignatureStarter2 {

    protected RestPkiClient client;
    protected String certificate;
    protected String signaturePolicyId;
    protected String securityContextId;
    protected String callbackArgument;
    protected boolean ignoreRevocationStatusUnknown = false;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public SignatureStarter2(RestPkiClient client) {
        this.client = client;
    }

    /**
     * Sets the signer's certificate. This is optional if the startWithWebPki() method will be used instead of
     * the start() method.
     *
     * @param certificate The signer's certificate, encoded in Base64. If you're using the Web PKI component on
     *                    the client-side, this is the format given by the component.
     */
    public void setSignerCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * Sets the signature policy to be used for the signature.
     *
     * @param signaturePolicy The signature policy. Depending on the policy, it might also be necessary to set
     *                        a security context.
     */
    public void setSignaturePolicy(SignaturePolicy signaturePolicy) {
        this.signaturePolicyId = signaturePolicy.getId();
    }

    /**
     * Sets the security context to be used to validate the signature. Depending on the signature policy selected, this
     * may be mandatory. If the signature policy does not require a security context to be set but one is nevertheless
     * passed, the given security context overrides the one that would otherwise be inferred from the policy.
     *
     * @param securityContext The security context to be used to validate the signature.
     */
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContextId = securityContext.getId();
    }

    /**
     * Optional, sets a callback argument that will be returned on the second step.
     * <p>
     * The callback argument can be used to simplify the code of the client application. For instance, it might
     * be the ID of the document being signed.
     * </p>
     * <p>
     * As the PDf content, the callback argument is also stored in the server with AES-128 encryption using a key
     * which is never stored by the server, therefore it cannot read the value on its own, protecting it against
     * compromise even in the event of a complete data leakage.
     * </p>
     *
     * @param argument The callback argument, a string whose UTF-8 encoding must not exceed 200 bytes.
     */
    public void setCallbackArgument(String argument) {
        this.callbackArgument = argument;
    }

    public boolean getIgnoreRevocationStatusUnknown() {
        return ignoreRevocationStatusUnknown;
    }

    /**
     * Sets the option of "IgnoreRevocationStatusUnknown".
     *
     * @param ignoreRevocationStatusUnknown The option of "IgnoreRevocationStatusUnknown".
     */
    public void setIgnoreRevocationStatusUnknown(boolean ignoreRevocationStatusUnknown) {
        this.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
    }

    /**
     * Performs the first step, should be called after setting the necessary parameters. If you intend to use
     * the Web PKI component on the client-side, use the startWithWebPki() method instead.
     *
     * @return An instance of SignatureStartResult with the information necessary to perform the client-side
     * signature and later call the server back with the results.
     * @throws RestException if an error occurs when calling REST PKI.
     * @throws IOException if an error occurs when trying to obtain the file to be signed or be cosign or when trying
     * to compute all hashes from this file, both files had to be provided before this method is called.
     */
    public abstract SignatureStartResult start() throws RestException, IOException;

    /**
     * Performs the first step, should be called after setting the necessary parameters. This method should
     * be used if the Web PKI component is being used on the client-side.
     *
     * @return An instance of SignatureStartWithWebPkiResult containing the token that should be passed on the
     * signWithRestPki() method of the Web PKI component (on the client-side logic) and the signer's certificate.
     * @throws RestException if an error occurs when calling REST PKI.
     * @throws IOException if an error occurs when trying to obtain the file to be signed or be cosign or when trying
     * to compute all hashes from this file, both files had to be provided before this method is called.
     */
    public abstract SignatureStartWithWebPkiResult startWithWebPki() throws RestException, IOException;
}
