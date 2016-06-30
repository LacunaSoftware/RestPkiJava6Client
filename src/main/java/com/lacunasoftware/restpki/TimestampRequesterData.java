package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TimestampRequesterData   {
  
  private String name = null;
  private String url = null;
  public enum AuthenticationMethodEnum {
     None,  MutualSSL,  Basic,  OAuthBearerToken, 
  };
  private AuthenticationMethodEnum authenticationMethod = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("authenticationMethod")
  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }
  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampRequesterData {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  authenticationMethod: ").append(authenticationMethod).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
