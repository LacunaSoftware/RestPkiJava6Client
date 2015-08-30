package com.lacunasoftware.restpki;

/**
 * Created by desenv on 28/08/2015.
 */
public class ValidationException extends RestException {

    private ValidationResults validationResults;

    ValidationException(String verb, String url, ValidationResults vr) {
        super(vr.toString(), verb, url);
        this.validationResults = vr;
    }

    public ValidationResults getValidationResults() {
        return validationResults;
    }
}
