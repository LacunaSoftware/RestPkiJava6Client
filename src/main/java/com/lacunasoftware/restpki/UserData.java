package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-21T14:48:34.437-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserData   {
  
  private Boolean isAdmin = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserData {\n");
    
    sb.append("  isAdmin: ").append(isAdmin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
