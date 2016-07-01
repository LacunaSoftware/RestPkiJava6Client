package com.lacunasoftware.restpki;

import java.io.IOException;

/**
 * Class used to inspect the signatures in a PDF file.
 */
public class PadesSignatureExplorer extends SignatureExplorer {

    private static final String PDF_MIME_TYPE = "application/pdf";

    public PadesSignatureExplorer(RestPkiClient client) {
        super(client);
    }

    public PadesSignature open() throws RestException {

        if (signatureFileContent == null) {
            throw new RuntimeException("The signature file to open not set");
        }

        OpenSignatureRequestModel request = getRequest(PDF_MIME_TYPE);
        PadesSignatureModel response = client.getRestClient().post("Api/PadesSignatures/Open", request, PadesSignatureModel.class);
        PadesSignature signature = new PadesSignature(response);
        return signature;
    }

}
