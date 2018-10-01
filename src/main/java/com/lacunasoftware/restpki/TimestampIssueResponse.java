package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CadesTimestampModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TimestampIssueResponse   {
  
  private String encodedValue = null;
  private CadesTimestampModel info = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("encodedValue")
  public String getEncodedValue() {
    return encodedValue;
  }
  public void setEncodedValue(String encodedValue) {
    this.encodedValue = encodedValue;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("info")
  public CadesTimestampModel getInfo() {
    return info;
  }
  public void setInfo(CadesTimestampModel info) {
    this.info = info;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampIssueResponse {\n");
    
    sb.append("  encodedValue: ").append(encodedValue).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
