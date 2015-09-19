package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class GetLongTermTokenResponse   {
  
  private String userName = null;
  private String accessToken = null;
  private String issued = null;
  private String expires = null;
  private Integer expiresIn = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("issued")
  public String getIssued() {
    return issued;
  }
  public void setIssued(String issued) {
    this.issued = issued;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("expires")
  public String getExpires() {
    return expires;
  }
  public void setExpires(String expires) {
    this.expires = expires;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("expiresIn")
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLongTermTokenResponse {\n");
    
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  issued: ").append(issued).append("\n");
    sb.append("  expires: ").append(expires).append("\n");
    sb.append("  expiresIn: ").append(expiresIn).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
