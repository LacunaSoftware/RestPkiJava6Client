package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesVisualTextModel   {
  
  private Double fontSize = null;
  private String text = null;
  private Boolean includeSigningTime = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fontSize")
  public Double getFontSize() {
    return fontSize;
  }
  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("includeSigningTime")
  public Boolean getIncludeSigningTime() {
    return includeSigningTime;
  }
  public void setIncludeSigningTime(Boolean includeSigningTime) {
    this.includeSigningTime = includeSigningTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesVisualTextModel {\n");
    
    sb.append("  fontSize: ").append(fontSize).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  includeSigningTime: ").append(includeSigningTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
