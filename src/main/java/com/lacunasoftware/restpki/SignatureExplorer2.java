package com.lacunasoftware.restpki;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class SignatureExplorer2 {

    protected RestPkiClient client;
    FileReference signatureFile;
    protected boolean validate;
    protected String securityContextId;
    protected String defaultSignaturePolicyId;
    protected SignaturePolicyCatalog acceptableExplicitPolicies;
    protected boolean ignoreRevocationStatusUnknown = false;

    /**
     * Create a new instance using the given RestPkiClient.
     *
     * @param client the RestPkiClient which shall be used.
     */
    public SignatureExplorer2(RestPkiClient client) {
        this.client = client;
    }

    //region setSignatureFile

    /**
     * Sets the file path of the signature file to be opened
     *
     * @param path File path of the signature file to be signed.
     */
    public void setSignatureFile(String path) {
        setSignatureFile(new File(path));
    }

    /**
     * Sets the file path of the signature file to be opened
     *
     * @param file File path of the signature file to be opened.
     */
    public void setSignatureFile(File file) {
        this.signatureFile = FileReference.fromFile(file);
    }

    /**
     * Sets the PDF to be signed via a stream object
     *
     * @param stream a pre-opened InputStream linked to the PDF that will be signed. The stream is NOT closed by this
     *               method.
     */
    public void setSignatureFile(InputStream stream) {
        this.signatureFile = FileReference.fromStream(stream);
    }

    /**
     * Sets the signature file to be opened
     *
     * @param content Binary content of the signature file
     */
    public void setSignatureFile(byte[] content) {
        this.signatureFile = FileReference.fromContent(content);
    }

    /**
     * Sets the signature to be signed from a file result from a previous call to Rest PKI
     *
     * @param fileResult FileResult from previous call to Rest PKI
     */
    public void setSignatureFile(FileResult fileResult) {
        this.signatureFile = FileReference.fromResult(fileResult);
    }

    //endregion

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
     * Sets the "catalog" of explicit policies that should be accepted when validating signatures with an explicit
     * validation policy attribute. If a signature being validated has an explicit validation policy attribute which is
     * not among the values passed, then the default signature policy is used (specified with the
     * setDefaultSignaturePolicy method). In order to accept only the given catalog of explicit policies, don't set a
     * default policy.
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

    protected OpenSignatureRequestModel fillRequest(OpenSignatureRequestModel request) throws RestException, IOException {

        request.setValidate(validate);
        request.setDefaultSignaturePolicyId(defaultSignaturePolicyId);
        request.setSecurityContextId(securityContextId);
        request.setIgnoreRevocationStatusUnknown(ignoreRevocationStatusUnknown);
        if (acceptableExplicitPolicies != null) {
            List<String> policyIds = new ArrayList<String>();
            for (SignaturePolicy policy : acceptableExplicitPolicies.getPolicies()) {
                policyIds.add(policy.getId());
            }
            request.setAcceptableExplicitPolicies(policyIds);
        }
        request.setFile(signatureFile.uploadOrReference(client));
        return request;
    }
}
