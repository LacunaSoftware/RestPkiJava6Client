package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.ValidationResultsModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-30T16:05:17.528-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class ValidationItemModel   {
  
  public enum TypeEnum {
     Success,  CertificateNotYetValid,  CertificateExpired,  CertificateRevoked,  CertificateIssuerNotFound,  CertificateRevocationStatusUnknown,  CertificateChainRootNotTrusted,  InvalidCertificateSignature,  DecodeError,  RequiredSignedAttributeMissing,  ForbiddenSignedAttributePresent,  RequiredUnsignedAttributeMissing,  ForbiddenUnsignedAttributePresent,  ContentTypeMismatch,  MessageDigestMismatch,  SigningCertificateDigestMismatch,  SignatureAlgorithmValidationFailed,  RevocationDataIssuedBeforeGracePeriod,  UncertifiedDateReference,  SignaturePolicyMismatch,  SigningTimeOutOfCertificateValidity,  UnknownSignedAttributesPresent,  UnknownUnsignedAttributesPresent,  TimestampWithMoreThanOneSigner,  TimestampMessageImprintMismatch,  TimestampValidationException,  CompleteReferencesMismatch,  InvalidSignatureTimestamp,  InvalidReferencesTimestamp,  InvalidArchiveTimestamp,  InvalidKeyUsage,  InvalidOcspResponse,  UnauthorizedIssuer,  UnknownRootTrustStatus,  InvalidTsl,  InvalidCrl,  CertificateIssuerValid,  CertificateIssuerInvalid,  CertificateValidationFailed, 
  };
  private TypeEnum type = null;
  private String message = null;
  private String detail = null;
  private ValidationResultsModel innerValidationResults = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }
  public void setDetail(String detail) {
    this.detail = detail;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("innerValidationResults")
  public ValidationResultsModel getInnerValidationResults() {
    return innerValidationResults;
  }
  public void setInnerValidationResults(ValidationResultsModel innerValidationResults) {
    this.innerValidationResults = innerValidationResults;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationItemModel {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  detail: ").append(detail).append("\n");
    sb.append("  innerValidationResults: ").append(innerValidationResults).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
