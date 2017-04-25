package com.lacunasoftware.restpki;


import java.io.*;

public class Storage {

    public static byte[] readFile(String path) throws IOException {
        return readFile(new File(path));
    }

    public static byte[] readFile(File file) throws IOException {
        FileInputStream input = new FileInputStream(file);
        byte[] content = readStream(input);
        input.close();
        return content;
    }

    public static byte[] readStream(InputStream stream) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];
        while ((nRead = stream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }
        buffer.flush();
        return buffer.toByteArray();
    }

    public static void writeFile(String path, byte[] content) throws IOException {
        writeFile(new File(path), content);
    }

    public static void writeFile(File file, byte[] content) throws IOException {
        FileOutputStream output = new FileOutputStream(file);
        output.write(content);
        output.close();
    }
}
