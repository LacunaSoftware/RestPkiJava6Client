package com.lacunasoftware.restpki;

public class SignatureStartResult extends ClientSideSignatureInstructions {

    private PKCertificate certificate;

    public SignatureStartResult(String token, CertificateModel certificate, String toSignData, String toSignHash, String digestAlgorithmOid) {
        super(token, toSignData, toSignHash, digestAlgorithmOid);
        this.certificate = new PKCertificate(certificate);
    }

    public PKCertificate getCertificate() {
        return certificate;
    }
}
