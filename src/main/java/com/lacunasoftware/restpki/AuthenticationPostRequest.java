package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class AuthenticationPostRequest   {
  
  private String certificate = null;
  private String nonce = null;
  private String signature = null;
  private String securityContextId = null;

  
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
  @JsonProperty("nonce")
  public String getNonce() {
    return nonce;
  }
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signature")
  public String getSignature() {
    return signature;
  }
  public void setSignature(String signature) {
    this.signature = signature;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationPostRequest {\n");
    
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  nonce: ").append(nonce).append("\n");
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
