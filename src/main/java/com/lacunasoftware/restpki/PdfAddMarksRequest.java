package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.FileModel;
import java.util.*;
import com.lacunasoftware.restpki.PdfMarkModel;
import com.lacunasoftware.restpki.PadesPageOptimizationModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PdfAddMarksRequest   {
  
  private FileModel file = null;
  private List<PdfMarkModel> marks = new ArrayList<PdfMarkModel>();
  private Boolean abortIfSigned = null;
  public enum MeasurementUnitsEnum {
     Centimeters,  PdfPoints, 
  };
  private MeasurementUnitsEnum measurementUnits = null;
  private PadesPageOptimizationModel pageOptimization = null;
  private Boolean forceBlobResult = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("file")
  public FileModel getFile() {
    return file;
  }
  public void setFile(FileModel file) {
    this.file = file;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("marks")
  public List<PdfMarkModel> getMarks() {
    return marks;
  }
  public void setMarks(List<PdfMarkModel> marks) {
    this.marks = marks;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("abortIfSigned")
  public Boolean getAbortIfSigned() {
    return abortIfSigned;
  }
  public void setAbortIfSigned(Boolean abortIfSigned) {
    this.abortIfSigned = abortIfSigned;
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
  @JsonProperty("forceBlobResult")
  public Boolean getForceBlobResult() {
    return forceBlobResult;
  }
  public void setForceBlobResult(Boolean forceBlobResult) {
    this.forceBlobResult = forceBlobResult;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfAddMarksRequest {\n");
    
    sb.append("  file: ").append(file).append("\n");
    sb.append("  marks: ").append(marks).append("\n");
    sb.append("  abortIfSigned: ").append(abortIfSigned).append("\n");
    sb.append("  measurementUnits: ").append(measurementUnits).append("\n");
    sb.append("  pageOptimization: ").append(pageOptimization).append("\n");
    sb.append("  forceBlobResult: ").append(forceBlobResult).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
