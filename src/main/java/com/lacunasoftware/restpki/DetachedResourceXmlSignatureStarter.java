package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by BrunoD on 22/01/2016.
 */
public class DetachedResourceXmlSignatureStarter extends XmlSignatureStarter {

    private String resourceUri;
    private byte[] resourceContent;

    public DetachedResourceXmlSignatureStarter(RestPkiClient client) {
        super(client);
    }

    public void SetToSignDetachedResource(byte[] resourceContent, String resourceUri) {
        this.resourceContent = resourceContent;
        this.resourceUri = resourceUri;
    }

    public void SetToSignDetachedResource(String resourcePath, String resourceUri) throws IOException {
        SetToSignDetachedResource(Paths.get(resourcePath), resourceUri);
    }

    public void SetToSignDetachedResource(Path resourcePath, String resourceUri) throws IOException {
        SetToSignDetachedResource(Files.readAllBytes(resourcePath), resourceUri);
    }

    /**
     * Performs the first step, should be called after setting the necessary parameters. If you intend to use
     * the Web PKI component on the client-side, use the startWithRestPki() method instead.
     *
     * @return An instance of ClientSideSignatureInstructions with the information necessary to perform the client-side
     * signature and later call the server back with the results.
     * @throws RestException if an error occurs when calling REST PKI
     */
    @Override
    public ClientSideSignatureInstructions start() throws RestException {

        if (certificate == null) {
            throw new RuntimeException("The certificate was not set");
        }
        if (signaturePolicyId == null) {
            throw new RuntimeException("The signature policy was not set");
        }
        if (resourceContent == null || resourceContent.length == 0) {
            throw new RuntimeException("The to sign resource was not set or is empty");
        }

        DetachedResourceXmlSignatureRequest request = new DetachedResourceXmlSignatureRequest();
        // common XML siganture request
        request.setXml(this.xml == null ? null : new ObjectMapper().convertValue(this.xml, String.class));
        request.setCallbackArgument(this.callbackArgument);
        request.setCertificate(this.certificate);
        request.setSecurityContextId(this.securityContextId);
        request.setSignaturePolicyId(this.signaturePolicyId);
        request.setSignatureElementLocation(this.signatureElementLocation);

        // specific values request
        request.setDetachedResourceToSignContent(new ObjectMapper().convertValue(this.resourceContent, String.class));
        request.setDetachedResourceReferenceUri(this.resourceUri);

        XmlSignaturePostResponse response = client.getRestClient().post("Api/XmlSignatures/DetachedResourceXmlSignature", request, XmlSignaturePostResponse.class);

        if (response.getCertificate() != null) {
            this.certificateInfo = new PKCertificate(response.getCertificate());
        }

        ClientSideSignatureInstructions signatureInstructions = new ClientSideSignatureInstructions(
                response.getToken(),
                response.getToSignData(),
                response.getToSignHash(),
                response.getDigestAlgorithmOid()
        );
        this.done = true;

        return signatureInstructions;
    }

    /**
     * Performs the first step, should be called after setting the necessary parameters. This method should
     * be used if the Web PKI component is being used on the client-side.
     *
     * @return The token that should be passed on the signWithRestPki method of the Web PKI component
     * (on the client-side logic).
     * @throws RestException if an error occurs when calling REST PKI
     */
    @Override
    public String startWithWebPki() throws RestException {

        if (signaturePolicyId == null) {
            throw new RuntimeException("The signature policy was not set");
        }
        if (resourceContent == null || resourceContent.length == 0) {
            throw new RuntimeException("The to sign resource was not set or is empty");
        }

        DetachedResourceXmlSignatureRequest request = new DetachedResourceXmlSignatureRequest();
        // common XML siganture request
        request.setXml(this.xml == null ? null : new ObjectMapper().convertValue(this.xml, String.class));
        request.setCallbackArgument(this.callbackArgument);
        request.setCertificate(this.certificate);
        request.setSecurityContextId(this.securityContextId);
        request.setSignaturePolicyId(this.signaturePolicyId);
        request.setSignatureElementLocation(this.signatureElementLocation);

        // specific values request
        request.setDetachedResourceToSignContent(new ObjectMapper().convertValue(this.resourceContent, String.class));
        request.setDetachedResourceReferenceUri(this.resourceUri);

        XmlSignaturePostResponse response = client.getRestClient().post("Api/XmlSignatures/DetachedResourceXmlSignature", request, XmlSignaturePostResponse.class);

        if (response.getCertificate() != null) {
            this.certificateInfo = new PKCertificate(response.getCertificate());
        }
        this.done = true;

        return response.getToken();
    }
}
