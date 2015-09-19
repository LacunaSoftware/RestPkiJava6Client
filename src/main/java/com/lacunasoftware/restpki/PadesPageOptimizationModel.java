package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesSizeModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesPageOptimizationModel   {
  
  public enum PaperSizeEnum {
     Custom,  A0,  A1,  A2,  A3,  A4,  A5,  A6,  A7,  A8,  Letter,  Legal,  Ledger, 
  };
  private PaperSizeEnum paperSize = null;
  private PadesSizeModel customPaperSize = null;
  public enum PageOrientationEnum {
     Auto,  Portrait,  Landscape, 
  };
  private PageOrientationEnum pageOrientation = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("paperSize")
  public PaperSizeEnum getPaperSize() {
    return paperSize;
  }
  public void setPaperSize(PaperSizeEnum paperSize) {
    this.paperSize = paperSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("customPaperSize")
  public PadesSizeModel getCustomPaperSize() {
    return customPaperSize;
  }
  public void setCustomPaperSize(PadesSizeModel customPaperSize) {
    this.customPaperSize = customPaperSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pageOrientation")
  public PageOrientationEnum getPageOrientation() {
    return pageOrientation;
  }
  public void setPageOrientation(PageOrientationEnum pageOrientation) {
    this.pageOrientation = pageOrientation;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesPageOptimizationModel {\n");
    
    sb.append("  paperSize: ").append(paperSize).append("\n");
    sb.append("  customPaperSize: ").append(customPaperSize).append("\n");
    sb.append("  pageOrientation: ").append(pageOrientation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
