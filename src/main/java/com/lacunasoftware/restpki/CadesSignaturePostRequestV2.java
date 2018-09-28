package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CadesSignaturePostRequestV2   {
  
  private List<DigestAlgorithmAndValueModel> dataHashes = new ArrayList<DigestAlgorithmAndValueModel>();
  private String contentToSign = null;
  private String cmsToCoSign = null;
  private Boolean encapsulateContent = null;
  private String certificate = null;
  private String signaturePolicyId = null;
  private String securityContextId = null;
  private String callbackArgument = null;
  private Boolean ignoreRevocationStatusUnknown = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dataHashes")
  public List<DigestAlgorithmAndValueModel> getDataHashes() {
    return dataHashes;
  }
  public void setDataHashes(List<DigestAlgorithmAndValueModel> dataHashes) {
    this.dataHashes = dataHashes;
  }

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ignoreRevocationStatusUnknown")
  public Boolean getIgnoreRevocationStatusUnknown() {
    return ignoreRevocationStatusUnknown;
  }
  public void setIgnoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
    this.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadesSignaturePostRequestV2 {\n");
    
    sb.append("  dataHashes: ").append(dataHashes).append("\n");
    sb.append("  contentToSign: ").append(contentToSign).append("\n");
    sb.append("  cmsToCoSign: ").append(cmsToCoSign).append("\n");
    sb.append("  encapsulateContent: ").append(encapsulateContent).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  signaturePolicyId: ").append(signaturePolicyId).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("  ignoreRevocationStatusUnknown: ").append(ignoreRevocationStatusUnknown).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
