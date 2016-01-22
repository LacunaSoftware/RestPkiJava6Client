package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-22T14:46:16.160-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlSignaturePostSignedBytesResponse   {
  
  private String signedXml = null;
  private String callbackArgument = null;
  private CertificateModel certificate = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signedXml")
  public String getSignedXml() {
    return signedXml;
  }
  public void setSignedXml(String signedXml) {
    this.signedXml = signedXml;
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
  @JsonProperty("certificate")
  public CertificateModel getCertificate() {
    return certificate;
  }
  public void setCertificate(CertificateModel certificate) {
    this.certificate = certificate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlSignaturePostSignedBytesResponse {\n");
    
    sb.append("  signedXml: ").append(signedXml).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
