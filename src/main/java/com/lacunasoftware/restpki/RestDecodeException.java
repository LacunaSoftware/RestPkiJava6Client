package com.lacunasoftware.restpki;

/**
 * Created by desenv on 28/08/2015.
 */
public class RestDecodeException extends RestException {

    RestDecodeException(String verb, String url, Exception innerException) {
        super(formatExceptionMessage(verb, url), verb, url, innerException);
    }

    private static String formatExceptionMessage(String verb, String url) {
        return String.format("REST action %s %s returned success but an error occurred decoding the response (see inner exception for details)", verb, url);
    }
}
