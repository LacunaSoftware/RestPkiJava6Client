package com.lacunasoftware.restpki;

import java.util.*;
import com.lacunasoftware.restpki.ValidationItemModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class ValidationResultsModel   {
  
  private List<ValidationItemModel> passedChecks = new ArrayList<ValidationItemModel>();
  private List<ValidationItemModel> errors = new ArrayList<ValidationItemModel>();
  private List<ValidationItemModel> warnings = new ArrayList<ValidationItemModel>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("passedChecks")
  public List<ValidationItemModel> getPassedChecks() {
    return passedChecks;
  }
  public void setPassedChecks(List<ValidationItemModel> passedChecks) {
    this.passedChecks = passedChecks;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  public List<ValidationItemModel> getErrors() {
    return errors;
  }
  public void setErrors(List<ValidationItemModel> errors) {
    this.errors = errors;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("warnings")
  public List<ValidationItemModel> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<ValidationItemModel> warnings) {
    this.warnings = warnings;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResultsModel {\n");
    
    sb.append("  passedChecks: ").append(passedChecks).append("\n");
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("  warnings: ").append(warnings).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
