package com.lacunasoftware.restpki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Base class for the CadesSignatureExplorer and PadesSignatureExplorer classes
 */
public abstract class SignatureExplorer {

    protected RestPkiClient client;
    protected byte[] signatureFileContent;
    protected boolean validate;
    protected String defaultSignaturePolicyId;
    protected SignaturePolicyCatalog acceptableExplicitPolicies;
    protected String securityContextId;

    public SignatureExplorer(RestPkiClient client) {
        this.client = client;
    }

    /**
     * Sets the signature file to be opened
     *
     * @param content Binary content of the signature file
     */
    public void setSignatureFile(byte[] content) {
        this.signatureFileContent = content;
    }

    /**
     * Sets the file path of the signature file to be opened
     *
     * @param path File path of the signature file to be signed.
     * @throws IOException if an error occurs while reading the file.
     */
    public void setSignatureFile(String path) throws IOException {
        setSignatureFile(Paths.get(path));
    }

    /**
     * Sets the file path of the signature file to be opened
     *
     * @param path File path of the signature file to be opened.
     * @throws IOException if an error occurs while reading the file.
     */
    public void setSignatureFile(Path path) throws IOException {
        this.signatureFileContent = Files.readAllBytes(path);
    }

    /**
     * Sets whether the signature file should be validated or just opened
     *
     * @param validate Whether to validate the signature file or not
     */
    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    /**
     * Sets the default signature policy to be used to validate signatures. This value is used to validate signatures
     * without an explicit validation policy attribute and also signatures with an explicit validation policy attribute
     * that is not among the policies specified in AcceptableExplicitPolicies. In order to accept only a certain list of
     * explicit policies, this value should be omitted.
     *
     * @param signaturePolicy The default signature policy for validation. Depending on the policy, it might also be
     *                        necessary to set a security context.
     */
    public void setDefaultSignaturePolicy(SignaturePolicy signaturePolicy) {
        this.defaultSignaturePolicyId = signaturePolicy.getId();
    }

    /**
     * Sets the "catalog" of explicit policies that should be accepted when validating signatures with an explicit validation
     * policy attribute. If a signature being validated has an explicit validation policy attribute which is not among
     * the values passed, then the default signature policy is used (specified with the setDefaultSignaturePolicy method).
     * In order to accept only the given catalog of explicit policies, don't set a default policy.
     *
     * @param policyCatalog The signature policy catalog (for instance, SignaturePolicyCatalog.getPkiBrazilCades() or
     *                      SignaturePolicyCatalog.getPkiBrazilPades())
     */
    public void setAcceptableExplicitPolicies(SignaturePolicyCatalog policyCatalog) {
        this.acceptableExplicitPolicies = policyCatalog;
    }

    /**
     * Sets the security context to be used to validate the signatures. Depending on the signature policies passed on the
     * methods setAcceptableExplicitPolicies and setDefaultSignaturePolicy, this may be mandatory. If a signature
     * policy does not require a security context to be set but one is nevertheless passed, the given security context
     * overrides the one that would otherwise be inferred from the policy.
     *
     * @param securityContext The security context to be used to validate the signatures on the signature file.
     */
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContextId = securityContext.getId();
    }

    protected OpenSignatureRequestModel getRequest(String fileMimeType) {
        OpenSignatureRequestModel request = new OpenSignatureRequestModel();
        FileModel file = new FileModel();
        file.setContent(Util.encodeBase64(signatureFileContent));
        file.setMimeType(fileMimeType);
        request.setFile(file);
        request.setValidate(validate);
        request.setDefaultSignaturePolicyId(defaultSignaturePolicyId);
        request.setSecurityContextId(securityContextId);
        if (acceptableExplicitPolicies != null) {
            List<String> policyIds = new ArrayList<String>();
            for (SignaturePolicy policy : acceptableExplicitPolicies.getPolicies()) {
                policyIds.add(policy.getId());
            }
            request.setAcceptableExplicitPolicies(policyIds);
        }
        return request;
    }
}
