package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateModel;
import com.lacunasoftware.restpki.ValidationResultsModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-30T16:05:17.528-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class AuthenticationPostResponse   {
  
  private CertificateModel certificate = null;
  private ValidationResultsModel validationResults = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("certificate")
  public CertificateModel getCertificate() {
    return certificate;
  }
  public void setCertificate(CertificateModel certificate) {
    this.certificate = certificate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("validationResults")
  public ValidationResultsModel getValidationResults() {
    return validationResults;
  }
  public void setValidationResults(ValidationResultsModel validationResults) {
    this.validationResults = validationResults;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationPostResponse {\n");
    
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("  validationResults: ").append(validationResults).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
