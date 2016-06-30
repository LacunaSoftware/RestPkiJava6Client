package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.SecurityContextSummary;
import com.lacunasoftware.restpki.TimestampPlanSummary;
import com.lacunasoftware.restpki.SignaturePolicySummary;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SignaturePolicyModel   {
  
  private SecurityContextSummary securityContext = null;
  private TimestampPlanSummary timestampPlan = null;
  private SignaturePolicySummary underlyingPolicy = null;
  private String id = null;
  private String name = null;
  public enum TypeEnum {
     Unknown,  Pades,  Cades,  Xml, 
  };
  private TypeEnum type = null;
  private Boolean isReadOnly = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("securityContext")
  public SecurityContextSummary getSecurityContext() {
    return securityContext;
  }
  public void setSecurityContext(SecurityContextSummary securityContext) {
    this.securityContext = securityContext;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timestampPlan")
  public TimestampPlanSummary getTimestampPlan() {
    return timestampPlan;
  }
  public void setTimestampPlan(TimestampPlanSummary timestampPlan) {
    this.timestampPlan = timestampPlan;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("underlyingPolicy")
  public SignaturePolicySummary getUnderlyingPolicy() {
    return underlyingPolicy;
  }
  public void setUnderlyingPolicy(SignaturePolicySummary underlyingPolicy) {
    this.underlyingPolicy = underlyingPolicy;
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
  @JsonProperty("isReadOnly")
  public Boolean getIsReadOnly() {
    return isReadOnly;
  }
  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignaturePolicyModel {\n");
    
    sb.append("  securityContext: ").append(securityContext).append("\n");
    sb.append("  timestampPlan: ").append(timestampPlan).append("\n");
    sb.append("  underlyingPolicy: ").append(underlyingPolicy).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  isReadOnly: ").append(isReadOnly).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
