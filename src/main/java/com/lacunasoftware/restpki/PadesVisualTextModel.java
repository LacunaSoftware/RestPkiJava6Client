package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesVisualRectangleModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesVisualTextModel   {
  
  private Double fontSize = null;
  private String text = null;
  private Boolean includeSigningTime = null;
  public enum HorizontalAlignEnum {
     Left,  Right, 
  };
  private HorizontalAlignEnum horizontalAlign = null;
  private PadesVisualRectangleModel container = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
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
  @JsonProperty("includeSigningTime")
  public Boolean getIncludeSigningTime() {
    return includeSigningTime;
  }
  public void setIncludeSigningTime(Boolean includeSigningTime) {
    this.includeSigningTime = includeSigningTime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("horizontalAlign")
  public HorizontalAlignEnum getHorizontalAlign() {
    return horizontalAlign;
  }
  public void setHorizontalAlign(HorizontalAlignEnum horizontalAlign) {
    this.horizontalAlign = horizontalAlign;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("container")
  public PadesVisualRectangleModel getContainer() {
    return container;
  }
  public void setContainer(PadesVisualRectangleModel container) {
    this.container = container;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesVisualTextModel {\n");
    
    sb.append("  fontSize: ").append(fontSize).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  includeSigningTime: ").append(includeSigningTime).append("\n");
    sb.append("  horizontalAlign: ").append(horizontalAlign).append("\n");
    sb.append("  container: ").append(container).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
