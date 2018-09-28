package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserSearchRequest   {
  
  private String username = null;
  private Boolean isBlocked = null;
  private String customerId = null;

  
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
    sb.append("class UserSearchRequest {\n");
    
    sb.append("  username: ").append(username).append("\n");
    sb.append("  isBlocked: ").append(isBlocked).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
