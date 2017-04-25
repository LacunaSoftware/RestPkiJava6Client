package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesVisualRepresentationModel;
import java.util.*;
import com.lacunasoftware.restpki.PdfMarkModel;
import com.lacunasoftware.restpki.PadesPageOptimizationModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-17T15:30:21.925-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesSignaturePostRequestV1   {
  
  private String pdfToSign = null;
  private PadesVisualRepresentationModel visualRepresentation = null;
  private List<PdfMarkModel> pdfMarks = new ArrayList<PdfMarkModel>();
  private Boolean bypassMarksIfSigned = null;
  public enum MeasurementUnitsEnum {
     Centimeters,  PdfPoints, 
  };
  private MeasurementUnitsEnum measurementUnits = null;
  private PadesPageOptimizationModel pageOptimization = null;
  private String certificate = null;
  private String signaturePolicyId = null;
  private String securityContextId = null;
  private String callbackArgument = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pdfToSign")
  public String getPdfToSign() {
    return pdfToSign;
  }
  public void setPdfToSign(String pdfToSign) {
    this.pdfToSign = pdfToSign;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("visualRepresentation")
  public PadesVisualRepresentationModel getVisualRepresentation() {
    return visualRepresentation;
  }
  public void setVisualRepresentation(PadesVisualRepresentationModel visualRepresentation) {
    this.visualRepresentation = visualRepresentation;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pdfMarks")
  public List<PdfMarkModel> getPdfMarks() {
    return pdfMarks;
  }
  public void setPdfMarks(List<PdfMarkModel> pdfMarks) {
    this.pdfMarks = pdfMarks;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bypassMarksIfSigned")
  public Boolean getBypassMarksIfSigned() {
    return bypassMarksIfSigned;
  }
  public void setBypassMarksIfSigned(Boolean bypassMarksIfSigned) {
    this.bypassMarksIfSigned = bypassMarksIfSigned;
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
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signaturePolicyId")
  public String getSignaturePolicyId() {
    return signaturePolicyId;
  }
  public void setSignaturePolicyId(String signaturePolicyId) {
    this.signaturePolicyId = signaturePolicyId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("securityContextId")
  public String getSecurityContextId() {
    return securityContextId;
  }
  public void setSecurityContextId(String securityContextId) {
    this.securityContextId = securityContextId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("callbackArgument")
  public String getCallbackArgument() {
    return callbackArgument;
  }
  public void setCallbackArgument(String callbackArgument) {
    this.callbackArgument = callbackArgument;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesSignaturePostRequestV1 {\n");
    
    sb.append("  pdfToSign: ").append(pdfToSign).append("\n");
    sb.append("  visualRepresentation: ").append(visualRepresentation).append("\n");
    sb.append("  pdfMarks: ").append(pdfMarks).append("\n");
    sb.append("  bypassMarksIfSigned: ").append(bypassMarksIfSigned).append("\n");
    sb.append("  measurementUnits: ").append(measurementUnits).append("\n");
    sb.append("  pageOptimization: ").append(pageOptimization).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  signaturePolicyId: ").append(signaturePolicyId).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  callbackArgument: ").append(callbackArgument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
