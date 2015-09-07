package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-07T11:27:36.506-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PkiItalyCertificateModel   {
  
  public enum CertificateTypeEnum {
     Undefined,  Cns,  DigitalSignature, 
  };
  private CertificateTypeEnum certificateType = null;
  private String codiceFiscale = null;
  private String idCarta = null;

  
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
  @JsonProperty("codiceFiscale")
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("idCarta")
  public String getIdCarta() {
    return idCarta;
  }
  public void setIdCarta(String idCarta) {
    this.idCarta = idCarta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PkiItalyCertificateModel {\n");
    
    sb.append("  certificateType: ").append(certificateType).append("\n");
    sb.append("  codiceFiscale: ").append(codiceFiscale).append("\n");
    sb.append("  idCarta: ").append(idCarta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
