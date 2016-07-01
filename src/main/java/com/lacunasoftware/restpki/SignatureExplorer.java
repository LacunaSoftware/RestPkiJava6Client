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
    protected String implicitValidationPolicyId;
    protected List<String> explicitValidationPolicyIds = new ArrayList<String>();
    protected String validationSecurityContextId;

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
        this.explicitValidationPolicyIds = new ArrayList<String>();
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
     * Sets the signature policy to be used for validating signatures without an explicit policy set.
     *
     * @param signaturePolicy The signature policy. Depending on the policy, it might also be necessary to set
     *                        a security context.
     */
    public void setImplicitValidationPolicy(SignaturePolicy signaturePolicy) {
        this.implicitValidationPolicyId = signaturePolicy.getId();
    }

    /**
     * Adds a signature policy to the list of acceptable policies for validation.
     *
     * @param signaturePolicy The signature policy. Depending on the policy, it might also be necessary to set
     *                        a security context.
     */
    public void addExplicitValidationPolicy(SignaturePolicy signaturePolicy) {
        this.explicitValidationPolicyIds.add(signaturePolicy.getId());
    }

    /**
     * Sets the security context to be used to validate the signatures. Depending on the signature policies passed on the
     * methods addExplicitValidationPolicy and setImplicitValidationPolicy, this may be mandatory. If a signature
     * policy does not require a security context to be set but one is nevertheless passed, the given security context
     * overrides the one that would otherwise be inferred from the policy.
     *
     * @param securityContext The security context to be used to validate the signatures on the signature file.
     */
    public void setValidationSecurityContext(SecurityContext securityContext) {
        this.validationSecurityContextId = securityContext.getId();
    }

    protected OpenSignatureRequestModel getRequest(String fileMimeType) {
        OpenSignatureRequestModel request = new OpenSignatureRequestModel();
        FileModel file = new FileModel();
        file.setContent(Util.encodeBase64(signatureFileContent));
        file.setMimeType(fileMimeType);
        request.setFile(file);
        request.setValidate(validate);
        request.setExplicitValidationPolicies(explicitValidationPolicyIds);
        request.setImplicitValidationPolicy(implicitValidationPolicyId);
        request.setValidationSecurityContext(validationSecurityContextId);
        return request;
    }
}
