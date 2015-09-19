package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateModel;
import com.lacunasoftware.restpki.ValidationResultsModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class AuthenticationsPostSignedBytesResponse   {
  
  private ValidationResultsModel validationResults = null;
  private CertificateModel certificate = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationsPostSignedBytesResponse {\n");
    
    sb.append("  validationResults: ").append(validationResults).append("\n");
    sb.append("  certificate: ").append(certificate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
