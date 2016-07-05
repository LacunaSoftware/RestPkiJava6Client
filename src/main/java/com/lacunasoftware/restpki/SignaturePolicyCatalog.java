package com.lacunasoftware.restpki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Represents a collection of signature policies.
 */
public class SignaturePolicyCatalog {

    protected List<SignaturePolicy> policies = new ArrayList<SignaturePolicy>();

    public SignaturePolicyCatalog() {
    }

    public SignaturePolicyCatalog(Collection<SignaturePolicy> policies) {
        this.policies.addAll(policies);
    }

    public List<SignaturePolicy> getPolicies() {
        return policies;
    }

    public static SignaturePolicyCatalog getPkiBrazilCades() {
        return new SignaturePolicyCatalog(Arrays.asList(
            SignaturePolicy.PkiBrazilAdrBasica, SignaturePolicy.PkiBrazilAdrTempo, SignaturePolicy.PkiBrazilAdrCompleta
        ));
    }

    public static SignaturePolicyCatalog getPkiBrazilCadesWithSignerCertificateProtection() {
        return new SignaturePolicyCatalog(Arrays.asList(
                SignaturePolicy.PkiBrazilAdrTempo, SignaturePolicy.PkiBrazilAdrCompleta
        ));
    }

    public static SignaturePolicyCatalog getPkiBrazilCadesWithCACertificateProtection() {
        return new SignaturePolicyCatalog(Arrays.asList(
                SignaturePolicy.PkiBrazilAdrCompleta
        ));
    }

    public static SignaturePolicyCatalog getPkiBrazilPades() {
        return new SignaturePolicyCatalog(Arrays.asList(
                SignaturePolicy.PkiBrazilPadesAdrBasica, SignaturePolicy.PkiBrazilPadesAdrTempo
        ));
    }

    public static SignaturePolicyCatalog getPkiBrazilPadesWithSignerCertificateProtection() {
        return new SignaturePolicyCatalog(Arrays.asList(
                SignaturePolicy.PkiBrazilPadesAdrTempo
        ));
    }
}
