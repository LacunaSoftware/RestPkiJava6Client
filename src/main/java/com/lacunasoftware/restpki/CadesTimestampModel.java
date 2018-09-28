package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;
import com.lacunasoftware.restpki.FileModel;
import com.lacunasoftware.restpki.SignatureBStampModel;
import java.util.*;
import com.lacunasoftware.restpki.CadesSignerModel;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CadesTimestampModel   {
  
  private Date genTime = null;
  private String serialNumber = null;
  private DigestAlgorithmAndValueModel messageImprint = null;
  public enum EncapsulatedContentTypeEnum {
     Data,  SignedData,  EnvelopedData,  DigestedData,  EncryptedData,  AuthenticatedData,  TstInfo, 
  };
  private EncapsulatedContentTypeEnum encapsulatedContentType = null;
  private Boolean hasEncapsulatedContent = null;
  private List<CadesSignerModel> signers = new ArrayList<CadesSignerModel>();
  private FileModel encapsulatedContent = null;
  private FileModel auditPackage = null;
  private SignatureBStampModel bStamp = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("genTime")
  public Date getGenTime() {
    return genTime;
  }
  public void setGenTime(Date genTime) {
    this.genTime = genTime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("messageImprint")
  public DigestAlgorithmAndValueModel getMessageImprint() {
    return messageImprint;
  }
  public void setMessageImprint(DigestAlgorithmAndValueModel messageImprint) {
    this.messageImprint = messageImprint;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("encapsulatedContentType")
  public EncapsulatedContentTypeEnum getEncapsulatedContentType() {
    return encapsulatedContentType;
  }
  public void setEncapsulatedContentType(EncapsulatedContentTypeEnum encapsulatedContentType) {
    this.encapsulatedContentType = encapsulatedContentType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hasEncapsulatedContent")
  public Boolean getHasEncapsulatedContent() {
    return hasEncapsulatedContent;
  }
  public void setHasEncapsulatedContent(Boolean hasEncapsulatedContent) {
    this.hasEncapsulatedContent = hasEncapsulatedContent;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signers")
  public List<CadesSignerModel> getSigners() {
    return signers;
  }
  public void setSigners(List<CadesSignerModel> signers) {
    this.signers = signers;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("encapsulatedContent")
  public FileModel getEncapsulatedContent() {
    return encapsulatedContent;
  }
  public void setEncapsulatedContent(FileModel encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("auditPackage")
  public FileModel getAuditPackage() {
    return auditPackage;
  }
  public void setAuditPackage(FileModel auditPackage) {
    this.auditPackage = auditPackage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bStamp")
  public SignatureBStampModel getBStamp() {
    return bStamp;
  }
  public void setBStamp(SignatureBStampModel bStamp) {
    this.bStamp = bStamp;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadesTimestampModel {\n");
    
    sb.append("  genTime: ").append(genTime).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  messageImprint: ").append(messageImprint).append("\n");
    sb.append("  encapsulatedContentType: ").append(encapsulatedContentType).append("\n");
    sb.append("  hasEncapsulatedContent: ").append(hasEncapsulatedContent).append("\n");
    sb.append("  signers: ").append(signers).append("\n");
    sb.append("  encapsulatedContent: ").append(encapsulatedContent).append("\n");
    sb.append("  auditPackage: ").append(auditPackage).append("\n");
    sb.append("  bStamp: ").append(bStamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
