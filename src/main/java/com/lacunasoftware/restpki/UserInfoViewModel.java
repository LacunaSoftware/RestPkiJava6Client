package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserInfoViewModel   {
  
  private String username = null;
  private Boolean hasRegistered = null;
  private String loginProvider = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hasRegistered")
  public Boolean getHasRegistered() {
    return hasRegistered;
  }
  public void setHasRegistered(Boolean hasRegistered) {
    this.hasRegistered = hasRegistered;
  }

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoViewModel {\n");
    
    sb.append("  username: ").append(username).append("\n");
    sb.append("  hasRegistered: ").append(hasRegistered).append("\n");
    sb.append("  loginProvider: ").append(loginProvider).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
