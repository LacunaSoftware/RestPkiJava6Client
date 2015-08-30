package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-30T16:05:17.528-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PkiBrazilCertificateModel   {
  
  public enum CertificateTypeEnum {
     Unknown,  A1,  A2,  A3,  A4,  S1,  S2,  S3,  S4,  T3,  T4, 
  };
  private CertificateTypeEnum certificateType = null;
  private String cpf = null;
  private String cnpj = null;
  private String responsavel = null;
  private String dateOfBirth = null;
  private String companyName = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("certificateType")
  public CertificateTypeEnum getCertificateType() {
    return certificateType;
  }
  public void setCertificateType(CertificateTypeEnum certificateType) {
    this.certificateType = certificateType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cnpj")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dateOfBirth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PkiBrazilCertificateModel {\n");
    
    sb.append("  certificateType: ").append(certificateType).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  dateOfBirth: ").append(dateOfBirth).append("\n");
    sb.append("  companyName: ").append(companyName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
