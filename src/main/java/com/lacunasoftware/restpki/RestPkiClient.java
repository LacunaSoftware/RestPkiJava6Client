package com.lacunasoftware.restpki;

public class RestPkiClient {
	
	private String endpointUrl;
	
	public RestPkiClient(String endpointUrl) {
		this.endpointUrl = endpointUrl;
	}

	public String getEndpointUrl() {
		return endpointUrl;
	}

    RestClient getRestClient() {
        return new RestClient(endpointUrl);
    }
	
}