package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.FileModel;
import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;
import com.lacunasoftware.restpki.AuditPackageOptions;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class OpenCadesSignatureRequestModel   {
  
  private Boolean extractEncapsulatedContent = null;
  private FileModel file = null;
  private Boolean validate = null;
  private AuditPackageOptions auditPackage = null;
  private String defaultSignaturePolicyId = null;
  private List<String> acceptableExplicitPolicies = new ArrayList<String>();
  private String securityContextId = null;
  private Boolean ignoreRevocationStatusUnknown = null;
  private List<DigestAlgorithmAndValueModel> dataHashes = new ArrayList<DigestAlgorithmAndValueModel>();

  
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
  @JsonProperty("auditPackage")
  public AuditPackageOptions getAuditPackage() {
    return auditPackage;
  }
  public void setAuditPackage(AuditPackageOptions auditPackage) {
    this.auditPackage = auditPackage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("defaultSignaturePolicyId")
  public String getDefaultSignaturePolicyId() {
    return defaultSignaturePolicyId;
  }
  public void setDefaultSignaturePolicyId(String defaultSignaturePolicyId) {
    this.defaultSignaturePolicyId = defaultSignaturePolicyId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("acceptableExplicitPolicies")
  public List<String> getAcceptableExplicitPolicies() {
    return acceptableExplicitPolicies;
  }
  public void setAcceptableExplicitPolicies(List<String> acceptableExplicitPolicies) {
    this.acceptableExplicitPolicies = acceptableExplicitPolicies;
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
  @JsonProperty("ignoreRevocationStatusUnknown")
  public Boolean getIgnoreRevocationStatusUnknown() {
    return ignoreRevocationStatusUnknown;
  }
  public void setIgnoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
    this.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
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
    sb.append("class OpenCadesSignatureRequestModel {\n");
    
    sb.append("  extractEncapsulatedContent: ").append(extractEncapsulatedContent).append("\n");
    sb.append("  file: ").append(file).append("\n");
    sb.append("  validate: ").append(validate).append("\n");
    sb.append("  auditPackage: ").append(auditPackage).append("\n");
    sb.append("  defaultSignaturePolicyId: ").append(defaultSignaturePolicyId).append("\n");
    sb.append("  acceptableExplicitPolicies: ").append(acceptableExplicitPolicies).append("\n");
    sb.append("  securityContextId: ").append(securityContextId).append("\n");
    sb.append("  ignoreRevocationStatusUnknown: ").append(ignoreRevocationStatusUnknown).append("\n");
    sb.append("  dataHashes: ").append(dataHashes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
