package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class AddExternalLoginBindingModel   {
  
  private String externalAccessToken = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("externalAccessToken")
  public String getExternalAccessToken() {
    return externalAccessToken;
  }
  public void setExternalAccessToken(String externalAccessToken) {
    this.externalAccessToken = externalAccessToken;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddExternalLoginBindingModel {\n");
    
    sb.append("  externalAccessToken: ").append(externalAccessToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
