package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class AuditPackageOptions   {
  
  private Boolean generate = null;
  private Boolean includeFile = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("generate")
  public Boolean getGenerate() {
    return generate;
  }
  public void setGenerate(Boolean generate) {
    this.generate = generate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("includeFile")
  public Boolean getIncludeFile() {
    return includeFile;
  }
  public void setIncludeFile(Boolean includeFile) {
    this.includeFile = includeFile;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditPackageOptions {\n");
    
    sb.append("  generate: ").append(generate).append("\n");
    sb.append("  includeFile: ").append(includeFile).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
