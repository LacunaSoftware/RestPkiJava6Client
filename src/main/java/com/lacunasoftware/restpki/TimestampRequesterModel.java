package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateSummary;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TimestampRequesterModel   {
  
  private String url = null;
  private String tsaPolicyId = null;
  public enum AuthenticationMethodEnum {
     None,  MutualSSL,  Basic,  OAuthBearerToken, 
  };
  private AuthenticationMethodEnum authenticationMethod = null;
  private String basicUsername = null;
  private CertificateSummary sslCertificate = null;
  private String id = null;
  private String name = null;
  private Boolean isAvailable = null;
  private Boolean isEnabled = null;

  
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
  @JsonProperty("tsaPolicyId")
  public String getTsaPolicyId() {
    return tsaPolicyId;
  }
  public void setTsaPolicyId(String tsaPolicyId) {
    this.tsaPolicyId = tsaPolicyId;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("basicUsername")
  public String getBasicUsername() {
    return basicUsername;
  }
  public void setBasicUsername(String basicUsername) {
    this.basicUsername = basicUsername;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sslCertificate")
  public CertificateSummary getSslCertificate() {
    return sslCertificate;
  }
  public void setSslCertificate(CertificateSummary sslCertificate) {
    this.sslCertificate = sslCertificate;
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
  @JsonProperty("isAvailable")
  public Boolean getIsAvailable() {
    return isAvailable;
  }
  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampRequesterModel {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  tsaPolicyId: ").append(tsaPolicyId).append("\n");
    sb.append("  authenticationMethod: ").append(authenticationMethod).append("\n");
    sb.append("  basicUsername: ").append(basicUsername).append("\n");
    sb.append("  sslCertificate: ").append(sslCertificate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  isAvailable: ").append(isAvailable).append("\n");
    sb.append("  isEnabled: ").append(isEnabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
