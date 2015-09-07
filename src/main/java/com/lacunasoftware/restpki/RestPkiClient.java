package com.lacunasoftware.restpki;

public class RestPkiClient {

    private String endpointUrl;
    private String authToken;

    public RestPkiClient(String endpointUrl, String authToken) {
        this.endpointUrl = endpointUrl;
        this.authToken = authToken;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public String getAuthToken() { return authToken; }

    RestClient getRestClient() {
        return new RestClient(endpointUrl, authToken);
    }

}
