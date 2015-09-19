package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PostPendingSignatureCertificateResponse   {
  
  private String toSignHash = null;
  private String digestAlgorithmOid = null;

  
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
    sb.append("class PostPendingSignatureCertificateResponse {\n");
    
    sb.append("  toSignHash: ").append(toSignHash).append("\n");
    sb.append("  digestAlgorithmOid: ").append(digestAlgorithmOid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
