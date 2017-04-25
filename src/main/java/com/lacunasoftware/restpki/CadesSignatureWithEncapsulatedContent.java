package com.lacunasoftware.restpki;


public class CadesSignatureWithEncapsulatedContent {

    private CadesSignature signature;
    private FileResult encapsulatedContent;

    CadesSignatureWithEncapsulatedContent(CadesSignature signature, FileResult encapsulatedContent) {
        this.signature = signature;
        this.encapsulatedContent = encapsulatedContent;
    }

    public CadesSignature getSignature() {
        return signature;
    }

    public FileResult getEncapsulatedContent() {
        return encapsulatedContent;
    }
}
