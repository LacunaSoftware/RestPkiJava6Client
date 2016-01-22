package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.NamespaceModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-22T14:46:16.160-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class XmlElementLocationModel   {
  
  private String xPath = null;
  private List<NamespaceModel> namespaces = new ArrayList<NamespaceModel>();
  public enum InsertionOptionEnum {
     AppendChild,  PrependChild,  AppendSibling,  PrependSibling, 
  };
  private InsertionOptionEnum insertionOption = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("xPath")
  public String getXPath() {
    return xPath;
  }
  public void setXPath(String xPath) {
    this.xPath = xPath;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("namespaces")
  public List<NamespaceModel> getNamespaces() {
    return namespaces;
  }
  public void setNamespaces(List<NamespaceModel> namespaces) {
    this.namespaces = namespaces;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("insertionOption")
  public InsertionOptionEnum getInsertionOption() {
    return insertionOption;
  }
  public void setInsertionOption(InsertionOptionEnum insertionOption) {
    this.insertionOption = insertionOption;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlElementLocationModel {\n");
    
    sb.append("  xPath: ").append(xPath).append("\n");
    sb.append("  namespaces: ").append(namespaces).append("\n");
    sb.append("  insertionOption: ").append(insertionOption).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
