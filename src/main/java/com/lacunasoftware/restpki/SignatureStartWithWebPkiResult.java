package com.lacunasoftware.restpki;

public class SignatureStartWithWebPkiResult {

    private PKCertificate certificate;
    private String token;

    public SignatureStartWithWebPkiResult(String token, CertificateModel certificate) {
        this.token = token;
        this.certificate = new PKCertificate(certificate);
    }

    public String getToken() {
        return token;
    }

    public PKCertificate getCertificate() {
        return certificate;
    }
}
