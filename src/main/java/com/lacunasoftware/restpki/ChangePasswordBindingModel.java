package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class ChangePasswordBindingModel   {
  
  private String oldPassword = null;
  private String newPassword = null;
  private String confirmPassword = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("oldPassword")
  public String getOldPassword() {
    return oldPassword;
  }
  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("newPassword")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("confirmPassword")
  public String getConfirmPassword() {
    return confirmPassword;
  }
  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordBindingModel {\n");
    
    sb.append("  oldPassword: ").append(oldPassword).append("\n");
    sb.append("  newPassword: ").append(newPassword).append("\n");
    sb.append("  confirmPassword: ").append(confirmPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
