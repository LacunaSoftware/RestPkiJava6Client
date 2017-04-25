package com.lacunasoftware.restpki;

import java.io.IOException;

public class PadesSignatureExplorer2 extends SignatureExplorer2 {

    private static final String PDF_MIME_TYPE = "application/pdf";

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public PadesSignatureExplorer2(RestPkiClient client) {
        super(client);
    }

    /**
     * Performs the open signature operation.
     *
     * @return information about the PDF signatures.
     * @throws RestException if an error occurs when calling REST PKI
     * @throws IOException if an error occurs while reading the signature file.
     */
    public PadesSignature open() throws RestException, IOException {

        if (signatureFile == null) {
            throw new RuntimeException("The signature file to open not set");
        }

        OpenSignatureRequestModel request = fillRequest(new OpenSignatureRequestModel());
        PadesSignatureModel response = client.getRestClient().post("Api/PadesSignatures/Open", request, PadesSignatureModel.class);
        PadesSignature signature = new PadesSignature(response);
        return signature;
    }
}
