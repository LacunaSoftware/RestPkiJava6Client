package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PdfMarkImageModel;
import com.lacunasoftware.restpki.PadesVisualRectangleModel;
import java.util.*;
import com.lacunasoftware.restpki.PdfTextSectionModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PdfMarkElementModel   {
  
  public enum ElementTypeEnum {
     Text,  Image,  QRCode, 
  };
  private ElementTypeEnum elementType = null;
  private PadesVisualRectangleModel relativeContainer = null;
  private Integer rotation = null;
  private List<PdfTextSectionModel> textSections = new ArrayList<PdfTextSectionModel>();
  private PdfMarkImageModel image = null;
  private String qrCodeData = null;
  private Boolean qrCodeDrawQuietZones = null;
  public enum AlignEnum {
     Left,  Center,  Right, 
  };
  private AlignEnum align = null;
  private Double opacity = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("qrCodeData")
  public String getQrCodeData() {
    return qrCodeData;
  }
  public void setQrCodeData(String qrCodeData) {
    this.qrCodeData = qrCodeData;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("qrCodeDrawQuietZones")
  public Boolean getQrCodeDrawQuietZones() {
    return qrCodeDrawQuietZones;
  }
  public void setQrCodeDrawQuietZones(Boolean qrCodeDrawQuietZones) {
    this.qrCodeDrawQuietZones = qrCodeDrawQuietZones;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("align")
  public AlignEnum getAlign() {
    return align;
  }
  public void setAlign(AlignEnum align) {
    this.align = align;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("opacity")
  public Double getOpacity() {
    return opacity;
  }
  public void setOpacity(Double opacity) {
    this.opacity = opacity;
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
    sb.append("  qrCodeData: ").append(qrCodeData).append("\n");
    sb.append("  qrCodeDrawQuietZones: ").append(qrCodeDrawQuietZones).append("\n");
    sb.append("  align: ").append(align).append("\n");
    sb.append("  opacity: ").append(opacity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
