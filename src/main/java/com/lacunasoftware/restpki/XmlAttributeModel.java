package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlAttributeModel   {
  
  private String localName = null;
  private String value = null;
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
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
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
    sb.append("class XmlAttributeModel {\n");
    
    sb.append("  localName: ").append(localName).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  namespaceUri: ").append(namespaceUri).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
