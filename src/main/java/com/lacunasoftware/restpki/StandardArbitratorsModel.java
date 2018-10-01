package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class StandardArbitratorsModel   {
  
  private Boolean pkiBrazil = null;
  private Boolean pkiItaly = null;
  private Boolean windowsServer = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("windowsServer")
  public Boolean getWindowsServer() {
    return windowsServer;
  }
  public void setWindowsServer(Boolean windowsServer) {
    this.windowsServer = windowsServer;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardArbitratorsModel {\n");
    
    sb.append("  pkiBrazil: ").append(pkiBrazil).append("\n");
    sb.append("  pkiItaly: ").append(pkiItaly).append("\n");
    sb.append("  windowsServer: ").append(windowsServer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
