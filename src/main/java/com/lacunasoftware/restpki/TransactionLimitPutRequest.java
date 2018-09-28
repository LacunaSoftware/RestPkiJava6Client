package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TransactionLimitPutRequest   {
  
  private String id = null;
  private Integer limit = null;
  private Integer tolerancePercentage = null;
  private Integer warningPercentage = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionLimitPutRequest {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  tolerancePercentage: ").append(tolerancePercentage).append("\n");
    sb.append("  warningPercentage: ").append(warningPercentage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
