package com.lacunasoftware.restpki;

import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-05T18:14:42.102-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TransactionRequest   {
  
  private Date startDate = null;
  private Date endDate = null;
  private Boolean mostRecentFirst = null;
  public enum TypeEnum {
     PadesSignature,  CertAuthentication,  CadesSignature,  XmlSignature,  Timestamp,  OpenSignature, 
  };

  private List<TypeEnum> type = new ArrayList<TypeEnum>();
  private Boolean success = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mostRecentFirst")
  public Boolean getMostRecentFirst() {
    return mostRecentFirst;
  }
  public void setMostRecentFirst(Boolean mostRecentFirst) {
    this.mostRecentFirst = mostRecentFirst;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public List<TypeEnum> getType() {
    return type;
  }
  public void setType(List<TypeEnum> type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequest {\n");
    
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  mostRecentFirst: ").append(mostRecentFirst).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
