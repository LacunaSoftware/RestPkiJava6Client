package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-17T15:30:21.925-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SystemInfo   {
  
  private String productName = null;
  private String productVersion = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("productName")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("productVersion")
  public String getProductVersion() {
    return productVersion;
  }
  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    
    sb.append("  productName: ").append(productName).append("\n");
    sb.append("  productVersion: ").append(productVersion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
