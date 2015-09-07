package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserLoginInfoViewModel   {
  
  private String loginProvider = null;
  private String providerKey = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("loginProvider")
  public String getLoginProvider() {
    return loginProvider;
  }
  public void setLoginProvider(String loginProvider) {
    this.loginProvider = loginProvider;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
    sb.append("class UserLoginInfoViewModel {\n");
    
    sb.append("  loginProvider: ").append(loginProvider).append("\n");
    sb.append("  providerKey: ").append(providerKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
