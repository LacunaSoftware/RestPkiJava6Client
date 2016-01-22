package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by BrunoD on 22/01/2016.
 */
public class XmlElementSignatureStarter extends XmlSignatureStarter {

    private String toSignElementId;
    private XmlIdResolutionTable idResolutionTable;

    public XmlElementSignatureStarter(RestPkiClient client) {
        super(client);
    }

    public void setElementToSIgnId(String elementId) {
        this.toSignElementId = elementId;
    }

    public void setIdResolutionTable(XmlIdResolutionTable idResolutionTable) {
        this.idResolutionTable = idResolutionTable;
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

        if (xml == null) {
            throw new RuntimeException("The XML to sign was not set");
        }
        if (certificate == null) {
            throw new RuntimeException("The certificate was not set");
        }
        if (signaturePolicyId == null) {
            throw new RuntimeException("The signature policy was not set");
        }
        if (toSignElementId == null) {
            throw new RuntimeException("The to sign element Id was not set");
        }

        XmlElementSignaturePostRequest request = new XmlElementSignaturePostRequest();
        // common XML siganture request
        request.setXml(new ObjectMapper().convertValue(this.xml, String.class));
        request.setCallbackArgument(this.callbackArgument);
        request.setCertificate(this.certificate);
        request.setSecurityContextId(this.securityContextId);
        request.setSignaturePolicyId(this.signaturePolicyId);
        request.setSignatureElementLocation(this.signatureElementLocation);

        // specific values request
        request.setElementToSignId(this.toSignElementId);
        request.setIdResolutionTable(this.idResolutionTable == null ? null : this.idResolutionTable.toModel());

        XmlSignaturePostResponse response = client.getRestClient().post("Api/XmlSignatures/XmlElementSignature", request, XmlSignaturePostResponse.class);

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

        if (xml == null) {
            throw new RuntimeException("The XML to sign was not set");
        }
        if (signaturePolicyId == null) {
            throw new RuntimeException("The signature policy was not set");
        }
        if (toSignElementId == null) {
            throw new RuntimeException("The to sign element Id was not set");
        }

        XmlElementSignaturePostRequest request = new XmlElementSignaturePostRequest();
        // common XML siganture request
        request.setXml(new ObjectMapper().convertValue(this.xml, String.class));
        request.setCallbackArgument(this.callbackArgument);
        request.setCertificate(this.certificate);
        request.setSecurityContextId(this.securityContextId);
        request.setSignaturePolicyId(this.signaturePolicyId);
        request.setSignatureElementLocation(this.signatureElementLocation);
        // specific values request
        request.setElementToSignId(this.toSignElementId);
        request.setIdResolutionTable(this.idResolutionTable == null ? null : this.idResolutionTable.toModel());

        XmlSignaturePostResponse response = client.getRestClient().post("Api/XmlSignatures/XmlElementSignature", request, XmlSignaturePostResponse.class);

        if (response.getCertificate() != null) {
            this.certificateInfo = new PKCertificate(response.getCertificate());
        }
        this.done = true;

        return response.getToken();
    }

}
