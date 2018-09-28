package com.lacunasoftware.restpki;

import java.util.*;
import com.lacunasoftware.restpki.TransactionCountModel;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class InvoiceModel   {
  
  private List<TransactionCountModel> transactions = new ArrayList<TransactionCountModel>();
  private String id = null;
  private Date dateCreated = null;
  private Date maxDate = null;
  private String name = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transactions")
  public List<TransactionCountModel> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<TransactionCountModel> transactions) {
    this.transactions = transactions;
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
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("maxDate")
  public Date getMaxDate() {
    return maxDate;
  }
  public void setMaxDate(Date maxDate) {
    this.maxDate = maxDate;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceModel {\n");
    
    sb.append("  transactions: ").append(transactions).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  dateCreated: ").append(dateCreated).append("\n");
    sb.append("  maxDate: ").append(maxDate).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
