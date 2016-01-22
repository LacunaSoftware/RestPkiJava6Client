package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-22T14:46:16.160-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlNodeNameModel   {
  
  private String localName = null;
  private String namespace = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNodeNameModel {\n");
    
    sb.append("  localName: ").append(localName).append("\n");
    sb.append("  namespace: ").append(namespace).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
