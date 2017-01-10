package com.lacunasoftware.restpki;

import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-10T18:51:53.435-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class BillingRequest   {
  
  private Date startDate = null;
  private Date endDate = null;
  private Boolean totalDescending = null;
  public enum TypeEnum {
     PadesSignature,  CertAuthentication,  CadesSignature,  XmlSignature,  Timestamp,  OpenSignature, 
  };

  private List<TypeEnum> type = new ArrayList<TypeEnum>();
  private Boolean success = null;
  private String orderingColumn = null;

  
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
  @JsonProperty("totalDescending")
  public Boolean getTotalDescending() {
    return totalDescending;
  }
  public void setTotalDescending(Boolean totalDescending) {
    this.totalDescending = totalDescending;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderingColumn")
  public String getOrderingColumn() {
    return orderingColumn;
  }
  public void setOrderingColumn(String orderingColumn) {
    this.orderingColumn = orderingColumn;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingRequest {\n");
    
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  totalDescending: ").append(totalDescending).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  orderingColumn: ").append(orderingColumn).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
