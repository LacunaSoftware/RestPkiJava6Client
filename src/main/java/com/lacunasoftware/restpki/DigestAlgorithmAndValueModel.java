package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class DigestAlgorithmAndValueModel   {
  
  public enum AlgorithmEnum {
     MD5,  SHA1,  SHA256,  SHA384,  SHA512, 
  };
  private AlgorithmEnum algorithm = null;
  private String value = null;
  private String hexValue = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("algorithm")
  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }
  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
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
    sb.append("class DigestAlgorithmAndValueModel {\n");
    
    sb.append("  algorithm: ").append(algorithm).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  hexValue: ").append(hexValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
