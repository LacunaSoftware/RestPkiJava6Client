package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.XmlNodeNameModel;
import java.util.*;
import com.lacunasoftware.restpki.XmlIdAttributeModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-22T14:46:16.160-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlIdResolutionTableModel   {
  
  private Boolean includeXmlIdAttribute = null;
  private List<XmlIdAttributeModel> elementIdAttributes = new ArrayList<XmlIdAttributeModel>();
  private List<XmlNodeNameModel> globalIdAttributes = new ArrayList<XmlNodeNameModel>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("includeXmlIdAttribute")
  public Boolean getIncludeXmlIdAttribute() {
    return includeXmlIdAttribute;
  }
  public void setIncludeXmlIdAttribute(Boolean includeXmlIdAttribute) {
    this.includeXmlIdAttribute = includeXmlIdAttribute;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("elementIdAttributes")
  public List<XmlIdAttributeModel> getElementIdAttributes() {
    return elementIdAttributes;
  }
  public void setElementIdAttributes(List<XmlIdAttributeModel> elementIdAttributes) {
    this.elementIdAttributes = elementIdAttributes;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("globalIdAttributes")
  public List<XmlNodeNameModel> getGlobalIdAttributes() {
    return globalIdAttributes;
  }
  public void setGlobalIdAttributes(List<XmlNodeNameModel> globalIdAttributes) {
    this.globalIdAttributes = globalIdAttributes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlIdResolutionTableModel {\n");
    
    sb.append("  includeXmlIdAttribute: ").append(includeXmlIdAttribute).append("\n");
    sb.append("  elementIdAttributes: ").append(elementIdAttributes).append("\n");
    sb.append("  globalIdAttributes: ").append(globalIdAttributes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
