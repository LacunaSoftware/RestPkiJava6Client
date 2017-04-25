package com.lacunasoftware.restpki;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CadesSignatureStarter2 extends SignatureStarter2 {

    private FileReference fileToSign;
    private FileReference cmsToCoSign;
    private Boolean encapsulateContent;
    private List<DigestAlgorithm> digestAlgorithmsForDetachedSignature;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public CadesSignatureStarter2(RestPkiClient client) {
        super(client);
        digestAlgorithmsForDetachedSignature = new ArrayList<DigestAlgorithm>();
        digestAlgorithmsForDetachedSignature.add(DigestAlgorithm.SHA1);
        digestAlgorithmsForDetachedSignature.add(DigestAlgorithm.SHA256);
    }

    //region setContentToSign / setFileToSign

    /**
     * Sets the content to be signed
     *
     * @param stream a pre-opened InputStream linked to the file that will be signed. The stream is NOT closed by this
     *                  method.
     */
    public void setContentToSign(InputStream stream) {
        this.fileToSign = FileReference.fromStream(stream);
    }

    /**
     * Sets the content to be signed as a byte array
     *
     * @param content Binary content to be signed
     */
    public void setContentToSign(byte[] content) {
        this.fileToSign = FileReference.fromContent(content);
    }

    /**
     * Sets the path of the file to be signed
     *
     * @param path Path of the file to be signed.
     */
    public void setFileToSign(String path) {
        setFileToSign(new File(path));
    }

    /**
     * Sets the file to be signed
     *
     * @param file The file to be signed.
     */
    public void setFileToSign(File file) {
        this.fileToSign = FileReference.fromFile(file);
    }

    //endregion

    //region setCmsToCoSign

    /**
     * Sets the CMS to be co-signed
     *
     * @param stream a pre-opened InputStream linked to the CMS file that will be co-signed. The stream is NOT closed by
     *               this method.
     */
    public void setCmsToCoSign(InputStream stream) {
        this.cmsToCoSign = FileReference.fromStream(stream);
    }

    /**
     * Sets the CMS to be co-signed as a byte array
     *
     * @param cmsToCoSign Binary content of the CMS to be co-signed
     */
    public void setCmsToCoSign(byte[] cmsToCoSign) {
        this.cmsToCoSign = FileReference.fromContent(cmsToCoSign);
    }

    /**
     * Sets the path of the CMS file to be co-signed
     *
     * @param path Path of the CMS file to be co-signed.
     */
    public void setCmsToCoSign(String path) {
        setCmsToCoSign(new File(path));
    }

    /**
     * Sets the CMS file to be co-signed
     *
     * @param file The CMS file to be co-signed.
     */
    public void setCmsToCoSign(File file) {
        this.cmsToCoSign = FileReference.fromFile(file);
    }

    /**
     * Sets the file resulted from a previous signature to be co-signed
     *
     * @param fileResult FileResult from another signature process
     */
    public void SetCmsToCoSign(FileResult fileResult) {
        this.cmsToCoSign = FileReference.fromResult(fileResult);
    }

    //endregion

    /**
     * Optionally denotes whether the resulting CMS should include the content signed. If omitted or set to null, the
     * following rules apply:
     * <p>If no CmsToSign is given, the resulting CMS will include the content</p>
     * <p>If a CmsToCoSign is given, the resulting CMS will include the content if and only if the CmsToCoSign also
     * includes the content</p>
     */
    public void setEncapsulateContent(Boolean encapsulateContent) {
        this.encapsulateContent = encapsulateContent;
    }

    /**
     * Performs the first step, should be called after setting the necessary parameters. If you intend to use
     * the Web PKI component on the client-side, use the startWithWebPki() method instead.
     *
     * @return An instance of SignatureStartResult with the information necessary to perform the client-side
     * signature and later call the server back with the results.
     * @throws RestException if an error occurs when calling REST PKI.
     * @throws IOException if an error occurs when trying to obtain the file to be signed or be cosign or when trying
     * to compute all hashes from this file, both files had to be provided before this method is called.
     */
    @Override
    public SignatureStartResult start() throws RestException, IOException {

        if (certificate == null) {
            throw new RuntimeException("The certificate was not set");
        }

        CadesSignaturePostResponse response = startCommon();

        return new SignatureStartResult(
            response.getToken(),
            response.getCertificate(),
            response.getToSignData(),
            response.getToSignHash(),
            response.getDigestAlgorithmOid()
        );
    }

    /**
     * Performs the first step, should be called after setting the necessary parameters. This method should
     * be used if the Web PKI component is being used on the client-side.
     *
     * @return An instance of SignatureStartWithWebPkiResult containing the token that should be passed on the
     * signWithRestPki() method of the Web PKI component (on the client-side logic) and the signer's certificate.
     * @throws RestException if an error occurs when calling REST PKI.
     * @throws IOException if an error occurs when trying to obtain the file to be signed or be cosign or when trying
     * to compute all hashes from this file, both files had to be provided before this method is called.
     */
    @Override
    public SignatureStartWithWebPkiResult startWithWebPki() throws RestException, IOException {

        CadesSignaturePostResponse response = startCommon();

        return new SignatureStartWithWebPkiResult(
            response.getToken(),
            response.getCertificate()
        );
    }

    private CadesSignaturePostResponse startCommon() throws RestException, IOException {

        int apiVersion = client.getApiVersion(Apis.StartCades);
        switch (apiVersion) {
            case 1:
                return startCommonV1();
            case 2:
                return startCommonV2();
            default:
                return startCommonV3();
        }
    }

    private CadesSignaturePostResponse startCommonV3() throws RestException, IOException {

        if (fileToSign == null && cmsToCoSign == null) {
            throw new RuntimeException("The content to sign was not set and no CMS to be co-signed was given");
        }
        if (signaturePolicyId == null) {
            throw new RuntimeException("The signature policy was not set");
        }

        CadesSignaturePostRequestV3 request = new CadesSignaturePostRequestV3();
        request.setCertificate(certificate);
        request.setSignaturePolicyId(signaturePolicyId);
        request.setSecurityContextId(securityContextId);
        request.setCallbackArgument(callbackArgument);
        request.setEncapsulateContent(encapsulateContent);

        if (fileToSign != null) {
            if (!encapsulateContent) {
                request.setDataHashes(fileToSign.computeDataHashes(digestAlgorithmsForDetachedSignature));
            } else {
                request.setFileToSign(fileToSign.uploadOrReference(client));
            }
        }

        if (cmsToCoSign != null) {
            request.setCmsToCoSign(cmsToCoSign.uploadOrReference(client));
        }

        return client.getRestClient().post("Api/v3/CadesSignatures", request, CadesSignaturePostResponse.class);
    }

    private CadesSignaturePostResponse startCommonV2() throws RestException, IOException {

        if (fileToSign == null && cmsToCoSign == null) {
            throw new RuntimeException("The content to sign was not set and no CMS to be co-signed was given");
        }
        if (signaturePolicyId == null) {
            throw new RuntimeException("The signature policy was not set");
        }

        CadesSignaturePostRequestV2 request = new CadesSignaturePostRequestV2();
        request.setCertificate(certificate);
        request.setSignaturePolicyId(signaturePolicyId);
        request.setSecurityContextId(securityContextId);
        request.setCallbackArgument(callbackArgument);
        request.setEncapsulateContent(encapsulateContent);

        if (fileToSign != null) {
            if (!encapsulateContent) {
                request.setDataHashes(fileToSign.computeDataHashes(digestAlgorithmsForDetachedSignature));
            } else {
                request.setContentToSign(fileToSign.getContentBase64());
            }
        }

        if (cmsToCoSign != null) {
            request.setCmsToCoSign(cmsToCoSign.getContentBase64());
        }

        return client.getRestClient().post("Api/v2/CadesSignatures", request, CadesSignaturePostResponse.class);
    }

    private CadesSignaturePostResponse startCommonV1() throws RestException, IOException {

        if (fileToSign == null && cmsToCoSign == null) {
            throw new RuntimeException("The content to sign was not set and no CMS to be co-signed was given");
        }
        if (signaturePolicyId == null) {
            throw new RuntimeException("The signature policy was not set");
        }

        CadesSignaturePostRequest request = new CadesSignaturePostRequest();
        request.setCertificate(certificate); // may be null
        request.setSignaturePolicyId(signaturePolicyId);
        request.setSecurityContextId(securityContextId);
        request.setCallbackArgument(callbackArgument);
        request.setEncapsulateContent(encapsulateContent);

        if (fileToSign != null) {
            request.setContentToSign(fileToSign.getContentBase64());
        }

        if (cmsToCoSign != null) {
            request.setCmsToCoSign(cmsToCoSign.getContentBase64());
        }

        return client.getRestClient().post("Api/CadesSignatures", request, CadesSignaturePostResponse.class);
    }
}
