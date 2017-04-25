package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.FileModel;
import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-17T15:30:21.925-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class OpenCadesSignatureRequestModel extends OpenSignatureRequestModel {
  
  private Boolean extractEncapsulatedContent = null;
  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("extractEncapsulatedContent")
  public Boolean getExtractEncapsulatedContent() {
    return extractEncapsulatedContent;
  }
  public void setExtractEncapsulatedContent(Boolean extractEncapsulatedContent) {
    this.extractEncapsulatedContent = extractEncapsulatedContent;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenCadesSignatureRequestModel {\n");
    
    sb.append("  extractEncapsulatedContent: ").append(extractEncapsulatedContent).append("\n");
    sb.append("  file: ").append(file).append("\n");
    sb.append("  validate: ").append(validate).append("\n");
    sb.append("  defaultSignaturePolicyId: ").append(defaultSignaturePolicyId).append("\n");
    sb.append("  acceptableExplicitPolicies: ").append(acceptableExplicitPolicies).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  dataHashes: ").append(dataHashes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
