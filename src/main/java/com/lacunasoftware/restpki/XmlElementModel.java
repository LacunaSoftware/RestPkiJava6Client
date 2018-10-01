package com.lacunasoftware.restpki;

import java.util.*;
import com.lacunasoftware.restpki.XmlAttributeModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlElementModel   {
  
  private String localName = null;
  private List<XmlAttributeModel> attributes = new ArrayList<XmlAttributeModel>();
  private String namespaceUri = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("localName")
  public String getLocalName() {
    return localName;
  }
  public void setLocalName(String localName) {
    this.localName = localName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  public List<XmlAttributeModel> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<XmlAttributeModel> attributes) {
    this.attributes = attributes;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("namespaceUri")
  public String getNamespaceUri() {
    return namespaceUri;
  }
  public void setNamespaceUri(String namespaceUri) {
    this.namespaceUri = namespaceUri;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlElementModel {\n");
    
    sb.append("  localName: ").append(localName).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("  namespaceUri: ").append(namespaceUri).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
