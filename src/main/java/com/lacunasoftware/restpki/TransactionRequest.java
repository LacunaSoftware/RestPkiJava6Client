package com.lacunasoftware.restpki;

import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TransactionRequest   {
  
  public enum TypeEnum {
     PadesSignature,  CertAuthentication,  CadesSignature,  XmlSignature,  Timestamp,  OpenSignature,  AddPdfMarks, 
  };

  private List<TypeEnum> type = new ArrayList<TypeEnum>();
  private Boolean success = null;
  private String invoiceId = null;

  
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
  @JsonProperty("invoiceId")
  public String getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequest {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  invoiceId: ").append(invoiceId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
