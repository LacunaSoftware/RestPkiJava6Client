package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel.AlgorithmEnum;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
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

    private File dataFile;
    private InputStream dataFileStream;

    public CadesSignatureExplorer(RestPkiClient client) {
        super(client);
    }

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
        this.dataFile = file;
    }

    /**
     * Sets the data file input stream (needed only for signatures without encapsulated content, aka "detached signatures")
     *
     * @param stream InputStream associated with the data file.
     */
    public void setDataFile(InputStream stream) {
        this.dataFileStream = stream;
    }

    /**
     * Performs the open signature operation.
     * @return information about the signature file.
     * @throws RestException if an error occurs when calling REST PKI
     */
    public CadesSignature open() throws RestException, IOException {

        if (signatureFileContent == null) {
            throw new RuntimeException("The signature file to open was not set");
        }

        List<DigestAlgorithmAndValueModel> dataHashes = null;
        if (dataFileStream != null || dataFile != null) {
            List<DigestAlgorithm> requiredHashes = getRequiredHashes();
            if (requiredHashes.size() > 0) {
                if (dataFileStream != null) {
                    dataHashes = computeDataHashes(dataFileStream, requiredHashes);
                } else {
                    InputStream fileStream = new FileInputStream(dataFile);
                    try {
                        dataHashes = computeDataHashes(fileStream, requiredHashes);
                    } finally {
                        fileStream.close();
                    }
                }
            }
        }

        OpenSignatureRequestModel request = getRequest(CMS_SIGNATURE_MIME_TYPE);
        request.setDataHashes(dataHashes);
        CadesSignatureModel response = client.getRestClient().post("Api/CadesSignatures/Open", request, CadesSignatureModel.class);
        CadesSignature signature = new CadesSignature(response);
        return signature;
    }

    private List<DigestAlgorithm> getRequiredHashes() throws RestException {
        FileModel request = new FileModel();
        request.setContent(Util.encodeBase64(signatureFileContent));
        request.setMimeType(CMS_SIGNATURE_MIME_TYPE);
        List<AlgorithmEnum> response = Arrays.asList(client.getRestClient().post("Api/CadesSignatures/RequiredHashes", request, AlgorithmEnum[].class));
        List<DigestAlgorithm> algs = new ArrayList<DigestAlgorithm>();
        for (AlgorithmEnum algModel : response) {
            algs.add(DigestAlgorithm.getInstanceByApiModel(algModel));
        }
        return algs;
    }

    private List<DigestAlgorithmAndValueModel> computeDataHashes(InputStream dataFileStream, List<DigestAlgorithm> algorithms) throws IOException {

        // http://stackoverflow.com/a/19304310

        List<DigestInputStream> digestStreams = new ArrayList<DigestInputStream>();
        InputStream outermostStream = dataFileStream;
        for (DigestAlgorithm digestAlg : algorithms) {
            DigestInputStream digestStream = new DigestInputStream(outermostStream, digestAlg.getSpi());
            digestStreams.add(digestStream);
            outermostStream = digestStream;
        }

        byte[] buffer = new byte[8192];
        while (outermostStream.read(buffer) != -1) {
            // do nothing
        }

        List<DigestAlgorithmAndValueModel> dataHashes = new ArrayList<DigestAlgorithmAndValueModel>();
        for (int i = 0; i < algorithms.size(); i++) {
            DigestAlgorithm digestAlg = algorithms.get(i);
            DigestInputStream digestStream = digestStreams.get(i);
            byte[] digestValue = digestStream.getMessageDigest().digest();
            DigestAlgorithmAndValueModel dataHash = new DigestAlgorithmAndValueModel();
            dataHash.setAlgorithm(digestAlg.getDigestAlgorithmAndValueModelEnum());
            dataHash.setValue(Util.encodeBase64(digestValue));
            dataHashes.add(dataHash);
        }

        return dataHashes;
    }
}
