package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PdfMarkImageModel;
import com.lacunasoftware.restpki.PadesVisualRectangleModel;
import java.util.*;
import com.lacunasoftware.restpki.PdfTextSectionModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-23T11:29:56.579-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PdfMarkElementModel   {
  
  public enum ElementTypeEnum {
     Text,  Image, 
  };
  private ElementTypeEnum elementType = null;
  private PadesVisualRectangleModel relativeContainer = null;
  private Integer rotation = null;
  private List<PdfTextSectionModel> textSections = new ArrayList<PdfTextSectionModel>();
  private PdfMarkImageModel image = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("elementType")
  public ElementTypeEnum getElementType() {
    return elementType;
  }
  public void setElementType(ElementTypeEnum elementType) {
    this.elementType = elementType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("relativeContainer")
  public PadesVisualRectangleModel getRelativeContainer() {
    return relativeContainer;
  }
  public void setRelativeContainer(PadesVisualRectangleModel relativeContainer) {
    this.relativeContainer = relativeContainer;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("rotation")
  public Integer getRotation() {
    return rotation;
  }
  public void setRotation(Integer rotation) {
    this.rotation = rotation;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("textSections")
  public List<PdfTextSectionModel> getTextSections() {
    return textSections;
  }
  public void setTextSections(List<PdfTextSectionModel> textSections) {
    this.textSections = textSections;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  public PdfMarkImageModel getImage() {
    return image;
  }
  public void setImage(PdfMarkImageModel image) {
    this.image = image;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfMarkElementModel {\n");
    
    sb.append("  elementType: ").append(elementType).append("\n");
    sb.append("  relativeContainer: ").append(relativeContainer).append("\n");
    sb.append("  rotation: ").append(rotation).append("\n");
    sb.append("  textSections: ").append(textSections).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
