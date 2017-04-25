package com.lacunasoftware.restpki;

import java.io.*;

public class FileResult {

    FileModel file;
    private RestPkiClient client;

    FileResult(RestPkiClient client, FileModel file) {
        this.client = client;
        this.file = file;
    }

    /**
     * Get content stream from this file.
     *
     * @return content of the this file
     * @throws RestException if an error occurs when trying to get the file from a url.
     */
    public byte[] getContent() throws RestException {

        if(file.getContent() != null) {
            return Util.decodeBase64(file.getContent());
        } else {
            return client.getRestClient().downloadContent(file.getUrl());
        }
    }

    /**
     * Write this file content in some file which has the provided path.
     *
     * @throws RestException if an error occurs when trying to get the file from a url.
     * @throws IOException if an error occurs when trying to create or open the destination file.
     */
    public void writeToFile(File file) throws RestException, IOException {
        byte[] content = getContent();
        Storage.writeFile(file, content);
    }

    /**
     * Write this file content in some file which has the provided path.
     *
     * @param path Path of file that will be written.
     * @throws RestException if an error occurs when trying to get the file from a url.
     * @throws IOException if an error occurs when trying to create or open the destination file.
     */
    public void writeToFile(String path) throws RestException, IOException {
        FileOutputStream outStream = new FileOutputStream(path);
        outStream.write(getContent());
        outStream.close();
    }
}
