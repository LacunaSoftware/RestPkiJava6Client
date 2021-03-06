package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesSignaturePostSignedBytesResponse   {
  
  private String signedPdf = null;
  private String callbackArgument = null;
  private CertificateModel certificate = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signedPdf")
  public String getSignedPdf() {
    return signedPdf;
  }
  public void setSignedPdf(String signedPdf) {
    this.signedPdf = signedPdf;
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
    sb.append("class PadesSignaturePostSignedBytesResponse {\n");
    
    sb.append("  signedPdf: ").append(signedPdf).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
