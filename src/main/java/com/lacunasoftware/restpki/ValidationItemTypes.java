package com.lacunasoftware.restpki;

/**
 * Types of validations that can be performed on a certificate or signature.
 */
public enum ValidationItemTypes {
	Success,
	CertificateNotYetValid,
	CertificateExpired,
	CertificateRevoked,
	CertificateIssuerNotFound,
	CertificateRevocationStatusUnknown,
	CertificateChainRootNotTrusted,
	InvalidCertificateSignature,
	DecodeError,
	RequiredSignedAttributeMissing,
	ForbiddenSignedAttributePresent,
	RequiredUnsignedAttributeMissing,
	ForbiddenUnsignedAttributePresent,
	ContentTypeMismatch,
	MessageDigestMismatch,
	SigningCertificateDigestMismatch,
	SignatureAlgorithmValidationFailed,
	RevocationDataIssuedBeforeGracePeriod,
	UncertifiedDateReference,
	SignaturePolicyMismatch,
	SigningTimeOutOfCertificateValidity,
	UnknownSignedAttributesPresent,
	UnknownUnsignedAttributesPresent,
	TimestampWithMoreThanOneSigner,
	TimestampMessageImprintMismatch,
	TimestampValidationException,
	CompleteReferencesMismatch,
	InvalidSignatureTimestamp,
	InvalidReferencesTimestamp,
	InvalidArchiveTimestamp,
	InvalidKeyUsage,
	InvalidOcspResponse,
	UnauthorizedIssuer,
	UnknownRootTrustStatus,
	InvalidTsl,
	InvalidCrl,
	CertificateIssuerValid,
	CertificateIssuerInvalid,
	CertificateValidationFailed
}
