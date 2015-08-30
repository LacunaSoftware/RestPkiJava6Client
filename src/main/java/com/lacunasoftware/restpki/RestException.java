package com.lacunasoftware.restpki;

public abstract class RestException extends Exception {

    private String verb;
    private String url;

    RestException(String message, String verb, String url) {
        this(message, verb, url, null);
    }

    RestException(String message, String verb, String url, Exception innerException) {
        super(message, innerException);
        this.verb = verb;
        this.url = url;
    }

    public String getVerb() {
        return verb;
    }

    public String getUrl() {
        return url;
    }
}
