package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class RemoveLoginBindingModel   {
  
  private String loginProvider = null;
  private String providerKey = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("loginProvider")
  public String getLoginProvider() {
    return loginProvider;
  }
  public void setLoginProvider(String loginProvider) {
    this.loginProvider = loginProvider;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("providerKey")
  public String getProviderKey() {
    return providerKey;
  }
  public void setProviderKey(String providerKey) {
    this.providerKey = providerKey;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveLoginBindingModel {\n");
    
    sb.append("  loginProvider: ").append(loginProvider).append("\n");
    sb.append("  providerKey: ").append(providerKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
