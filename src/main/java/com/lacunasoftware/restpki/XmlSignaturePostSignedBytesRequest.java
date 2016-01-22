package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-22T14:46:16.160-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlSignaturePostSignedBytesRequest   {
  
  private String signature = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlSignaturePostSignedBytesRequest {\n");
    
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
