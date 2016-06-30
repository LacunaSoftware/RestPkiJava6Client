package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SignaturePolicyData   {
  
  private String name = null;
  public enum TypeEnum {
     Unknown,  Pades,  Cades,  Xml, 
  };
  private TypeEnum type = null;
  private String underlyingPolicyId = null;
  private String securityContextId = null;
  private String timestampPlanId = null;

  
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
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("underlyingPolicyId")
  public String getUnderlyingPolicyId() {
    return underlyingPolicyId;
  }
  public void setUnderlyingPolicyId(String underlyingPolicyId) {
    this.underlyingPolicyId = underlyingPolicyId;
  }

  
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
  @JsonProperty("timestampPlanId")
  public String getTimestampPlanId() {
    return timestampPlanId;
  }
  public void setTimestampPlanId(String timestampPlanId) {
    this.timestampPlanId = timestampPlanId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignaturePolicyData {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  underlyingPolicyId: ").append(underlyingPolicyId).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  timestampPlanId: ").append(timestampPlanId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
