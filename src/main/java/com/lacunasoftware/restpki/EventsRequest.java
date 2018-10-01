package com.lacunasoftware.restpki;

import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class EventsRequest   {
  
  private Date startDate = null;
  private Date endDate = null;
  public enum OperationsEnum {
     AccessTokenGenerated,  AccessTokensRevoked,  CertAuthStarted,  CertAuthCompleted,  PadesSignatureStarted,  PadesSignatureCompleted,  CadesSignatureStarted,  CadesSignatureCompleted,  XmlSignatureStarted,  XmlSignatureCompleted,  OpenSignature,  IssueTimestamp,  AddPdfMarks,  GetPendingSignature,  SetPendingSignature, 
  };

  private List<OperationsEnum> operations = new ArrayList<OperationsEnum>();
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
  @JsonProperty("operations")
  public List<OperationsEnum> getOperations() {
    return operations;
  }
  public void setOperations(List<OperationsEnum> operations) {
    this.operations = operations;
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
    sb.append("class EventsRequest {\n");
    
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  operations: ").append(operations).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
