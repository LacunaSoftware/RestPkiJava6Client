package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TransactionLimitModel   {
  
  private String id = null;
  private String userId = null;
  private String typeName = null;
  private String typeCode = null;
  private Integer limit = null;
  private Integer tolerance = null;
  private Integer warning = null;
  private String parameter = null;

  
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
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("typeName")
  public String getTypeName() {
    return typeName;
  }
  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("typeCode")
  public String getTypeCode() {
    return typeCode;
  }
  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tolerance")
  public Integer getTolerance() {
    return tolerance;
  }
  public void setTolerance(Integer tolerance) {
    this.tolerance = tolerance;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("warning")
  public Integer getWarning() {
    return warning;
  }
  public void setWarning(Integer warning) {
    this.warning = warning;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionLimitModel {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  typeName: ").append(typeName).append("\n");
    sb.append("  typeCode: ").append(typeCode).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  tolerance: ").append(tolerance).append("\n");
    sb.append("  warning: ").append(warning).append("\n");
    sb.append("  parameter: ").append(parameter).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
