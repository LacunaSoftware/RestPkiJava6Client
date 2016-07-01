package com.lacunasoftware.restpki;

/**
 * Types of encapsulated content that may be specified in a CAdES signature file.
 */
public enum EncapsulatedContentTypes {
    Data,  SignedData,  EnvelopedData,  DigestedData,  EncryptedData,  AuthenticatedData,  TstInfo,
}
