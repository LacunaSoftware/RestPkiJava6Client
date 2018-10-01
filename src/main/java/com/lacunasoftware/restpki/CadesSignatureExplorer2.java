package com.lacunasoftware.restpki;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CadesSignatureExplorer2 extends SignatureExplorer2 {

    private static final String CMS_SIGNATURE_MIME_TYPE = "application/pkcs7-signature";

    private FileReference dataFile;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public CadesSignatureExplorer2(RestPkiClient client) {
        super(client);
    }

    //region SetDataFile

    /**
     * Sets the data file path (needed only for signatures without encapsulated content, aka "detached signatures")
     *
     * @param path File path of the data file.
     */
    public void setDataFile(String path) {
        setDataFile(new File(path));
    }

    /**
     * Sets the data file (needed only for signatures without encapsulated content, aka "detached signatures")
     *
     * @param file The data file.
     */
    public void setDataFile(File file) {
        this.dataFile = FileReference.fromFile(file);
    }

    /**
     * Sets the data file input stream (needed only for signatures without encapsulated content, aka "detached signatures")
     *
     * @param stream InputStream associated with the data file.
     */
    public void setDataFile(InputStream stream) {
        this.dataFile = FileReference.fromStream(stream);
    }

    /**
     * Sets the data file binary content (needed only for signatures without encapsulated content, aka "detached signatures")
     *
     * @param content binary content associated with the data file.
     */
    public void setDataFile(byte[] content) {
        this.dataFile = FileReference.fromContent(content);
    }

    //endregion

    /**
     * Performs the open signature operation.
     *
     * @return information about the signature file.
     * @throws RestException if an error occurs when calling REST PKI.
     * @throws IOException if an error occurs when trying to open the signature file or when trying to compute all
     * hashes from the original data file, both files have to be provided before this method is called.
     */
    public CadesSignature open() throws RestException, IOException {

        OpenCadesSignatureRequestModel request = getRequest(false);
        CadesSignatureModel response = client.getRestClient().post("Api/CadesSignatures/Open", request, CadesSignatureModel.class);

        CadesSignature signature = new CadesSignature(response);
        return signature;
    }

    /**
     * Performs the open signature operation and extracts the encapsulated content.
     *
     * @return the signature information along with the extracted encapsulated content.
     * @throws RestException if an error occurs when calling REST PKI.
     * @throws IOException if an error occurs when trying to open the signature file or when trying to compute all the
     * data hashes of the data file, both files had to be provided before this method was called.
     */
    public CadesSignatureWithEncapsulatedContent openAndExtractContent() throws RestException, IOException {

        OpenCadesSignatureRequestModel request = getRequest(true);
        CadesSignatureModel response = client.getRestClient().post("Api/CadesSignatures/Open", request, CadesSignatureModel.class);

        CadesSignature signature = new CadesSignature(response);
        FileResult encapsulatedContent = new FileResult(client, response.getEncapsulatedContent());
        return new CadesSignatureWithEncapsulatedContent(signature, encapsulatedContent);
    }

    private OpenCadesSignatureRequestModel getRequest(boolean extractEncapsulatedContent) throws RestException, IOException {

        if (signatureFile == null) {
            throw new RuntimeException("The signature file to open was not set");
        }

        List<DigestAlgorithmAndValueModel> dataHashes = null;
        if (dataFile != null) {
            List<DigestAlgorithm> requiredHashes = getRequiredHashes();
            if (!requiredHashes.isEmpty()) {
                dataHashes = dataFile.computeDataHashes(requiredHashes);
            }
        }

        OpenCadesSignatureRequestModel request = new OpenCadesSignatureRequestModel();
        request.setExtractEncapsulatedContent(extractEncapsulatedContent);
        request.setDataHashes(dataHashes);
        return fillRequest(request);
    }

    private OpenCadesSignatureRequestModel fillRequest(OpenCadesSignatureRequestModel request) throws RestException, IOException {

        request.setValidate(validate);
        request.setDefaultSignaturePolicyId(defaultSignaturePolicyId);
        request.setSecurityContextId(securityContextId);
        request.setIgnoreRevocationStatusUnknown(ignoreRevocationStatusUnknown);
        if (acceptableExplicitPolicies != null) {
            List<String> policyIds = new ArrayList<String>();
            for (SignaturePolicy policy : acceptableExplicitPolicies.getPolicies()) {
                policyIds.add(policy.getId());
            }
            request.setAcceptableExplicitPolicies(policyIds);
        }
        request.setFile(signatureFile.uploadOrReference(client));
        return request;
    }

    private List<DigestAlgorithm> getRequiredHashes() throws RestException, IOException {

        FileModel request = signatureFile.uploadOrReference(client);
        List<DigestAlgorithmAndValueModel.AlgorithmEnum> response = Arrays.asList(client.getRestClient().post("Api/CadesSignatures/RequiredHashes", request, DigestAlgorithmAndValueModel.AlgorithmEnum[].class));
        List<DigestAlgorithm> algs = new ArrayList<DigestAlgorithm>();
        for (DigestAlgorithmAndValueModel.AlgorithmEnum algModel : response) {
            algs.add(DigestAlgorithm.getInstanceByApiModel(algModel));
        }
        return algs;
    }
}
