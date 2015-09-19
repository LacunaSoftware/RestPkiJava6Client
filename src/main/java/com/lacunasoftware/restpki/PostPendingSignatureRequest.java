package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PostPendingSignatureRequest   {
  
  private String signature = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("signature")
  public String getSignature() {
    return signature;
  }
  public void setSignature(String signature) {
    this.signature = signature;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPendingSignatureRequest {\n");
    
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
