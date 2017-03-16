package com.lacunasoftware.restpki;

public class SignatureStartWithWebPkiResult {

    private PKCertificate certificate = null;
    private String token = null;

    public SignatureStartWithWebPkiResult(String token, CertificateModel certificate) {
        this.token = token;
        if (certificate != null) {
            this.certificate = new PKCertificate(certificate);
        }
    }

    public String getToken() {
        return token;
    }

    public PKCertificate getCertificate() {
        return certificate;
    }
}
