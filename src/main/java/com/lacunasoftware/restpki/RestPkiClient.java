package com.lacunasoftware.restpki;

import java.io.IOException;
import java.io.InputStream;
import java.lang.*;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class used to call the REST PKI API.
 */
public class RestPkiClient {

	private String endpointUrl;
	private String authToken;
	private Proxy proxy;
	private boolean multipartUploadDoubleCheck;
	private int multipartUploadThreshold = 5 * 1024 * 1024; // 5 MB
	private Version restPkiVersion;
	private static Map<String, Version> endpointVersions = new HashMap<String, Version>();


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

	//region Attributes Getters/Setters

	public String getEndpointUrl() {
		return endpointUrl;
	}

	public String getAuthToken() {
		return authToken;
	}

	public boolean getMultipartUploadDoubleCheck() {
		return multipartUploadDoubleCheck;
	}

	public void setMultipartUploadDoubleCheck(boolean multipartUploadDoubleCheck) {
		this.multipartUploadDoubleCheck = multipartUploadDoubleCheck;
	}

	public int getMultipartUploadThreshold() {
		return multipartUploadThreshold;
	}

	public void setMultipartUploadThreshold(int multipartUploadThreshold) {
		this.multipartUploadThreshold = multipartUploadThreshold;
	}

	public Version getRestPkiVersion() {
		return restPkiVersion;
	}

	public void setRestPkiVersion(Version restPkiVersion) {
		this.restPkiVersion = restPkiVersion;
	}

	//endregion

	RestClient getRestClient() {
		return new RestClient(endpointUrl, authToken, proxy);
	}

	public Authentication getAuthentication() {
		return new Authentication(this);
	}

	java.lang.Object uploadOrRead(InputStream stream) throws IOException, RestException {

		int apiVersion = getApiVersion(Apis.MultipartUpload);

		switch (apiVersion) {
			case 0:
				return read(stream);
			default:
				return upload(stream);
		}
	}

	byte[] read(InputStream stream) throws IOException {
		return Storage.readStream(stream);
	}

	String upload(InputStream stream) throws RestException {

		// Begin the upload

		MultipartUploadBeginResponse beginResponse = getRestClient().post("Api/MultipartUploads", null, MultipartUploadBeginResponse.class);

		String blobToken = beginResponse.getBlobToken();
		String blobUri = String.format("Api/MultipartUploads/%s", blobToken);
		int partSize = beginResponse.getPartSize();

		// Read the file part by part

		byte[] buffer = new byte[partSize];
		List<String> partETags = new ArrayList<String>();

		int nRead;
		int partNumber = 0;
		MessageDigest partHasher = null;
		MessageDigest streamHasher = null;
		DigestInputStream digestStream = null;
		try {

			partHasher = MessageDigest.getInstance("MD5");
			streamHasher = MessageDigest.getInstance("MD5");
			digestStream = new DigestInputStream(stream, streamHasher);
			while((nRead = digestStream.read(buffer, 0, partSize)) != -1) {

				Map<String, byte[]> headers = new HashMap<String, byte[]>();

				headers.put("Content-MD5", partHasher.digest(buffer));
				String partETag = getRestClient().postAndReturnETag(String.format("%s/%s", blobUri, partNumber), headers, buffer);

				partETags.add(partETag);
				partNumber += 1;
			}

		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}

		// Finish upload

		MultipartUploadEndRequest endRequest = new MultipartUploadEndRequest();
		endRequest.setPartETags(partETags);
		endRequest.setCompleteMD5(multipartUploadDoubleCheck ? Util.encodeBase64(digestStream.getMessageDigest().digest()) : null);

		getRestClient().post(String.format("Api/MultipartUploads/%s", blobToken), endRequest, null);

		return blobToken;
	}

	int getApiVersion(Apis api) {

		Version v = restPkiVersion;
		if (v == null) {
			v = tryGetEndpointVersion(endpointUrl);
		}

		switch (api) {

			case StartCades:
				if (v.isGreaterThanOrEqualTo(new Version("1.11"))) {
					return 3;
				} else if (v.isGreaterThanOrEqualTo(new Version("1.10"))) {
					return 2;
				} else {
					return 1;
				}

			case CompleteCades:
				if (v.isGreaterThanOrEqualTo(new Version("1.11"))) {
					return 2;
				} else {
					return 1;
				}

			case StartPades:
				if (v.isGreaterThanOrEqualTo(new Version("1.11"))) {
					return 2;
				} else {
					return 1;
				}

			case CompletePades:
				if (v.isGreaterThanOrEqualTo(new Version("1.11"))) {
					return 2;
				} else {
					return 1;
				}

			case MultipartUpload:
				if (v.isGreaterThanOrEqualTo(new Version("1.11"))) {
					return 1;
				} else {
					return 0;
				}

			default:
				throw new UnsupportedOperationException(); // should not happen
		}
	}

	private Version tryGetEndpointVersion(String endpointUri) {

		Version version;
		if (endpointVersions.containsKey(endpointUri)) {
			return endpointVersions.get(endpointUri);
		}

		try {
			SystemInfo response = getRestClient().get("Api/System/Info", SystemInfo.class);
			version = new Version(response.getProductVersion());
		} catch(RestException ex) {
			return null;
		}

		endpointVersions.put(endpointUri, version);
		return version;
	}
}
