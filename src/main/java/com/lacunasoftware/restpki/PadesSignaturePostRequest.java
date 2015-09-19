package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesVisualRepresentationModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesSignaturePostRequest   {
  
  private String pdfToSign = null;
  private String certificate = null;
  private String signaturePolicyId = null;
  private String securityContextId = null;
  private String callbackArgument = null;
  private PadesVisualRepresentationModel visualRepresentation = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pdfToSign")
  public String getPdfToSign() {
    return pdfToSign;
  }
  public void setPdfToSign(String pdfToSign) {
    this.pdfToSign = pdfToSign;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signaturePolicyId")
  public String getSignaturePolicyId() {
    return signaturePolicyId;
  }
  public void setSignaturePolicyId(String signaturePolicyId) {
    this.signaturePolicyId = signaturePolicyId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("securityContextId")
  public String getSecurityContextId() {
    return securityContextId;
  }
  public void setSecurityContextId(String securityContextId) {
    this.securityContextId = securityContextId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("callbackArgument")
  public String getCallbackArgument() {
    return callbackArgument;
  }
  public void setCallbackArgument(String callbackArgument) {
    this.callbackArgument = callbackArgument;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("visualRepresentation")
  public PadesVisualRepresentationModel getVisualRepresentation() {
    return visualRepresentation;
  }
  public void setVisualRepresentation(PadesVisualRepresentationModel visualRepresentation) {
    this.visualRepresentation = visualRepresentation;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesSignaturePostRequest {\n");
    
    sb.append("  pdfToSign: ").append(pdfToSign).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  signaturePolicyId: ").append(signaturePolicyId).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("  visualRepresentation: ").append(visualRepresentation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
