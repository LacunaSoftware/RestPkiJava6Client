package com.lacunasoftware.restpki;

import java.net.Proxy;

/**
 * Class used to call the REST PKI API.
 */
public class RestPkiClient {

	private String endpointUrl;
	private String authToken;
	private Proxy proxy;

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
		this(endpointUrl, authToken, null);
	}

	/**
	 * Create a new instance of the class passing the URL for the REST PKI API and the access token to be used
	 * for authenticating with the service, using a proxy for communication.
	 * <p>
	 *     If you do not have an access token, you can get one on the REST PKI website.
	 * </p>
	 * @param endpointUrl The URL for the REST PKI API, terminated in a slash (/), for instance "https://restpki.lacunasoftware.com/" (this might be different if you are using a on-premises instance).
	 * @param authToken The access token to be used for authenticating with the service.
	 * @param proxy The proxy settings to be used for communication.
	 */
	public RestPkiClient(String endpointUrl, String authToken, Proxy proxy) {
		this.endpointUrl = endpointUrl;
		this.authToken = authToken;
		this.proxy = proxy;
	}

	public String getEndpointUrl() {
		return endpointUrl;
	}

	public String getAuthToken() {
		return authToken;
	}

	RestClient getRestClient() {
		return new RestClient(endpointUrl, authToken, proxy);
	}

}
