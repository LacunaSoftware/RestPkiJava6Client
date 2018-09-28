package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CertificateModel;
import com.lacunasoftware.restpki.NameModel;
import com.lacunasoftware.restpki.PkiBrazilCertificateModel;
import com.lacunasoftware.restpki.PkiItalyCertificateModel;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CertificateModel   {
  
  private NameModel subjectName = null;
  private String emailAddress = null;
  private NameModel issuerName = null;
  private String issuerDisplayName = null;
  private String serialNumber = null;
  private Date validityStart = null;
  private Date validityEnd = null;
  private CertificateModel issuer = null;
  private PkiBrazilCertificateModel pkiBrazil = null;
  private PkiItalyCertificateModel pkiItaly = null;
  private String binaryThumbprintSHA256 = null;
  private String thumbprint = null;
  private String subjectCommonName = null;
  private String subjectDisplayName = null;

  
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
  @JsonProperty("issuerDisplayName")
  public String getIssuerDisplayName() {
    return issuerDisplayName;
  }
  public void setIssuerDisplayName(String issuerDisplayName) {
    this.issuerDisplayName = issuerDisplayName;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("binaryThumbprintSHA256")
  public String getBinaryThumbprintSHA256() {
    return binaryThumbprintSHA256;
  }
  public void setBinaryThumbprintSHA256(String binaryThumbprintSHA256) {
    this.binaryThumbprintSHA256 = binaryThumbprintSHA256;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("thumbprint")
  public String getThumbprint() {
    return thumbprint;
  }
  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("subjectCommonName")
  public String getSubjectCommonName() {
    return subjectCommonName;
  }
  public void setSubjectCommonName(String subjectCommonName) {
    this.subjectCommonName = subjectCommonName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("subjectDisplayName")
  public String getSubjectDisplayName() {
    return subjectDisplayName;
  }
  public void setSubjectDisplayName(String subjectDisplayName) {
    this.subjectDisplayName = subjectDisplayName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateModel {\n");
    
    sb.append("  subjectName: ").append(subjectName).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  issuerName: ").append(issuerName).append("\n");
    sb.append("  issuerDisplayName: ").append(issuerDisplayName).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  validityStart: ").append(validityStart).append("\n");
    sb.append("  validityEnd: ").append(validityEnd).append("\n");
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  pkiBrazil: ").append(pkiBrazil).append("\n");
    sb.append("  pkiItaly: ").append(pkiItaly).append("\n");
    sb.append("  binaryThumbprintSHA256: ").append(binaryThumbprintSHA256).append("\n");
    sb.append("  thumbprint: ").append(thumbprint).append("\n");
    sb.append("  subjectCommonName: ").append(subjectCommonName).append("\n");
    sb.append("  subjectDisplayName: ").append(subjectDisplayName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
