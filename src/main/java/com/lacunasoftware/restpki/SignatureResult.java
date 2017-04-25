package com.lacunasoftware.restpki;

public class SignatureResult extends FileResult {

    private PKCertificate certificate;
    private String callbackArgument;

    SignatureResult(RestPkiClient client, FileModel file, CertificateModel certificate, String callbackArgument) {
        super(client, file);
        this.certificate = new PKCertificate(certificate);
        this.callbackArgument = callbackArgument;
    }

    public PKCertificate getCertificate() { return certificate; }

    public String getCallbackArgument() { return callbackArgument; }
}
