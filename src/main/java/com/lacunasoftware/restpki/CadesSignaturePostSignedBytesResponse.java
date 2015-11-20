package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T17:07:25.480-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CadesSignaturePostSignedBytesResponse   {
  
  private String cms = null;
  private String callbackArgument = null;
  private CertificateModel certificate = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cms")
  public String getCms() {
    return cms;
  }
  public void setCms(String cms) {
    this.cms = cms;
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
    sb.append("class CadesSignaturePostSignedBytesResponse {\n");
    
    sb.append("  cms: ").append(cms).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
