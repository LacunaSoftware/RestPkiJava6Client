package com.lacunasoftware.restpki;

import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class InvoicePostRequest   {
  
  private Date maxDate = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePostRequest {\n");
    
    sb.append("  maxDate: ").append(maxDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
