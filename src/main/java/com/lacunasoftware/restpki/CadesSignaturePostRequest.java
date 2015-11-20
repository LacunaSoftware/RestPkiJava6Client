package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T17:07:25.480-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CadesSignaturePostRequest   {
  
  private String contentToSign = null;
  private String cmsToCoSign = null;
  private Boolean encapsulateContent = null;
  private String certificate = null;
  private String signaturePolicyId = null;
  private String securityContextId = null;
  private String callbackArgument = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("contentToSign")
  public String getContentToSign() {
    return contentToSign;
  }
  public void setContentToSign(String contentToSign) {
    this.contentToSign = contentToSign;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cmsToCoSign")
  public String getCmsToCoSign() {
    return cmsToCoSign;
  }
  public void setCmsToCoSign(String cmsToCoSign) {
    this.cmsToCoSign = cmsToCoSign;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("encapsulateContent")
  public Boolean getEncapsulateContent() {
    return encapsulateContent;
  }
  public void setEncapsulateContent(Boolean encapsulateContent) {
    this.encapsulateContent = encapsulateContent;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadesSignaturePostRequest {\n");
    
    sb.append("  contentToSign: ").append(contentToSign).append("\n");
    sb.append("  cmsToCoSign: ").append(cmsToCoSign).append("\n");
    sb.append("  encapsulateContent: ").append(encapsulateContent).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  signaturePolicyId: ").append(signaturePolicyId).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
