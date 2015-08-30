package com.lacunasoftware.restpki;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by desenv on 28/08/2015.
 */
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class RestGeneralErrorModel {
    public String message;
}
