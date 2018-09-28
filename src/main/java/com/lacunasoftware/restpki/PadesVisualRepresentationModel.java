package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.PadesVisualImageModel;
import com.lacunasoftware.restpki.PadesVisualTextModel;
import com.lacunasoftware.restpki.PadesVisualPositioningModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PadesVisualRepresentationModel   {
  
  private PadesVisualTextModel text = null;
  private PadesVisualImageModel image = null;
  private PadesVisualPositioningModel position = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("text")
  public PadesVisualTextModel getText() {
    return text;
  }
  public void setText(PadesVisualTextModel text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  public PadesVisualImageModel getImage() {
    return image;
  }
  public void setImage(PadesVisualImageModel image) {
    this.image = image;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("position")
  public PadesVisualPositioningModel getPosition() {
    return position;
  }
  public void setPosition(PadesVisualPositioningModel position) {
    this.position = position;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PadesVisualRepresentationModel {\n");
    
    sb.append("  text: ").append(text).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
