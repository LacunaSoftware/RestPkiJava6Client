package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.RecurringTaskStatus;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class RecurringTaskStatusModel   {
  
  private RecurringTaskStatus refreshTransactionCount = null;
  private RecurringTaskStatus refreshTransactionLimits = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("refreshTransactionCount")
  public RecurringTaskStatus getRefreshTransactionCount() {
    return refreshTransactionCount;
  }
  public void setRefreshTransactionCount(RecurringTaskStatus refreshTransactionCount) {
    this.refreshTransactionCount = refreshTransactionCount;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("refreshTransactionLimits")
  public RecurringTaskStatus getRefreshTransactionLimits() {
    return refreshTransactionLimits;
  }
  public void setRefreshTransactionLimits(RecurringTaskStatus refreshTransactionLimits) {
    this.refreshTransactionLimits = refreshTransactionLimits;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTaskStatusModel {\n");
    
    sb.append("  refreshTransactionCount: ").append(refreshTransactionCount).append("\n");
    sb.append("  refreshTransactionLimits: ").append(refreshTransactionLimits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
