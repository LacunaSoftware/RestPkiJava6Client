package com.lacunasoftware.restpki;

import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-05T18:14:42.102-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class EventModel   {
  
  private String details = null;
  private String id = null;
  private Date date = null;
  public enum OperationEnum {
     AccessTokenGenerated,  AccessTokensRevoked,  CertAuthStarted,  CertAuthCompleted,  PadesSignatureStarted,  PadesSignatureCompleted,  CadesSignatureStarted,  CadesSignatureCompleted,  XmlSignatureStarted,  XmlSignatureCompleted,  OpenSignature, 
  };
  private OperationEnum operation = null;
  private Boolean success = null;
  private Boolean hasDetails = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
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
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hasDetails")
  public Boolean getHasDetails() {
    return hasDetails;
  }
  public void setHasDetails(Boolean hasDetails) {
    this.hasDetails = hasDetails;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventModel {\n");
    
    sb.append("  details: ").append(details).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  operation: ").append(operation).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  hasDetails: ").append(hasDetails).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
