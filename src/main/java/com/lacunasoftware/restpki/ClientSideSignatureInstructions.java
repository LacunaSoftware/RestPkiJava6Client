package com.lacunasoftware.restpki;

public class ClientSideSignatureInstructions {

    private String token;
    private String toSignData;
    private String toSignHash;
    private String digestAlgorithmOid;
    private PKCertificate certificateInfo;

    public ClientSideSignatureInstructions(String token, String toSignData, String toSignHash, String digestAlgorithmOid, PKCertificate certificateInfo) {
        this.token = token;
        this.toSignData = toSignData;
        this.toSignHash = toSignHash;
        this.digestAlgorithmOid = digestAlgorithmOid;
        this.certificateInfo = certificateInfo;
    }

    /**
     * Returns the token, which must be passed when finishing the signature.
     * @return The token, a 43-character case-sensitive string containing only letters, numbers and the characters
     * "-" and "_" (therefore URL and HTML safe).
     */
    public String getToken() {
        return token;
    }

    /**
     * Returns the bytes to be signed using the signer certificate's private key, encoded in Base64.
     * <p>
     *     If you are using the Web PKI component to perform the client-side signature, this value must be passed
     *     to the component's method signData. You can alternatively call the component's method signHash, in which
     *     case you should use the method getToSignHash() instead.
     * </p>
     * @return The "to sign bytes", encoded in Base64.
     */
    public String getToSignData() {
        return toSignData;
    }

    /**
     * Returns the precomputed digest of the bytes to be signed using the signer certificate's private key,
     * encoded in Base64.
     * <p>
     *     If you are using the Web PKI component to perform the client-side signature, this value must be passed
     *     to the component's method signHash. You can alternatively call the component's method signData, in which
     *     case you should use the method getToSignData() instead.
     * </p>
     * @return The "to sign precomputed digest of the bytes", encoded in Base64.
     */
    public String getToSignHash() {
        return toSignHash;
    }

    /**
     * Returns the OID of the digest algorithm that must be used to sign the "to sign data" (see method getToSignData()),
     * which is also the digest algorithm that was used to compute the "to sign hash".
     * <p>
     *     If you are using the Web PKI component to perform the client-side signature, this value must be passed
     *     to the component's methods signData and signHash, depending on which you'll use.
     * </p>
     * @return The OID of the digest algorithm (for instance, "2.16.840.1.101.3.4.2.1").
     */
    public String getDigestAlgorithmOid() {
        return digestAlgorithmOid;
    }

    /**
     * Returns the signer's certificate information. It is not necessary for the client application to use this value,
     * but it may use it, for instance, to verify that the user selected a certificate for signature that meets certain
     * criteria.
     * @return The signer's certificate information.
     */
    public PKCertificate getCertificateInfo() {
        return certificateInfo;
    }
}
