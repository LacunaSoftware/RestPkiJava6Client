package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SystemStatusModel   {
  
  private Boolean usingManualMachineKey = null;
  private String manualMachineKeyHint = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("usingManualMachineKey")
  public Boolean getUsingManualMachineKey() {
    return usingManualMachineKey;
  }
  public void setUsingManualMachineKey(Boolean usingManualMachineKey) {
    this.usingManualMachineKey = usingManualMachineKey;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("manualMachineKeyHint")
  public String getManualMachineKeyHint() {
    return manualMachineKeyHint;
  }
  public void setManualMachineKeyHint(String manualMachineKeyHint) {
    this.manualMachineKeyHint = manualMachineKeyHint;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemStatusModel {\n");
    
    sb.append("  usingManualMachineKey: ").append(usingManualMachineKey).append("\n");
    sb.append("  manualMachineKeyHint: ").append(manualMachineKeyHint).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
