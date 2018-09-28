package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesVisualRectangleModel;
import com.lacunasoftware.restpki.ColorModel;
import com.lacunasoftware.restpki.PdfMarkElementModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PdfMarkModel   {
  
  private PadesVisualRectangleModel container = null;
  private Double borderWidth = null;
  private ColorModel borderColor = null;
  private ColorModel backgroundColor = null;
  private List<PdfMarkElementModel> elements = new ArrayList<PdfMarkElementModel>();
  public enum PageOptionEnum {
     AllPages,  SinglePage,  SinglePageFromEnd,  NewPage, 
  };
  private PageOptionEnum pageOption = null;
  private Integer pageOptionNumber = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("container")
  public PadesVisualRectangleModel getContainer() {
    return container;
  }
  public void setContainer(PadesVisualRectangleModel container) {
    this.container = container;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("borderWidth")
  public Double getBorderWidth() {
    return borderWidth;
  }
  public void setBorderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("borderColor")
  public ColorModel getBorderColor() {
    return borderColor;
  }
  public void setBorderColor(ColorModel borderColor) {
    this.borderColor = borderColor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("backgroundColor")
  public ColorModel getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(ColorModel backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("elements")
  public List<PdfMarkElementModel> getElements() {
    return elements;
  }
  public void setElements(List<PdfMarkElementModel> elements) {
    this.elements = elements;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pageOption")
  public PageOptionEnum getPageOption() {
    return pageOption;
  }
  public void setPageOption(PageOptionEnum pageOption) {
    this.pageOption = pageOption;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pageOptionNumber")
  public Integer getPageOptionNumber() {
    return pageOptionNumber;
  }
  public void setPageOptionNumber(Integer pageOptionNumber) {
    this.pageOptionNumber = pageOptionNumber;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfMarkModel {\n");
    
    sb.append("  container: ").append(container).append("\n");
    sb.append("  borderWidth: ").append(borderWidth).append("\n");
    sb.append("  borderColor: ").append(borderColor).append("\n");
    sb.append("  backgroundColor: ").append(backgroundColor).append("\n");
    sb.append("  elements: ").append(elements).append("\n");
    sb.append("  pageOption: ").append(pageOption).append("\n");
    sb.append("  pageOptionNumber: ").append(pageOptionNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
