package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesVisualRectangleModel;
import com.lacunasoftware.restpki.PadesSizeModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesVisualAutoPositioningModel   {
  
  private PadesVisualRectangleModel container = null;
  private PadesSizeModel signatureRectangleSize = null;
  private Double rowSpacing = null;

  
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
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("signatureRectangleSize")
  public PadesSizeModel getSignatureRectangleSize() {
    return signatureRectangleSize;
  }
  public void setSignatureRectangleSize(PadesSizeModel signatureRectangleSize) {
    this.signatureRectangleSize = signatureRectangleSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("rowSpacing")
  public Double getRowSpacing() {
    return rowSpacing;
  }
  public void setRowSpacing(Double rowSpacing) {
    this.rowSpacing = rowSpacing;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesVisualAutoPositioningModel {\n");
    
    sb.append("  container: ").append(container).append("\n");
    sb.append("  signatureRectangleSize: ").append(signatureRectangleSize).append("\n");
    sb.append("  rowSpacing: ").append(rowSpacing).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
