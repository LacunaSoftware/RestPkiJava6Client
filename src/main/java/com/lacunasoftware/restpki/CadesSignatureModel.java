package com.lacunasoftware.restpki;

import java.util.*;
import com.lacunasoftware.restpki.CadesSignerModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CadesSignatureModel   {
  
  public enum EncapsulatedContentTypeEnum {
     Data,  SignedData,  EnvelopedData,  DigestedData,  EncryptedData,  AuthenticatedData,  TstInfo, 
  };
  private EncapsulatedContentTypeEnum encapsulatedContentType = null;
  private Boolean hasEncapsulatedContent = null;
  private List<CadesSignerModel> signers = new ArrayList<CadesSignerModel>();

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadesSignatureModel {\n");
    
    sb.append("  encapsulatedContentType: ").append(encapsulatedContentType).append("\n");
    sb.append("  hasEncapsulatedContent: ").append(hasEncapsulatedContent).append("\n");
    sb.append("  signers: ").append(signers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
