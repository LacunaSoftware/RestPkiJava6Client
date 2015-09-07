package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesSignaturePostSignedBytesResponse   {
  
  private String signedPdf = null;
  private String callbackArgument = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signedPdf")
  public String getSignedPdf() {
    return signedPdf;
  }
  public void setSignedPdf(String signedPdf) {
    this.signedPdf = signedPdf;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesSignaturePostSignedBytesResponse {\n");
    
    sb.append("  signedPdf: ").append(signedPdf).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
