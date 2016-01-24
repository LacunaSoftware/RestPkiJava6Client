package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Class used to perform the final of the two steps required to perform XML signatures.
 */
public class XmlSignatureFinisher extends SignatureFinisher {

    private byte[] signedXml;

    public XmlSignatureFinisher(RestPkiClient client) {
        super(client);
    }

    @Override
    public byte[] finish() throws RestException {

        if (token == null) {
            throw new RuntimeException("The token was not set");
        }

        XmlSignaturePostSignedBytesResponse response;
        if (signature == null) {
            String actionUrl = String.format("Api/XmlSignatures/%s/Finalize", token);
            response = client.getRestClient().post(actionUrl, null, XmlSignaturePostSignedBytesResponse.class);
        } else {
            XmlSignaturePostSignedBytesRequest request = new XmlSignaturePostSignedBytesRequest();
            request.setSignature(signature);
            String actionUrl = String.format("Api/XmlSignatures/%s/SignedBytes", token);
            response = client.getRestClient().post(actionUrl, request, XmlSignaturePostSignedBytesResponse.class);
        }

        this.signedXml = new ObjectMapper().convertValue(response.getSignedXml(), byte[].class);
        this.callbackArgument = response.getCallbackArgument();
        this.certificateInfo = new PKCertificate(response.getCertificate());
        this.done = true;

        return this.signedXml;
    }

    /**
     * Returns the signed XML (must only be called after calling the finish() method).
     *
     * @return The signed XML's bytes.
     */
    public byte[] getSignedXml() {
        if (!done) {
            throw new RuntimeException("The getSignedPdf() method can only be called after calling the finish() method");
        }
        return signedXml;
    }

    /**
     * Writes the signed XML to a file (must only be called after calling the finish() method).
     * @param path The path to the file.
     * @throws java.io.IOException
     */
    public void writeSignedXmlToFile(String path) throws IOException {
        writeSignedXmlToFile(Paths.get(path));
    }

    /**
     * Writes the signed XML to a file (must only be called after calling the finish() method).
     * @param path The path to the file.
     * @throws IOException
     */
    public void writeSignedXmlToFile(Path path) throws IOException {
        if (!done) {
            throw new RuntimeException("The writeSignedXmlToFile() method can only be called after calling the finish() method");
        }
        Files.write(path, signedXml);
    }
}
