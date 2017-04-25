package com.lacunasoftware.restpki;

import java.io.*;
import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.List;

class FileReference {

    private InputStream stream;
    private File file;
    private String blobToken;
    private String contentBase64;

    private FileReference() { }

    static FileReference fromStream(InputStream stream) {
        FileReference file = new FileReference();
        file.stream = stream;
        return file;
    }

    static FileReference fromFile(String path) {
        return fromFile(new File(path));
    }

    static FileReference fromFile(File file) {
        FileReference reference = new FileReference();
        reference.file = file;
        return reference;
    }

    static FileReference fromContent(byte[] contentRaw) {
        FileReference reference = new FileReference();
        reference.contentBase64 = Util.encodeBase64(contentRaw);
        return reference;
    }

    static FileReference fromContent(String contentBase64) {
        FileReference reference = new FileReference();
        reference.contentBase64 = contentBase64;
        return reference;
    }

    static FileReference fromResult(FileResult result) {

        if (result.file.getBlobToken() != null) {
            FileReference reference = new FileReference();
            reference.blobToken = result.file.getBlobToken();
            return reference;
        } else {
            return fromContent(result.file.getContent());
        }
    }

    FileModel uploadOrReference(RestPkiClient client) throws RestException, IOException {

        if (blobToken != null) {

            FileModel file = new FileModel();
            file.setBlobToken(blobToken);
            return file;

        } else if (contentBase64 != null && Util.decodeBase64(contentBase64).length < client.getMultipartUploadThreshold()) {

            FileModel file = new FileModel();
            file.setContent(contentBase64);
            return file;

        } else {

            InputStream s = openOrUseExistingStream();
            if (s.available() < client.getMultipartUploadThreshold()) {

                FileModel file = new FileModel();
                file.setContent(Util.encodeBase64(Storage.readStream(s)));
                return file;

            } else {

                java.lang.Object uploadResult = client.uploadOrRead(s);
                FileModel file = new FileModel();
                if (uploadResult instanceof String) {
                    blobToken = (String)uploadResult;
                    file.setBlobToken(blobToken);
                } else {
                    file.setContent(Util.encodeBase64((byte[])uploadResult));
                }
                return file;

            }

        }
    }

    byte[] getContent() throws IOException {
        return getContentRaw();
    }

    byte[] getContentRaw() throws IOException {

        if (contentBase64 != null) {
            return Util.decodeBase64(contentBase64);
        } else {
            InputStream s = openOrUseExistingStream();
            return Storage.readStream(s);
        }
    }

    String getContentBase64() throws IOException {

        if (contentBase64 != null) {
            return contentBase64;
        } else {
            InputStream s = openOrUseExistingStream();
            return Util.encodeBase64(Storage.readStream(s));
        }

    }

    List<DigestAlgorithmAndValueModel> computeDataHashes(List<DigestAlgorithm> algorithms) throws IOException {

        List<DigestInputStream> digestStreams = new ArrayList<DigestInputStream>();
        InputStream outermostStream = openOrUseExistingStream();
        for (DigestAlgorithm digestAlg : algorithms) {
            DigestInputStream digestStream = new DigestInputStream(outermostStream, digestAlg.getSpi());
            digestStreams.add(digestStream);
            outermostStream = digestStream;
        }

        byte[] buffer = new byte[4 * 1024 * 1024]; // 4MB
        while (outermostStream.read(buffer) != -1) {
            //do nothing
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

    private InputStream openOrUseExistingStream() throws IOException  {

        if (stream != null) {
            return stream;
        } else if (contentBase64 != null) {
            return new ByteArrayInputStream(getContent());
        } else if (file != null) {
            return new FileInputStream(file);
        } else {
            throw new RuntimeException();
        }
    }
}
