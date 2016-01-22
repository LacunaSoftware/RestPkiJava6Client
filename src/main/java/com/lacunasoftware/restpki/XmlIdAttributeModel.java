package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.XmlNodeNameModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-22T14:46:16.160-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlIdAttributeModel   {
  
  private XmlNodeNameModel element = null;
  private XmlNodeNameModel attribute = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("element")
  public XmlNodeNameModel getElement() {
    return element;
  }
  public void setElement(XmlNodeNameModel element) {
    this.element = element;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("attribute")
  public XmlNodeNameModel getAttribute() {
    return attribute;
  }
  public void setAttribute(XmlNodeNameModel attribute) {
    this.attribute = attribute;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlIdAttributeModel {\n");
    
    sb.append("  element: ").append(element).append("\n");
    sb.append("  attribute: ").append(attribute).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
