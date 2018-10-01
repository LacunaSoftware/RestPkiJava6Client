package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.InvoiceModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class InvoicePostResponse   {
  
  private Boolean created = null;
  private InvoiceModel invoice = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Boolean getCreated() {
    return created;
  }
  public void setCreated(Boolean created) {
    this.created = created;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("invoice")
  public InvoiceModel getInvoice() {
    return invoice;
  }
  public void setInvoice(InvoiceModel invoice) {
    this.invoice = invoice;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePostResponse {\n");
    
    sb.append("  created: ").append(created).append("\n");
    sb.append("  invoice: ").append(invoice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
