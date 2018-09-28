package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.FileModel;
import com.lacunasoftware.restpki.SignatureBStampModel;
import java.util.*;
import com.lacunasoftware.restpki.XmlSignatureModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlSignatureResponseModel   {
  
  private List<XmlSignatureModel> signatures = new ArrayList<XmlSignatureModel>();
  private FileModel auditPackage = null;
  private SignatureBStampModel bStamp = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signatures")
  public List<XmlSignatureModel> getSignatures() {
    return signatures;
  }
  public void setSignatures(List<XmlSignatureModel> signatures) {
    this.signatures = signatures;
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
    sb.append("class XmlSignatureResponseModel {\n");
    
    sb.append("  signatures: ").append(signatures).append("\n");
    sb.append("  auditPackage: ").append(auditPackage).append("\n");
    sb.append("  bStamp: ").append(bStamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
