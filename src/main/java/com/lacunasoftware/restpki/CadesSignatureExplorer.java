package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel.AlgorithmEnum;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class used to open a CAdES signature file (.p7s file) and optionally validate its signatures.
 * <p>
 *     By default, the signature file is only opened but not validated. In order to validate the file, you must
 *     call the method setValidate and also the methods regarding signature policies, which specify the parameters
 *     for the validation.
 * </p>
 * <p>
 *     CAdES signature files may or may not have embedded the original file that was signed (the "data file"), which is
 *     called having an "encapsulated content". Files with the original file embedded are called "attached signatures",
 *     whereas files without it are called "detached signatures". This class supports both kinds of files. However, when
 *     opening detached signatures, it is necessary to provide not only the CAdES signature file but also the data file.
 * </p>
 * <p>
 *     Implementation notice: when opening detached signatures, the data file is not uploaded to Rest PKI, only its
 *     digest(s), which allows for efficient opening of detached CAdES signatures from very large data files.
 * </p>
 */
public class CadesSignatureExplorer extends SignatureExplorer {

    private static final String CMS_SIGNATURE_MIME_TYPE = "application/pkcs7-signature";

    private FileReference dataFile;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public CadesSignatureExplorer(RestPkiClient client) {
        super(client);
    }

    //region SetDataFile

    /**
     * Sets the data file path (needed only for signatures without encapsulated content, aka "detached signatures")
     *
     * @param path File path of the data file.
     */
    public void setDataFile(String path) {
        setDataFile(Paths.get(path));
    }

    /**
     * Sets the data file path (needed only for signatures without encapsulated content, aka "detached signatures")
     *
     * @param path File path of the data file.
     */
    public void setDataFile(Path path) {
        this.dataFile = FileReference.fromFile(path);
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
     * Sets the data file byte array (needed only for signatures without encapsulated content, aka "detached signatures")
     *
     * @param content byte array associated with the data file.
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
     * hashes from the original data file, both files had to be provided before this method is called.
     */
    public CadesSignature open() throws RestException, IOException {

        OpenSignatureRequestModel request = getRequest(false);
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

        OpenSignatureRequestModel request = getRequest(true);
        CadesSignatureModel response = client.getRestClient().post("Api/CadesSignatures/Open", request, CadesSignatureModel.class);

        CadesSignature signature = new CadesSignature(response);
        FileResult encapsulatedContent = new FileResult(client, response.getEncapsulatedContent());
        return new CadesSignatureWithEncapsulatedContent(signature, encapsulatedContent);
    }

    private OpenSignatureRequestModel getRequest(boolean extractEncapsulatedContent) throws RestException, IOException {

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

    private List<DigestAlgorithm> getRequiredHashes() throws RestException, IOException {

        FileModel request = signatureFile.uploadOrReference(client);
        List<AlgorithmEnum> response = Arrays.asList(client.getRestClient().post("Api/CadesSignatures/RequiredHashes", request, AlgorithmEnum[].class));
        List<DigestAlgorithm> algs = new ArrayList<DigestAlgorithm>();
        for (AlgorithmEnum algModel : response) {
            algs.add(DigestAlgorithm.getInstanceByApiModel(algModel));
        }
        return algs;
    }
}
