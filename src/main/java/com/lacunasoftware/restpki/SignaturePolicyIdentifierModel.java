package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SignaturePolicyIdentifierModel   {
  
  private DigestAlgorithmAndValueModel digest = null;
  private String oid = null;
  private String uri = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("digest")
  public DigestAlgorithmAndValueModel getDigest() {
    return digest;
  }
  public void setDigest(DigestAlgorithmAndValueModel digest) {
    this.digest = digest;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("oid")
  public String getOid() {
    return oid;
  }
  public void setOid(String oid) {
    this.oid = oid;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignaturePolicyIdentifierModel {\n");
    
    sb.append("  digest: ").append(digest).append("\n");
    sb.append("  oid: ").append(oid).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
