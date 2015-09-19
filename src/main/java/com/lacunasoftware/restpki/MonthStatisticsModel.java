package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class MonthStatisticsModel   {
  
  private String month = null;
  private Integer signatures = null;
  private Integer authentications = null;
  private Integer errors = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("month")
  public String getMonth() {
    return month;
  }
  public void setMonth(String month) {
    this.month = month;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signatures")
  public Integer getSignatures() {
    return signatures;
  }
  public void setSignatures(Integer signatures) {
    this.signatures = signatures;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("authentications")
  public Integer getAuthentications() {
    return authentications;
  }
  public void setAuthentications(Integer authentications) {
    this.authentications = authentications;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  public Integer getErrors() {
    return errors;
  }
  public void setErrors(Integer errors) {
    this.errors = errors;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthStatisticsModel {\n");
    
    sb.append("  month: ").append(month).append("\n");
    sb.append("  signatures: ").append(signatures).append("\n");
    sb.append("  authentications: ").append(authentications).append("\n");
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
