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

    /**
     * Returns a signature policy catalog that will accept all ICP-Brasil CAdES policies
     */
    public static SignaturePolicyCatalog getPkiBrazilCades() {
        return new SignaturePolicyCatalog(Arrays.asList(
            SignaturePolicy.PkiBrazilAdrBasica, SignaturePolicy.PkiBrazilAdrTempo, SignaturePolicy.PkiBrazilAdrCompleta
        ));
    }

    /**
     * Returns a signature policy catalog that will accept all ICP-Brasil CAdES policies that provide signer certificate
     * protection.
     *
     * "Signer certificate protection" means that a signature keeps its validity even after the signer certificate
     * is revoked or expires. On ICP-Brasil, this translates to policies AD-RT and up (not AD-RB).
     */
    public static SignaturePolicyCatalog getPkiBrazilCadesWithSignerCertificateProtection() {
        return new SignaturePolicyCatalog(Arrays.asList(
                SignaturePolicy.PkiBrazilAdrTempo, SignaturePolicy.PkiBrazilAdrCompleta
        ));
    }

    /**
     * Returns a signature policy catalog that will accept all ICP-Brasil CAdES policies that provide CA certificate
     * protection (besides signer certificate protection).
     *
     * "CA certificate protection" means that a signature keeps its validity even after either the signer certificate or
     * its Certification Authority (CA) certificate expires or is revoked. On ICP-Brasil, this translates to policies
     * AD-RC/AD-RV and up (not AD-RB nor AD-RT).
     */
    public static SignaturePolicyCatalog getPkiBrazilCadesWithCACertificateProtection() {
        return new SignaturePolicyCatalog(Arrays.asList(
                SignaturePolicy.PkiBrazilAdrCompleta
        ));
    }

    /**
     * Returns a signature policy catalog that will accept all ICP-Brasil PAdES policies
     */
    public static SignaturePolicyCatalog getPkiBrazilPades() {
        return new SignaturePolicyCatalog(Arrays.asList(
                SignaturePolicy.PkiBrazilPadesAdrBasica, SignaturePolicy.PkiBrazilPadesAdrTempo
        ));
    }

    /**
     * Returns a signature policy catalog that will accept all ICP-Brasil PAdES policies that provide signer certificate
     * protection.
     *
     * "Signer certificate protection" means that a signature keeps its validity even after the signer certificate
     * is revoked or expires. On ICP-Brasil, this translated to policies AD-RT and up (not AD-RB).
     */
    public static SignaturePolicyCatalog getPkiBrazilPadesWithSignerCertificateProtection() {
        return new SignaturePolicyCatalog(Arrays.asList(
                SignaturePolicy.PkiBrazilPadesAdrTempo
        ));
    }
}
