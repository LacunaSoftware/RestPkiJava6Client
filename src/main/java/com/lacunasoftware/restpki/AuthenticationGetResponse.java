package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class AuthenticationGetResponse   {
  
  private String nonce = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationGetResponse {\n");
    
    sb.append("  nonce: ").append(nonce).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
