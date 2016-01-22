package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-22T14:46:16.160-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class DetachedResourceXmlSignatureResponse   {
  
  private String token = null;
  private CertificateModel certificate = null;
  private String toSignData = null;
  private String toSignHash = null;
  private String digestAlgorithmOid = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
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
  @JsonProperty("toSignData")
  public String getToSignData() {
    return toSignData;
  }
  public void setToSignData(String toSignData) {
    this.toSignData = toSignData;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("toSignHash")
  public String getToSignHash() {
    return toSignHash;
  }
  public void setToSignHash(String toSignHash) {
    this.toSignHash = toSignHash;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("digestAlgorithmOid")
  public String getDigestAlgorithmOid() {
    return digestAlgorithmOid;
  }
  public void setDigestAlgorithmOid(String digestAlgorithmOid) {
    this.digestAlgorithmOid = digestAlgorithmOid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetachedResourceXmlSignatureResponse {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  toSignData: ").append(toSignData).append("\n");
    sb.append("  toSignHash: ").append(toSignHash).append("\n");
    sb.append("  digestAlgorithmOid: ").append(digestAlgorithmOid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
