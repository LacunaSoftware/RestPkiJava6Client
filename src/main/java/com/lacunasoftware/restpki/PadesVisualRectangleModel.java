package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesVisualRectangleModel   {
  
  private Double left = null;
  private Double top = null;
  private Double right = null;
  private Double bottom = null;
  private Double width = null;
  private Double height = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("left")
  public Double getLeft() {
    return left;
  }
  public void setLeft(Double left) {
    this.left = left;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("top")
  public Double getTop() {
    return top;
  }
  public void setTop(Double top) {
    this.top = top;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("right")
  public Double getRight() {
    return right;
  }
  public void setRight(Double right) {
    this.right = right;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bottom")
  public Double getBottom() {
    return bottom;
  }
  public void setBottom(Double bottom) {
    this.bottom = bottom;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("width")
  public Double getWidth() {
    return width;
  }
  public void setWidth(Double width) {
    this.width = width;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesVisualRectangleModel {\n");
    
    sb.append("  left: ").append(left).append("\n");
    sb.append("  top: ").append(top).append("\n");
    sb.append("  right: ").append(right).append("\n");
    sb.append("  bottom: ").append(bottom).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
