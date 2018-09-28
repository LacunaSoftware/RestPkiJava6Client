package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class AuthenticationsPostRequest   {
  
  private String securityContextId = null;
  private Boolean ignoreRevocationStatusUnknown = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("securityContextId")
  public String getSecurityContextId() {
    return securityContextId;
  }
  public void setSecurityContextId(String securityContextId) {
    this.securityContextId = securityContextId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ignoreRevocationStatusUnknown")
  public Boolean getIgnoreRevocationStatusUnknown() {
    return ignoreRevocationStatusUnknown;
  }
  public void setIgnoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
    this.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationsPostRequest {\n");
    
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  ignoreRevocationStatusUnknown: ").append(ignoreRevocationStatusUnknown).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
