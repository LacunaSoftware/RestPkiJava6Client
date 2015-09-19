package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class GetPendingSignatureResponse   {
  
  private String toSignHash = null;
  private String digestAlgorithmOid = null;
  private String certificateThumbprint = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("certificateThumbprint")
  public String getCertificateThumbprint() {
    return certificateThumbprint;
  }
  public void setCertificateThumbprint(String certificateThumbprint) {
    this.certificateThumbprint = certificateThumbprint;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPendingSignatureResponse {\n");
    
    sb.append("  toSignHash: ").append(toSignHash).append("\n");
    sb.append("  digestAlgorithmOid: ").append(digestAlgorithmOid).append("\n");
    sb.append("  certificateThumbprint: ").append(certificateThumbprint).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
