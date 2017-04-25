package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.util.Arrays;

class Util {

	public static String repeatChar(char c, int count) {
		char[] array = new char[count];
		Arrays.fill(array, c);
		return new String(array);
	}
	
	public static boolean isNullOrEmpty(String s) {
		return (s == null || s.isEmpty());
	}

    public static byte[] decodeBase64(String s) {
        return new ObjectMapper().convertValue(s, byte[].class);
    }

    public static String encodeBase64(byte[] content) {
        return new ObjectMapper().convertValue(content, String.class);
    }

    static ColorModel convertColorToModel(Color color) {
        ColorModel model = new ColorModel();
        model.setAlpha(color.getAlpha() / 2.55); // alpha in Rest PKI is 0-100
        model.setRed(color.getRed());
        model.setGreen(color.getGreen());
        model.setBlue(color.getBlue());
        return model;
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
