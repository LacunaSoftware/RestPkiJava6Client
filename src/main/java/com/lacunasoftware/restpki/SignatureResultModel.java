package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.FileModel;
import com.lacunasoftware.restpki.CertificateModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-17T15:30:21.925-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SignatureResultModel   {
  
  private FileModel signatureFile = null;
  private String callbackArgument = null;
  private CertificateModel certificate = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signatureFile")
  public FileModel getSignatureFile() {
    return signatureFile;
  }
  public void setSignatureFile(FileModel signatureFile) {
    this.signatureFile = signatureFile;
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
    sb.append("class SignatureResultModel {\n");
    
    sb.append("  signatureFile: ").append(signatureFile).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
