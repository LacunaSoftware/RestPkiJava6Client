package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;
import com.lacunasoftware.restpki.SignaturePolicyIdentifierModel;
import com.lacunasoftware.restpki.CertificateModel;
import com.lacunasoftware.restpki.SignatureAlgorithmAndValueModel;
import com.lacunasoftware.restpki.ValidationResultsModel;
import com.lacunasoftware.restpki.CadesTimestampModel;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesSignerModel   {
  
  private Boolean isDocumentTimestamp = null;
  private String signatureFieldName = null;
  private DigestAlgorithmAndValueModel messageDigest = null;
  private SignatureAlgorithmAndValueModel signature = null;
  private SignaturePolicyIdentifierModel signaturePolicy = null;
  private CertificateModel certificate = null;
  private Date signingTime = null;
  private Date certifiedDateReference = null;
  private List<CadesTimestampModel> timestamps = new ArrayList<CadesTimestampModel>();
  private ValidationResultsModel validationResults = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isDocumentTimestamp")
  public Boolean getIsDocumentTimestamp() {
    return isDocumentTimestamp;
  }
  public void setIsDocumentTimestamp(Boolean isDocumentTimestamp) {
    this.isDocumentTimestamp = isDocumentTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signatureFieldName")
  public String getSignatureFieldName() {
    return signatureFieldName;
  }
  public void setSignatureFieldName(String signatureFieldName) {
    this.signatureFieldName = signatureFieldName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("messageDigest")
  public DigestAlgorithmAndValueModel getMessageDigest() {
    return messageDigest;
  }
  public void setMessageDigest(DigestAlgorithmAndValueModel messageDigest) {
    this.messageDigest = messageDigest;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signature")
  public SignatureAlgorithmAndValueModel getSignature() {
    return signature;
  }
  public void setSignature(SignatureAlgorithmAndValueModel signature) {
    this.signature = signature;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signaturePolicy")
  public SignaturePolicyIdentifierModel getSignaturePolicy() {
    return signaturePolicy;
  }
  public void setSignaturePolicy(SignaturePolicyIdentifierModel signaturePolicy) {
    this.signaturePolicy = signaturePolicy;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("certificate")
  public CertificateModel getCertificate() {
    return certificate;
  }
  public void setCertificate(CertificateModel certificate) {
    this.certificate = certificate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signingTime")
  public Date getSigningTime() {
    return signingTime;
  }
  public void setSigningTime(Date signingTime) {
    this.signingTime = signingTime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("certifiedDateReference")
  public Date getCertifiedDateReference() {
    return certifiedDateReference;
  }
  public void setCertifiedDateReference(Date certifiedDateReference) {
    this.certifiedDateReference = certifiedDateReference;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timestamps")
  public List<CadesTimestampModel> getTimestamps() {
    return timestamps;
  }
  public void setTimestamps(List<CadesTimestampModel> timestamps) {
    this.timestamps = timestamps;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("validationResults")
  public ValidationResultsModel getValidationResults() {
    return validationResults;
  }
  public void setValidationResults(ValidationResultsModel validationResults) {
    this.validationResults = validationResults;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesSignerModel {\n");
    
    sb.append("  isDocumentTimestamp: ").append(isDocumentTimestamp).append("\n");
    sb.append("  signatureFieldName: ").append(signatureFieldName).append("\n");
    sb.append("  messageDigest: ").append(messageDigest).append("\n");
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("  signaturePolicy: ").append(signaturePolicy).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  signingTime: ").append(signingTime).append("\n");
    sb.append("  certifiedDateReference: ").append(certifiedDateReference).append("\n");
    sb.append("  timestamps: ").append(timestamps).append("\n");
    sb.append("  validationResults: ").append(validationResults).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
