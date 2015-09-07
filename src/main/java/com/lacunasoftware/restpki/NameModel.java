package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class NameModel   {
  
  private String country = null;
  private String organization = null;
  private String organizationUnit = null;
  private String dnQualifier = null;
  private String stateName = null;
  private String commonName = null;
  private String serialNumber = null;
  private String locality = null;
  private String title = null;
  private String surname = null;
  private String givenName = null;
  private String initials = null;
  private String pseudonym = null;
  private String generationQualifier = null;
  private String emailAddress = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("organizationUnit")
  public String getOrganizationUnit() {
    return organizationUnit;
  }
  public void setOrganizationUnit(String organizationUnit) {
    this.organizationUnit = organizationUnit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dnQualifier")
  public String getDnQualifier() {
    return dnQualifier;
  }
  public void setDnQualifier(String dnQualifier) {
    this.dnQualifier = dnQualifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("stateName")
  public String getStateName() {
    return stateName;
  }
  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("commonName")
  public String getCommonName() {
    return commonName;
  }
  public void setCommonName(String commonName) {
    this.commonName = commonName;
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
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }
  public void setLocality(String locality) {
    this.locality = locality;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("initials")
  public String getInitials() {
    return initials;
  }
  public void setInitials(String initials) {
    this.initials = initials;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pseudonym")
  public String getPseudonym() {
    return pseudonym;
  }
  public void setPseudonym(String pseudonym) {
    this.pseudonym = pseudonym;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("generationQualifier")
  public String getGenerationQualifier() {
    return generationQualifier;
  }
  public void setGenerationQualifier(String generationQualifier) {
    this.generationQualifier = generationQualifier;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameModel {\n");
    
    sb.append("  country: ").append(country).append("\n");
    sb.append("  organization: ").append(organization).append("\n");
    sb.append("  organizationUnit: ").append(organizationUnit).append("\n");
    sb.append("  dnQualifier: ").append(dnQualifier).append("\n");
    sb.append("  stateName: ").append(stateName).append("\n");
    sb.append("  commonName: ").append(commonName).append("\n");
    sb.append("  serialNumber: ").append(serialNumber).append("\n");
    sb.append("  locality: ").append(locality).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  surname: ").append(surname).append("\n");
    sb.append("  givenName: ").append(givenName).append("\n");
    sb.append("  initials: ").append(initials).append("\n");
    sb.append("  pseudonym: ").append(pseudonym).append("\n");
    sb.append("  generationQualifier: ").append(generationQualifier).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
