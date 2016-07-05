package com.lacunasoftware.restpki;

import java.util.*;
import com.lacunasoftware.restpki.TransactionSummary;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-05T18:14:42.102-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TransactionList   {
  
  private List<TransactionSummary> transactions = new ArrayList<TransactionSummary>();
  private Integer firstIndex = null;
  private Integer totalCount = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transactions")
  public List<TransactionSummary> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<TransactionSummary> transactions) {
    this.transactions = transactions;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("firstIndex")
  public Integer getFirstIndex() {
    return firstIndex;
  }
  public void setFirstIndex(Integer firstIndex) {
    this.firstIndex = firstIndex;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionList {\n");
    
    sb.append("  transactions: ").append(transactions).append("\n");
    sb.append("  firstIndex: ").append(firstIndex).append("\n");
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
