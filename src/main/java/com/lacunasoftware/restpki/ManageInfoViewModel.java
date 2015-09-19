package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.ExternalLoginViewModel;
import com.lacunasoftware.restpki.UserLoginInfoViewModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class ManageInfoViewModel   {
  
  private String localLoginProvider = null;
  private String email = null;
  private List<UserLoginInfoViewModel> logins = new ArrayList<UserLoginInfoViewModel>();
  private List<ExternalLoginViewModel> externalLoginProviders = new ArrayList<ExternalLoginViewModel>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("localLoginProvider")
  public String getLocalLoginProvider() {
    return localLoginProvider;
  }
  public void setLocalLoginProvider(String localLoginProvider) {
    this.localLoginProvider = localLoginProvider;
  }

  
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
  @JsonProperty("logins")
  public List<UserLoginInfoViewModel> getLogins() {
    return logins;
  }
  public void setLogins(List<UserLoginInfoViewModel> logins) {
    this.logins = logins;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("externalLoginProviders")
  public List<ExternalLoginViewModel> getExternalLoginProviders() {
    return externalLoginProviders;
  }
  public void setExternalLoginProviders(List<ExternalLoginViewModel> externalLoginProviders) {
    this.externalLoginProviders = externalLoginProviders;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManageInfoViewModel {\n");
    
    sb.append("  localLoginProvider: ").append(localLoginProvider).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  logins: ").append(logins).append("\n");
    sb.append("  externalLoginProviders: ").append(externalLoginProviders).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
