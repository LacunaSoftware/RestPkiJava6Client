package com.lacunasoftware.restpki;

public class RestUnreachableException extends RestException {
    RestUnreachableException(String verb, String url, Exception innerException) {
        super(String.format("REST action %s %s unreachable", verb, url), verb, url, innerException);
    }
}
