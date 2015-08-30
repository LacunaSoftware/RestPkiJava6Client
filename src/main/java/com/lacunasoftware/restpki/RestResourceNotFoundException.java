package com.lacunasoftware.restpki;

/**
 * Created by desenv on 28/08/2015.
 */
public class RestResourceNotFoundException extends RestException {

    private String resourceName;
    private String resourceId;

    RestResourceNotFoundException(String verb, String url, String resourceName, String resourceId) {
        super(formatExceptionMessage(verb, url, resourceName, resourceId), verb, url);
        this.resourceName = resourceName;
        this.resourceId = resourceId;
    }

    private static String formatExceptionMessage(String verb, String url, String resourceName, String resourceId) {
        return String.format("REST action %s %s returned resource not found: %s %s", verb, url, resourceName, resourceId);
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getResourceId() {
        return resourceId;
    }
}
