package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CertificateSummary   {
  
  private String thumbprint = null;
  private String subjectCommonName = null;
  private String subjectDisplayName = null;

  
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
    sb.append("class CertificateSummary {\n");
    
    sb.append("  thumbprint: ").append(thumbprint).append("\n");
    sb.append("  subjectCommonName: ").append(subjectCommonName).append("\n");
    sb.append("  subjectDisplayName: ").append(subjectDisplayName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
