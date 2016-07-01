package com.lacunasoftware.restpki;

/**
 * Represents one of the signatures in a PDF file.
 */
public class PadesSignerInfo extends CadesSignerInfo {

    private boolean isDocumentTimestamp;
    private String signatureFieldName;

    PadesSignerInfo(PadesSignerModel model) {
        super(
                model.getMessageDigest(),
                model.getSignature(),
                model.getCertificate(),
                model.getSigningTime(),
                model.getCertifiedDateReference(),
                model.getSignaturePolicy(),
                model.getTimestamps(),
                model.getValidationResults()
        );
        this.isDocumentTimestamp = model.getIsDocumentTimestamp();
        this.signatureFieldName = model.getSignatureFieldName();
    }


    public boolean isDocumentTimestamp() {
        return isDocumentTimestamp;
    }

    public String getSignatureFieldName() {
        return signatureFieldName;
    }
}
