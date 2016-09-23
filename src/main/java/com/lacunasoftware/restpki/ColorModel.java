package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-23T11:29:56.579-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class ColorModel   {
  
  private Integer red = null;
  private Integer green = null;
  private Integer blue = null;
  private Double alpha = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("red")
  public Integer getRed() {
    return red;
  }
  public void setRed(Integer red) {
    this.red = red;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("green")
  public Integer getGreen() {
    return green;
  }
  public void setGreen(Integer green) {
    this.green = green;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("blue")
  public Integer getBlue() {
    return blue;
  }
  public void setBlue(Integer blue) {
    this.blue = blue;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("alpha")
  public Double getAlpha() {
    return alpha;
  }
  public void setAlpha(Double alpha) {
    this.alpha = alpha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorModel {\n");
    
    sb.append("  red: ").append(red).append("\n");
    sb.append("  green: ").append(green).append("\n");
    sb.append("  blue: ").append(blue).append("\n");
    sb.append("  alpha: ").append(alpha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
