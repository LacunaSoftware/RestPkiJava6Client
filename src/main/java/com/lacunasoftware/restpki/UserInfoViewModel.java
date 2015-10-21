package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-21T14:48:34.437-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserInfoViewModel   {
  
  private String username = null;
  private Boolean hasRegistered = null;
  private String loginProvider = null;
  private Boolean isAdmin = null;
  private Boolean hasLocalLogin = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isAdmin")
  public Boolean getIsAdmin() {
    return isAdmin;
  }
  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hasLocalLogin")
  public Boolean getHasLocalLogin() {
    return hasLocalLogin;
  }
  public void setHasLocalLogin(Boolean hasLocalLogin) {
    this.hasLocalLogin = hasLocalLogin;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoViewModel {\n");
    
    sb.append("  username: ").append(username).append("\n");
    sb.append("  hasRegistered: ").append(hasRegistered).append("\n");
    sb.append("  loginProvider: ").append(loginProvider).append("\n");
    sb.append("  isAdmin: ").append(isAdmin).append("\n");
    sb.append("  hasLocalLogin: ").append(hasLocalLogin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
