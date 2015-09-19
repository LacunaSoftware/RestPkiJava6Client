package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.ResourceContentOrReference;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-19T17:33:14.346-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesVisualImageModel   {
  
  private ResourceContentOrReference resource = null;
  private Integer opacity = null;
  public enum HorizontalAlignEnum {
     Left,  Center,  Right, 
  };
  private HorizontalAlignEnum horizontalAlign = null;
  public enum VerticalAlignEnum {
     Top,  Center,  Bottom, 
  };
  private VerticalAlignEnum verticalAlign = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("resource")
  public ResourceContentOrReference getResource() {
    return resource;
  }
  public void setResource(ResourceContentOrReference resource) {
    this.resource = resource;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("opacity")
  public Integer getOpacity() {
    return opacity;
  }
  public void setOpacity(Integer opacity) {
    this.opacity = opacity;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("verticalAlign")
  public VerticalAlignEnum getVerticalAlign() {
    return verticalAlign;
  }
  public void setVerticalAlign(VerticalAlignEnum verticalAlign) {
    this.verticalAlign = verticalAlign;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesVisualImageModel {\n");
    
    sb.append("  resource: ").append(resource).append("\n");
    sb.append("  opacity: ").append(opacity).append("\n");
    sb.append("  horizontalAlign: ").append(horizontalAlign).append("\n");
    sb.append("  verticalAlign: ").append(verticalAlign).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
