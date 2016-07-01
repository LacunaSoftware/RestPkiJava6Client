package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Util {

	public static String repeatChar(char c, int count) {
		char[] array = new char[count];
		Arrays.fill(array, c);
		return new String(array);
	}
	
	public static boolean isNullOrEmpty(String s) {
		return (s == null || s.isEmpty());
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

    public static byte[] decodeBase64(String s) {
        return new ObjectMapper().convertValue(s, byte[].class);
    }

    public static String encodeBase64(byte[] content) {
        return new ObjectMapper().convertValue(content, String.class);
    }
	
//	public static String joinStrings(String separator, Collection<String> parts) {
//		StringBuilder text = new StringBuilder();
//		for (String part : parts) {
//			if (text.length() > 0) {
//				text.append(separator);
//			}
//			text.append(part);
//		}
//		return parts.toString();
//	}
	
//	public static <F, T> List<T> convertAll(Collection<F> from, Function<F, T> transformer) {
//		List<T> to = new ArrayList<T>();
//		for (F item : from) {
//			to.add(transformer.apply(item));
//		}
//		return to;
//	}
	
//	public static void appendRepeating(StringBuilder sb, char c, int count) {
//		for (int i = 0; i < count; i++) {
//			sb.append(c);
//		}
//	}

}
