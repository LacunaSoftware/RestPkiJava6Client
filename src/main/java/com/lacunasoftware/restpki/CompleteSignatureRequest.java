package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-17T15:30:21.925-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CompleteSignatureRequest   {
  
  private String signature = null;
  private Boolean forceBlobResult = null;

  
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
  @JsonProperty("forceBlobResult")
  public Boolean getForceBlobResult() {
    return forceBlobResult;
  }
  public void setForceBlobResult(Boolean forceBlobResult) {
    this.forceBlobResult = forceBlobResult;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteSignatureRequest {\n");
    
    sb.append("  signature: ").append(signature).append("\n");
    sb.append("  forceBlobResult: ").append(forceBlobResult).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
