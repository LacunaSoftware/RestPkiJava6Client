package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserData   {
  
  private Boolean isAdmin = null;
  private String customerId = null;
  private Boolean isBlocked = null;

  
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
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserData {\n");
    
    sb.append("  isAdmin: ").append(isAdmin).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  isBlocked: ").append(isBlocked).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
