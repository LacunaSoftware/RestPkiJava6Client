package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.ColorModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-23T11:29:56.579-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PdfTextSectionModel   {
  
  private String text = null;
  public enum StyleEnum {
     Normal,  Bold,  Italic, 
  };
  private StyleEnum style = null;
  private ColorModel color = null;
  private Double fontSize = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("style")
  public StyleEnum getStyle() {
    return style;
  }
  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("color")
  public ColorModel getColor() {
    return color;
  }
  public void setColor(ColorModel color) {
    this.color = color;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fontSize")
  public Double getFontSize() {
    return fontSize;
  }
  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfTextSectionModel {\n");
    
    sb.append("  text: ").append(text).append("\n");
    sb.append("  style: ").append(style).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("  fontSize: ").append(fontSize).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
