package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel.AlgorithmEnum;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class used to open a CAdES signature file (.p7s file) and optionally validate its signatures.
 */
public class CadesSignatureExplorer extends SignatureExplorer {

    private static final String CMS_SIGNATURE_MIME_TYPE = "application/pkcs7-signature";

    private Path dataFilePath;
    private InputStream dataFileStream;

    public CadesSignatureExplorer(RestPkiClient client) {
        super(client);
    }

    public void setDataFile(String path) {
        setDataFile(Paths.get(path));
    }

    public void setDataFile(Path path) {
        this.dataFilePath = path;
    }

    public void setDataFile(InputStream stream) {
        this.dataFileStream = stream;
    }

    public CadesSignature open() throws RestException, IOException {

        if (signatureFileContent == null) {
            throw new RuntimeException("The signature file to open not set");
        }

        List<DigestAlgorithmAndValueModel> dataHashes = null;
        if (dataFileStream != null || dataFilePath != null) {
            List<DigestAlgorithm> requiredHashes = getRequiredHashes();
            if (requiredHashes.size() > 0) {
                if (dataFileStream != null) {
                    dataHashes = computeDataHashes(dataFileStream, requiredHashes);
                } else {
                    InputStream fileStream = Files.newInputStream(dataFilePath);
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
