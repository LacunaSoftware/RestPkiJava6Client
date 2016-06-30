package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.FileModel;
import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class OpenSignatureRequestModel   {
  
  private FileModel file = null;
  private Boolean validate = null;
  private String implicitValidationPolicy = null;
  private List<String> explicitValidationPolicies = new ArrayList<String>();
  private String validationSecurityContext = null;
  private List<DigestAlgorithmAndValueModel> dataHashes = new ArrayList<DigestAlgorithmAndValueModel>();

  
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
  @ApiModelProperty(value = "")
  @JsonProperty("validate")
  public Boolean getValidate() {
    return validate;
  }
  public void setValidate(Boolean validate) {
    this.validate = validate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("implicitValidationPolicy")
  public String getImplicitValidationPolicy() {
    return implicitValidationPolicy;
  }
  public void setImplicitValidationPolicy(String implicitValidationPolicy) {
    this.implicitValidationPolicy = implicitValidationPolicy;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("explicitValidationPolicies")
  public List<String> getExplicitValidationPolicies() {
    return explicitValidationPolicies;
  }
  public void setExplicitValidationPolicies(List<String> explicitValidationPolicies) {
    this.explicitValidationPolicies = explicitValidationPolicies;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("validationSecurityContext")
  public String getValidationSecurityContext() {
    return validationSecurityContext;
  }
  public void setValidationSecurityContext(String validationSecurityContext) {
    this.validationSecurityContext = validationSecurityContext;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dataHashes")
  public List<DigestAlgorithmAndValueModel> getDataHashes() {
    return dataHashes;
  }
  public void setDataHashes(List<DigestAlgorithmAndValueModel> dataHashes) {
    this.dataHashes = dataHashes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenSignatureRequestModel {\n");
    
    sb.append("  file: ").append(file).append("\n");
    sb.append("  validate: ").append(validate).append("\n");
    sb.append("  implicitValidationPolicy: ").append(implicitValidationPolicy).append("\n");
    sb.append("  explicitValidationPolicies: ").append(explicitValidationPolicies).append("\n");
    sb.append("  validationSecurityContext: ").append(validationSecurityContext).append("\n");
    sb.append("  dataHashes: ").append(dataHashes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
