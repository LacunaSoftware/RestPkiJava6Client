package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-21T14:48:34.437-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UserPutPasswordRequest   {
  
  private String password = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPutPasswordRequest {\n");
    
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
