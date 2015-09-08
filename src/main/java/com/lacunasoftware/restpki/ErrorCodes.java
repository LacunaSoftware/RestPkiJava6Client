package com.lacunasoftware.restpki;

/**
 * Error codes for the REST PKI API
 */
public enum ErrorCodes {
    EntityNotFound,
    EntityAlreadyExists,
    EntityUnusable,
    EntityIsReadOnly,
    SecurityContextRequired,
    PKCertificateMalformed,
    ValidationError
}
