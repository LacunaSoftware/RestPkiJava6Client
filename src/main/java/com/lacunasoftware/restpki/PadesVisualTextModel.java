package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-21T14:48:34.437-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesVisualTextModel   {
  
  private Double fontSize = null;
  private String text = null;
  private Boolean includeSigningTime = null;
  public enum HorizontalAlignEnum {
     Left,  Right, 
  };
  private HorizontalAlignEnum horizontalAlign = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("horizontalAlign")
  public HorizontalAlignEnum getHorizontalAlign() {
    return horizontalAlign;
  }
  public void setHorizontalAlign(HorizontalAlignEnum horizontalAlign) {
    this.horizontalAlign = horizontalAlign;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesVisualTextModel {\n");
    
    sb.append("  fontSize: ").append(fontSize).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  includeSigningTime: ").append(includeSigningTime).append("\n");
    sb.append("  horizontalAlign: ").append(horizontalAlign).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
