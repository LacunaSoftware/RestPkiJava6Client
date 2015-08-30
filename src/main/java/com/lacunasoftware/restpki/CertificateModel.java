package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateModel;
import com.lacunasoftware.restpki.NameModel;
import com.lacunasoftware.restpki.PkiBrazilCertificateModel;
import com.lacunasoftware.restpki.PkiItalyCertificateModel;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-30T16:05:17.528-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CertificateModel   {
  
  private NameModel subjectName = null;
  private String emailAddress = null;
  private NameModel issuerName = null;
  private String serialNumber = null;
  private Date validityStart = null;
  private Date validityEnd = null;
  private CertificateModel issuer = null;
  private PkiBrazilCertificateModel pkiBrazil = null;
  private PkiItalyCertificateModel pkiItaly = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("subjectName")
  public NameModel getSubjectName() {
    return subjectName;
  }
  public void setSubjectName(NameModel subjectName) {
    this.subjectName = subjectName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("issuerName")
  public NameModel getIssuerName() {
    return issuerName;
  }
  public void setIssuerName(NameModel issuerName) {
    this.issuerName = issuerName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("validityStart")
  public Date getValidityStart() {
    return validityStart;
  }
  public void setValidityStart(Date validityStart) {
    this.validityStart = validityStart;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("validityEnd")
  public Date getValidityEnd() {
    return validityEnd;
  }
  public void setValidityEnd(Date validityEnd) {
    this.validityEnd = validityEnd;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("issuer")
  public CertificateModel getIssuer() {
    return issuer;
  }
  public void setIssuer(CertificateModel issuer) {
    this.issuer = issuer;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pkiBrazil")
  public PkiBrazilCertificateModel getPkiBrazil() {
    return pkiBrazil;
  }
  public void setPkiBrazil(PkiBrazilCertificateModel pkiBrazil) {
    this.pkiBrazil = pkiBrazil;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pkiItaly")
  public PkiItalyCertificateModel getPkiItaly() {
    return pkiItaly;
  }
  public void setPkiItaly(PkiItalyCertificateModel pkiItaly) {
    this.pkiItaly = pkiItaly;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateModel {\n");
    
    sb.append("  subjectName: ").append(subjectName).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  issuerName: ").append(issuerName).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  validityStart: ").append(validityStart).append("\n");
    sb.append("  validityEnd: ").append(validityEnd).append("\n");
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  pkiBrazil: ").append(pkiBrazil).append("\n");
    sb.append("  pkiItaly: ").append(pkiItaly).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
