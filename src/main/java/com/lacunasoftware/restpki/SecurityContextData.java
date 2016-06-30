package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.StandardArbitratorsModel;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SecurityContextData   {
  
  private String name = null;
  private StandardArbitratorsModel additionalStandardArbitrators = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("additionalStandardArbitrators")
  public StandardArbitratorsModel getAdditionalStandardArbitrators() {
    return additionalStandardArbitrators;
  }
  public void setAdditionalStandardArbitrators(StandardArbitratorsModel additionalStandardArbitrators) {
    this.additionalStandardArbitrators = additionalStandardArbitrators;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityContextData {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  additionalStandardArbitrators: ").append(additionalStandardArbitrators).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
