package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CountEntry;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TransactionCountModel   {
  
  public enum TypeEnum {
     PadesSignature,  CertAuthentication,  CadesSignature,  XmlSignature,  Timestamp,  OpenSignature,  AddPdfMarks, 
  };
  private TypeEnum type = null;
  private String parameter = null;
  private CountEntry count = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("parameter")
  public String getParameter() {
    return parameter;
  }
  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("count")
  public CountEntry getCount() {
    return count;
  }
  public void setCount(CountEntry count) {
    this.count = count;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCountModel {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  parameter: ").append(parameter).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
