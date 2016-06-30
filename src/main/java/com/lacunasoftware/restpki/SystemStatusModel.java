package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SystemStatusModel   {
  
  private Boolean isOnPremises = null;
  private String machineKeyHint = null;
  private Boolean logConfigured = null;
  private String logConfigHint = null;
  private Boolean sdkLicenseLoaded = null;
  private String sdkLicenseInfo = null;
  private String sdkLicenseError = null;
  public enum StorageStateEnum {
     Disabled,  ReadyAndEmpty,  Ready,  Error, 
  };
  private StorageStateEnum storageState = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isOnPremises")
  public Boolean getIsOnPremises() {
    return isOnPremises;
  }
  public void setIsOnPremises(Boolean isOnPremises) {
    this.isOnPremises = isOnPremises;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("machineKeyHint")
  public String getMachineKeyHint() {
    return machineKeyHint;
  }
  public void setMachineKeyHint(String machineKeyHint) {
    this.machineKeyHint = machineKeyHint;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("logConfigured")
  public Boolean getLogConfigured() {
    return logConfigured;
  }
  public void setLogConfigured(Boolean logConfigured) {
    this.logConfigured = logConfigured;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("logConfigHint")
  public String getLogConfigHint() {
    return logConfigHint;
  }
  public void setLogConfigHint(String logConfigHint) {
    this.logConfigHint = logConfigHint;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sdkLicenseLoaded")
  public Boolean getSdkLicenseLoaded() {
    return sdkLicenseLoaded;
  }
  public void setSdkLicenseLoaded(Boolean sdkLicenseLoaded) {
    this.sdkLicenseLoaded = sdkLicenseLoaded;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sdkLicenseInfo")
  public String getSdkLicenseInfo() {
    return sdkLicenseInfo;
  }
  public void setSdkLicenseInfo(String sdkLicenseInfo) {
    this.sdkLicenseInfo = sdkLicenseInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sdkLicenseError")
  public String getSdkLicenseError() {
    return sdkLicenseError;
  }
  public void setSdkLicenseError(String sdkLicenseError) {
    this.sdkLicenseError = sdkLicenseError;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("storageState")
  public StorageStateEnum getStorageState() {
    return storageState;
  }
  public void setStorageState(StorageStateEnum storageState) {
    this.storageState = storageState;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemStatusModel {\n");
    
    sb.append("  isOnPremises: ").append(isOnPremises).append("\n");
    sb.append("  machineKeyHint: ").append(machineKeyHint).append("\n");
    sb.append("  logConfigured: ").append(logConfigured).append("\n");
    sb.append("  logConfigHint: ").append(logConfigHint).append("\n");
    sb.append("  sdkLicenseLoaded: ").append(sdkLicenseLoaded).append("\n");
    sb.append("  sdkLicenseInfo: ").append(sdkLicenseInfo).append("\n");
    sb.append("  sdkLicenseError: ").append(sdkLicenseError).append("\n");
    sb.append("  storageState: ").append(storageState).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
