package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserModel   {
  
  private String email = null;
  private Boolean isAdmin = null;
  private Boolean hasPassword = null;
  private Boolean canDelete = null;
  private String id = null;
  private String username = null;
  private Boolean isBlocked = null;
  private String customerId = null;

  
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
  @JsonProperty("hasPassword")
  public Boolean getHasPassword() {
    return hasPassword;
  }
  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isBlocked")
  public Boolean getIsBlocked() {
    return isBlocked;
  }
  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModel {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  isAdmin: ").append(isAdmin).append("\n");
    sb.append("  hasPassword: ").append(hasPassword).append("\n");
    sb.append("  canDelete: ").append(canDelete).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  isBlocked: ").append(isBlocked).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
