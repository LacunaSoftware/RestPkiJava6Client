package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.SignaturePolicyIdentifierModel;
import com.lacunasoftware.restpki.CertificateModel;
import com.lacunasoftware.restpki.SignatureAlgorithmAndValueModel;
import com.lacunasoftware.restpki.ValidationResultsModel;
import com.lacunasoftware.restpki.CadesTimestampModel;
import com.lacunasoftware.restpki.XmlElementModel;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlSignatureModel   {
  
  public enum TypeEnum {
     FullXml,  XmlElement,  DetachedResource, 
  };
  private TypeEnum type = null;
  private XmlElementModel signedElement = null;
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
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signedElement")
  public XmlElementModel getSignedElement() {
    return signedElement;
  }
  public void setSignedElement(XmlElementModel signedElement) {
    this.signedElement = signedElement;
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
    sb.append("class XmlSignatureModel {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  signedElement: ").append(signedElement).append("\n");
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
