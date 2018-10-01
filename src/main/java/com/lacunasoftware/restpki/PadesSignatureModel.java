package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.FileModel;
import com.lacunasoftware.restpki.PadesSignerModel;
import com.lacunasoftware.restpki.SignatureBStampModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesSignatureModel   {
  
  private List<PadesSignerModel> signers = new ArrayList<PadesSignerModel>();
  private FileModel auditPackage = null;
  private SignatureBStampModel bStamp = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signers")
  public List<PadesSignerModel> getSigners() {
    return signers;
  }
  public void setSigners(List<PadesSignerModel> signers) {
    this.signers = signers;
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
    sb.append("class PadesSignatureModel {\n");
    
    sb.append("  signers: ").append(signers).append("\n");
    sb.append("  auditPackage: ").append(auditPackage).append("\n");
    sb.append("  bStamp: ").append(bStamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
