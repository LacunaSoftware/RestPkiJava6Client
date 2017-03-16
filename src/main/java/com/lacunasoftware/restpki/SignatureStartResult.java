package com.lacunasoftware.restpki;

public class SignatureStartResult extends ClientSideSignatureInstructions {

    private PKCertificate certificate = null;

    public SignatureStartResult(String token, CertificateModel certificate, String toSignData, String toSignHash, String digestAlgorithmOid) {
        super(token, toSignData, toSignHash, digestAlgorithmOid);
        if (certificate != null) {
            this.certificate = new PKCertificate(certificate);
        }
    }

    public PKCertificate getCertificate() {
        return certificate;
    }
}
