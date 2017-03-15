package com.lacunasoftware.restpki;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileResult {

    FileModel file;
    private RestPkiClient client;

    FileResult(RestPkiClient client, FileModel file) {
        this.client = client;
        this.file = file;
    }

    /**
     * Open the content stream from this file or read the stream from a provided url.
     * It depends on what information was provided to this file, its url or its
     * content stream.
     *
     * @return byte array from the read file
     * @throws RestException if an error occurs when trying to get the file from a url.
     */
    public byte[] openRead() throws RestException {

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
    public void writeToFile(Path path) throws RestException, IOException {
        byte[] content = openRead();
        Files.write(path, content);
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
        outStream.write(openRead());
        outStream.close();
    }

    /**
     * Get content stream from this file.
     *
     * @return content of the this file
     * @throws RestException if an error occurs when trying to get the file from a url.
     */
    public byte[] getContent() throws RestException {
        return openRead();
    }
}
