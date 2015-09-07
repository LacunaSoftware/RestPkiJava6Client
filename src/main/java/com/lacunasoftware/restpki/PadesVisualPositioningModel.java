package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesVisualRectangleModel;
import com.lacunasoftware.restpki.PadesPageOptimizationModel;
import com.lacunasoftware.restpki.PadesVisualAutoPositioningModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesVisualPositioningModel   {
  
  private Integer pageNumber = null;
  public enum MeasurementUnitsEnum {
     Centimeters,  PdfPoints, 
  };
  private MeasurementUnitsEnum measurementUnits = null;
  private PadesPageOptimizationModel pageOptimization = null;
  private PadesVisualAutoPositioningModel auto = null;
  private PadesVisualRectangleModel manual = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("measurementUnits")
  public MeasurementUnitsEnum getMeasurementUnits() {
    return measurementUnits;
  }
  public void setMeasurementUnits(MeasurementUnitsEnum measurementUnits) {
    this.measurementUnits = measurementUnits;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pageOptimization")
  public PadesPageOptimizationModel getPageOptimization() {
    return pageOptimization;
  }
  public void setPageOptimization(PadesPageOptimizationModel pageOptimization) {
    this.pageOptimization = pageOptimization;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("auto")
  public PadesVisualAutoPositioningModel getAuto() {
    return auto;
  }
  public void setAuto(PadesVisualAutoPositioningModel auto) {
    this.auto = auto;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("manual")
  public PadesVisualRectangleModel getManual() {
    return manual;
  }
  public void setManual(PadesVisualRectangleModel manual) {
    this.manual = manual;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesVisualPositioningModel {\n");
    
    sb.append("  pageNumber: ").append(pageNumber).append("\n");
    sb.append("  measurementUnits: ").append(measurementUnits).append("\n");
    sb.append("  pageOptimization: ").append(pageOptimization).append("\n");
    sb.append("  auto: ").append(auto).append("\n");
    sb.append("  manual: ").append(manual).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
