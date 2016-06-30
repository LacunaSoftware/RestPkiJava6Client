package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.SignatureAlgorithmIdentifier;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SignatureAlgorithmAndValueModel   {
  
  private SignatureAlgorithmIdentifier algorithmIdentifier = null;
  private String value = null;
  private String hexValue = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("algorithmIdentifier")
  public SignatureAlgorithmIdentifier getAlgorithmIdentifier() {
    return algorithmIdentifier;
  }
  public void setAlgorithmIdentifier(SignatureAlgorithmIdentifier algorithmIdentifier) {
    this.algorithmIdentifier = algorithmIdentifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hexValue")
  public String getHexValue() {
    return hexValue;
  }
  public void setHexValue(String hexValue) {
    this.hexValue = hexValue;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureAlgorithmAndValueModel {\n");
    
    sb.append("  algorithmIdentifier: ").append(algorithmIdentifier).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  hexValue: ").append(hexValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
