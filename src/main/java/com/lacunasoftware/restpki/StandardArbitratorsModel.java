package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class StandardArbitratorsModel   {
  
  private Boolean pkiBrazil = null;
  private Boolean pkiItaly = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pkiBrazil")
  public Boolean getPkiBrazil() {
    return pkiBrazil;
  }
  public void setPkiBrazil(Boolean pkiBrazil) {
    this.pkiBrazil = pkiBrazil;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pkiItaly")
  public Boolean getPkiItaly() {
    return pkiItaly;
  }
  public void setPkiItaly(Boolean pkiItaly) {
    this.pkiItaly = pkiItaly;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardArbitratorsModel {\n");
    
    sb.append("  pkiBrazil: ").append(pkiBrazil).append("\n");
    sb.append("  pkiItaly: ").append(pkiItaly).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
