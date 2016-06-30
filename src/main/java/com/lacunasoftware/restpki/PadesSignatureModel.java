package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesSignerModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesSignatureModel   {
  
  private List<PadesSignerModel> signers = new ArrayList<PadesSignerModel>();

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesSignatureModel {\n");
    
    sb.append("  signers: ").append(signers).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
