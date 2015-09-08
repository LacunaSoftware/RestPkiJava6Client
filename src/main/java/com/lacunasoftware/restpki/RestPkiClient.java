package com.lacunasoftware.restpki;

/**
 * Class used to call the REST PKI API.
 */
public class RestPkiClient {

    private String endpointUrl;
    private String authToken;

    /**
     * Create a new instance of the class passing the URL for the REST PKI API and the access token to be used
     * for authenticating with the service.
     * <p>
     *     If you do not have an access token, you can get one on the REST PKI website.
     * </p>
     * @param endpointUrl The URL for the REST PKI API, terminated in a slash (/), for instance "https://restpki.lacunasoftware.com/" (this might be different if you are using a on-premises instance).
     * @param authToken The access token to be used for authenticating with the service.
     */
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
