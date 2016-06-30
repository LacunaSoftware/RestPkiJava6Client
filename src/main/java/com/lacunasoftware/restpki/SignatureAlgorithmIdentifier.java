package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SignatureAlgorithmIdentifier   {
  
  public enum AlgorithmEnum {
     MD5WithRSA,  SHA1WithRSA,  SHA256WithRSA,  SHA384WithRSA,  SHA512WithRSA, 
  };
  private AlgorithmEnum algorithm = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureAlgorithmIdentifier {\n");
    
    sb.append("  algorithm: ").append(algorithm).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
