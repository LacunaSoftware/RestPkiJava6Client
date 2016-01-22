package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.XmlElementLocationModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-22T14:46:16.160-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class OnlineResourceXmlSignatureRequest   {
  
  private String resourceToSignUri = null;
  private String xml = null;
  private String signatureElementId = null;
  private XmlElementLocationModel signatureElementLocation = null;
  private String certificate = null;
  private String signaturePolicyId = null;
  private String securityContextId = null;
  private String callbackArgument = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("resourceToSignUri")
  public String getResourceToSignUri() {
    return resourceToSignUri;
  }
  public void setResourceToSignUri(String resourceToSignUri) {
    this.resourceToSignUri = resourceToSignUri;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("xml")
  public String getXml() {
    return xml;
  }
  public void setXml(String xml) {
    this.xml = xml;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signatureElementId")
  public String getSignatureElementId() {
    return signatureElementId;
  }
  public void setSignatureElementId(String signatureElementId) {
    this.signatureElementId = signatureElementId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signatureElementLocation")
  public XmlElementLocationModel getSignatureElementLocation() {
    return signatureElementLocation;
  }
  public void setSignatureElementLocation(XmlElementLocationModel signatureElementLocation) {
    this.signatureElementLocation = signatureElementLocation;
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
    sb.append("class OnlineResourceXmlSignatureRequest {\n");
    
    sb.append("  resourceToSignUri: ").append(resourceToSignUri).append("\n");
    sb.append("  xml: ").append(xml).append("\n");
    sb.append("  signatureElementId: ").append(signatureElementId).append("\n");
    sb.append("  signatureElementLocation: ").append(signatureElementLocation).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  signaturePolicyId: ").append(signaturePolicyId).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
