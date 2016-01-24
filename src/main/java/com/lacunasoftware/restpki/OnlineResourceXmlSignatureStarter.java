package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class used to perform the first of the two steps required to perform a XML detached resource signature.
 * <p>
 * Note on confidentiality: the XML for the signature and the resource URI are stored on the server between
 * the first and second steps, but never unencrypted.
 * The content is encrypted using AES-128 and <b>the key is not stored on the server</b>,
 * it is instead mixed into the token that is returned and which is necessary on the second step. In other
 * words, the server stores the XML and the URI, but is unable to read it on its own, therefore the XML contents cannot be
 * compromised, even in the event of a complete data leakage.
 * </p>
 */
public class OnlineResourceXmlSignatureStarter extends XmlSignatureStarter {

    private String uri;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public OnlineResourceXmlSignatureStarter(RestPkiClient client) {
        super(client);
    }

    /**
     * Sets the URI of the resource to be downloaded and signed
     * @param uri
     */
    public void SetToSignResourceUri(String uri) {
        this.uri = uri;
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
        if (uri == null || uri.equals("")) {
            throw new RuntimeException("The online resource URI to sign was not set or is empty");
        }

        OnlineResourceXmlSignatureRequest request = new OnlineResourceXmlSignatureRequest();
        // common XML siganture request
        request.setXml(this.xml == null ? null : new ObjectMapper().convertValue(this.xml, String.class));
        request.setCallbackArgument(this.callbackArgument);
        request.setCertificate(this.certificate);
        request.setSecurityContextId(this.securityContextId);
        request.setSignaturePolicyId(this.signaturePolicyId);
        request.setSignatureElementLocation(this.signatureElementLocation);

        // specific values request
        request.setResourceToSignUri(uri);

        XmlSignaturePostResponse response = client.getRestClient().post("Api/XmlSignatures/OnlineResourceXmlSignature", request, XmlSignaturePostResponse.class);

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
        if (uri == null || uri == "") {
            throw new RuntimeException("The online resource URI to sign was not set or is empty");
        }

        OnlineResourceXmlSignatureRequest request = new OnlineResourceXmlSignatureRequest();
        // common XML siganture request
        request.setXml(this.xml == null ? null : new ObjectMapper().convertValue(this.xml, String.class));
        request.setCallbackArgument(this.callbackArgument);
        request.setCertificate(this.certificate);
        request.setSecurityContextId(this.securityContextId);
        request.setSignaturePolicyId(this.signaturePolicyId);
        request.setSignatureElementLocation(this.signatureElementLocation);

        // specific values request
        request.setResourceToSignUri(uri);

        XmlSignaturePostResponse response = client.getRestClient().post("Api/XmlSignatures/OnlineResourceXmlSignature", request, XmlSignaturePostResponse.class);

        if (response.getCertificate() != null) {
            this.certificateInfo = new PKCertificate(response.getCertificate());
        }
        this.done = true;

        return response.getToken();
    }

}
