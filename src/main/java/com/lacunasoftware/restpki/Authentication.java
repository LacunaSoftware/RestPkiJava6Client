package com.lacunasoftware.restpki;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Class used to authenticate a user with a X.509 public key certificate.
 */
public class Authentication {
	
	private RestPkiClient client;

    private boolean ignoreRevocationStatusUnknown = false;
    private boolean done = false;
    private PKCertificate pkCertificate;

	public Authentication(RestPkiClient client) {
		this.client = client;
	}

    public boolean getIgnoreRevocationStatusUnknown() {
        return ignoreRevocationStatusUnknown;
    }

    /**
     * Sets the option of "IgnoreRevocationStatusUnknown".
     *
     * @param ignoreRevocationStatusUnknown The option of "IgnoreRevocationStatusUnknown".
     */
    public void setIgnoreRevocationStatusUnknown(boolean ignoreRevocationStatusUnknown) {
        this.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
    }

    /**
     * Performs the first of two steps, yielding a cryptographic nonce that must be signed using the user certificate's
     * private key.
     * <p>
     *     If you are using the Web PKI component to perform the client-side signature, this value must be passed
     *     to the component's method signData. The nonce is returned encoded in Base64, which is the same encoding
     *     expected by the component's signData method.
     * </p>
     * @return The cryptographic nonce that must be signed using the user certificate's private key, encoded in Base64.
     * @throws RestException If an error occurs while calling the REST PKI API.
     */
	public String start() throws RestException {
        AuthenticationGetResponse response = client.getRestClient().get("Api/Authentication", AuthenticationGetResponse.class);
		return response.getNonce();
	}

    public String startWithWebPki(SecurityContext securityContext) throws RestException {
        AuthenticationsPostRequest request = new AuthenticationsPostRequest();
        request.setSecurityContextId(securityContext.getId());
        request.setIgnoreRevocationStatusUnknown(ignoreRevocationStatusUnknown);
        AuthenticationsPostResponse response = client.getRestClient().post("Api/Authentications", request, AuthenticationsPostResponse.class);
        return response.getToken();
    }

    /**
     * Performs the final of two steps, receiving (1) the cryptographic nonce previously generated; (2) the user's certificate
     * encoding; (3) the signature of the nonce and (4) a security context and yielding a ValidationResults.
     * <p>
     *     The security context is used to determine if the user certificate can be trusted, and is mandatory.
     *     You can use one of the predefined security contexts such as pkiBrazil or pkiItaly, or you can create a custom
     *     security context by accessing the REST PKI site.
     * </p>
     * <p>
     *     This method does not throw an exception if the validation of the user's certificate fails. Instead, it
     *     returns a ValidationResults with validation errors. In order to determine whether the authentication was
     *     successful, you must call the isValid() method on the returned ValidationResults object.
     * </p>
     * @param nonce The cryptographic nonce generated in the first step, which was signed with the user certificate's private key.
     * @param certificate The binary encoding of the user's certificate, encoded in Base64 (this is the format returned by the Web PKI component's readCertificate method).
     * @param signature The digital signature of the nonce using the user certificate's private key, encoded in Base64 (this is the format returned by the Web PKI component's signData method).
     * @param securityContext The security context to be used to validate the user's certificate.
     * @return A ValidationResults object containing the results of the authentication (call the method isValid() to determine whether the authentication was successful).
     * @throws RestException If an error occurs while calling the REST PKI API (this method does not throw an exception if the validation of the user's certificate fails).
     */
	public ValidationResults complete(String nonce, String certificate, String signature, SecurityContext securityContext) throws RestException {
		
		AuthenticationPostRequest request = new AuthenticationPostRequest();
		request.setNonce(nonce);
		request.setCertificate(certificate);
		request.setSignature(signature);
		request.setSecurityContextId(securityContext.getId());
        request.setIgnoreRevocationStatusUnknown(ignoreRevocationStatusUnknown);

        AuthenticationPostResponse response = client.getRestClient().post("Api/Authentication", request, AuthenticationPostResponse.class);

        ValidationResults vr = new ValidationResults(response.getValidationResults());
        if (response.getCertificate() != null) {
            this.pkCertificate = new PKCertificate(response.getCertificate());
        }
        done = true;
		return vr;
	}

    public ValidationResults completeWithWebPki(String token) throws RestException {
        AuthenticationsPostSignedBytesResponse response = client.getRestClient().post("Api/Authentications/" + token + "/Finalize", null, AuthenticationsPostSignedBytesResponse.class);
        ValidationResults vr = new ValidationResults(response.getValidationResults());
        if (response.getCertificate() != null) {
            this.pkCertificate = new PKCertificate(response.getCertificate());
        }
        done = true;
        return vr;
    }

    /**
     * Returns the user certificate's information (must only be called after calling the complete() method).
     * <p>
     *     Note: if the authentication is successful, this method is guaranteed to return an object instance. However, if the
     *     authentication fails, this method may return null.
     * </p>
     * @return The user certificate's information, or null if it cannot be determined (does not happen if the authentication succeeds).
     */
    public PKCertificate getPKCertificate() {
        if (!done) {
            throw new RuntimeException("The method getPKCertificate() can only be called after calling one of the complete methods");
        }
        return this.pkCertificate;
    }
}
