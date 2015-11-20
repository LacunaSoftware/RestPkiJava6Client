package com.lacunasoftware.restpki;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Base class for PadesSignatureFinisher and CadesSignatureFinisher
 */
public abstract class SignatureFinisher {

	protected RestPkiClient client;
	protected String token;
	protected String signature;

	protected boolean done = false;
	protected String callbackArgument;
	protected PKCertificate certificateInfo;

	public SignatureFinisher(RestPkiClient client) {
		this.client = client;
	}

	/**
	 * Sets the token previously yielded by the first step.
	 * @param token The token, a 43-character case-sensitive string containing only letters, numbers and the characters
	 * "-" and "_" (therefore URL and HTML safe).
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * Sets the signature performed using the user certificate's private key (should not be used if the signature was
	 * started with the method startWithWebPki).
	 * @param signature The signature operation output, encoded in Base64 (this is the format returned by the Web PKI component's signData and signHash methods).
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * Performs the step (should only be called after calling setToken()). This method throws
	 * a ValidationException if the validation of the signature or of the user's certificate fails.
	 * @return The signature result (for PadesSignatureFinisher, the signed PDF's bytes, for
	 * CadesSignatureFinisher, the CMS's bytes)
	 * @throws RestException If an error occurs while calling the REST PKI API or if validation of the signature or of the user's certificate fails.
	 */
	public abstract byte[] finish() throws RestException;

	/**
	 * Returns the callback argument, if one was passed during the first step (must only be called after
	 * calling the finish() method).
	 * @return The callback argument passed previously on the first step, or null if no argument was passed.
	 */
	public String getCallbackArgument() {
		if (!done) {
			throw new RuntimeException("The getCallbackArgument() method can only be called after calling the finish() method");
		}
		return callbackArgument;
	}

	/**
	 * Returns information about the signer's certificate (can only be called after calling the
	 * finish() method).
	 * @return The signer's certificate information.
	 */
	public PKCertificate getCertificateInfo() {
		if (!done) {
			throw new RuntimeException("The getCertificateInfo() method can only be called after calling the finish() method");
		}
		return certificateInfo;
	}

}
