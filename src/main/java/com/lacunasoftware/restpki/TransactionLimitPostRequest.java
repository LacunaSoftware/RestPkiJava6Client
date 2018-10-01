package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TransactionLimitPostRequest   {
  
  private String transactionTypeCode = null;
  private String userId = null;
  private String parameter = null;
  private Integer limit = null;
  private Integer tolerancePercentage = null;
  private Integer warningPercentage = null;
  private Boolean overwrite = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionTypeCode")
  public String getTransactionTypeCode() {
    return transactionTypeCode;
  }
  public void setTransactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
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
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }
  public void setParameter(String parameter) {
    this.parameter = parameter;
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
  @JsonProperty("tolerancePercentage")
  public Integer getTolerancePercentage() {
    return tolerancePercentage;
  }
  public void setTolerancePercentage(Integer tolerancePercentage) {
    this.tolerancePercentage = tolerancePercentage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("warningPercentage")
  public Integer getWarningPercentage() {
    return warningPercentage;
  }
  public void setWarningPercentage(Integer warningPercentage) {
    this.warningPercentage = warningPercentage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("overwrite")
  public Boolean getOverwrite() {
    return overwrite;
  }
  public void setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionLimitPostRequest {\n");
    
    sb.append("  transactionTypeCode: ").append(transactionTypeCode).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  parameter: ").append(parameter).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  tolerancePercentage: ").append(tolerancePercentage).append("\n");
    sb.append("  warningPercentage: ").append(warningPercentage).append("\n");
    sb.append("  overwrite: ").append(overwrite).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
