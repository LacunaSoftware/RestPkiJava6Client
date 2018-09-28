package com.lacunasoftware.restpki;

import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class RecurringTaskStatus   {
  
  private Boolean successful = null;
  private Date lastExecution = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("successful")
  public Boolean getSuccessful() {
    return successful;
  }
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastExecution")
  public Date getLastExecution() {
    return lastExecution;
  }
  public void setLastExecution(Date lastExecution) {
    this.lastExecution = lastExecution;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTaskStatus {\n");
    
    sb.append("  successful: ").append(successful).append("\n");
    sb.append("  lastExecution: ").append(lastExecution).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
