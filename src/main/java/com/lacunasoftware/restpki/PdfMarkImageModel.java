package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.ResourceContentOrReference;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-23T11:29:56.579-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PdfMarkImageModel   {
  
  private Double opacity = null;
  private ResourceContentOrReference resource = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("opacity")
  public Double getOpacity() {
    return opacity;
  }
  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfMarkImageModel {\n");
    
    sb.append("  opacity: ").append(opacity).append("\n");
    sb.append("  resource: ").append(resource).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
