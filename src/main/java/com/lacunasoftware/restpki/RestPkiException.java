package com.lacunasoftware.restpki;

public class RestPkiException extends RestException {

    private ErrorCodes errorCode;
    private String detail;

    RestPkiException(String verb, String url, ErrorCodes errorCode, String detail) {
        super(formatExceptionMessage(verb, url, errorCode, detail), verb, url);
        this.errorCode = errorCode;
        this.detail = detail;
    }

    private static String formatExceptionMessage(String verb, String url, ErrorCodes errorCode, String detail) {
        if (Util.isNullOrEmpty(detail)) {
            return String.format("REST PKI action %s %s error: %s", verb, url, errorCode);
        } else {
            return String.format("REST PKI action %s %s error: %s (%s)", verb, url, errorCode, detail);
        }
    }

    public ErrorCodes getErrorCode() {
        return errorCode;
    }

    public String getDetail() {
        return detail;
    }
}
