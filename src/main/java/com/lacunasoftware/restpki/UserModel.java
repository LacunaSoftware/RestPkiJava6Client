package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-21T14:48:34.437-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserModel   {
  
  private String email = null;
  private Boolean isAdmin = null;
  private Boolean hasLocalLogin = null;
  private Boolean canDelete = null;
  private String id = null;
  private String username = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("canDelete")
  public Boolean getCanDelete() {
    return canDelete;
  }
  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModel {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  isAdmin: ").append(isAdmin).append("\n");
    sb.append("  hasLocalLogin: ").append(hasLocalLogin).append("\n");
    sb.append("  canDelete: ").append(canDelete).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
