package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.FileModel;
import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-01T10:55:17.837-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class OpenSignatureRequestModel   {
  
  private FileModel file = null;
  private Boolean validate = null;
  private String implicitPolicy = null;
  private List<String> acceptablePolicies = new ArrayList<String>();
  private String securityContext = null;
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
  @JsonProperty("implicitPolicy")
  public String getImplicitPolicy() {
    return implicitPolicy;
  }
  public void setImplicitPolicy(String implicitPolicy) {
    this.implicitPolicy = implicitPolicy;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("acceptablePolicies")
  public List<String> getAcceptablePolicies() {
    return acceptablePolicies;
  }
  public void setAcceptablePolicies(List<String> acceptablePolicies) {
    this.acceptablePolicies = acceptablePolicies;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("securityContext")
  public String getSecurityContext() {
    return securityContext;
  }
  public void setSecurityContext(String securityContext) {
    this.securityContext = securityContext;
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
    sb.append("  implicitPolicy: ").append(implicitPolicy).append("\n");
    sb.append("  acceptablePolicies: ").append(acceptablePolicies).append("\n");
    sb.append("  securityContext: ").append(securityContext).append("\n");
    sb.append("  dataHashes: ").append(dataHashes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
