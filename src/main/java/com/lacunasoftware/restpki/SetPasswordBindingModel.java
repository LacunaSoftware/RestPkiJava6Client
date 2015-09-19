package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SetPasswordBindingModel   {
  
  private String newPassword = null;
  private String confirmPassword = null;

  
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
    sb.append("class SetPasswordBindingModel {\n");
    
    sb.append("  newPassword: ").append(newPassword).append("\n");
    sb.append("  confirmPassword: ").append(confirmPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
