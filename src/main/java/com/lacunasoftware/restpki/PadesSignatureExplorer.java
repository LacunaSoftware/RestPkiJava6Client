package com.lacunasoftware.restpki;

import java.io.IOException;

/**
 * Class used to open the signatures in a PDF file and optionally validate them.
 * <p>
 *     By default, the PDF signatures are only inspected but not validated. In order to validate the file, you must
 *     call the method setValidate and also the methods regarding signature policies, which specify the parameters
 *     for the validation.
 * </p>
 */
public class PadesSignatureExplorer extends SignatureExplorer {

    private static final String PDF_MIME_TYPE = "application/pdf";

    public PadesSignatureExplorer(RestPkiClient client) {
        super(client);
    }

    /**
     * Performs the open signature operation.
     * @return information about the PDF signatures.
     * @throws RestException if an error occurs when calling REST PKI
     */
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
