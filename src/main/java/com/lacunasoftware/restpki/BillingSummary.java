package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CountEntry;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-10T18:51:53.435-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class BillingSummary   {
  
  private String id = null;
  private String userName = null;
  private CountEntry nPADES = null;
  private CountEntry nCADES = null;
  private CountEntry nXADES = null;
  private CountEntry nAuths = null;
  private CountEntry nTimestamps = null;
  private CountEntry nOpenSig = null;
  private CountEntry total = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("nPADES")
  public CountEntry getNPADES() {
    return nPADES;
  }
  public void setNPADES(CountEntry nPADES) {
    this.nPADES = nPADES;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("nCADES")
  public CountEntry getNCADES() {
    return nCADES;
  }
  public void setNCADES(CountEntry nCADES) {
    this.nCADES = nCADES;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("nXADES")
  public CountEntry getNXADES() {
    return nXADES;
  }
  public void setNXADES(CountEntry nXADES) {
    this.nXADES = nXADES;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("nAuths")
  public CountEntry getNAuths() {
    return nAuths;
  }
  public void setNAuths(CountEntry nAuths) {
    this.nAuths = nAuths;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("nTimestamps")
  public CountEntry getNTimestamps() {
    return nTimestamps;
  }
  public void setNTimestamps(CountEntry nTimestamps) {
    this.nTimestamps = nTimestamps;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("nOpenSig")
  public CountEntry getNOpenSig() {
    return nOpenSig;
  }
  public void setNOpenSig(CountEntry nOpenSig) {
    this.nOpenSig = nOpenSig;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("total")
  public CountEntry getTotal() {
    return total;
  }
  public void setTotal(CountEntry total) {
    this.total = total;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingSummary {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  nPADES: ").append(nPADES).append("\n");
    sb.append("  nCADES: ").append(nCADES).append("\n");
    sb.append("  nXADES: ").append(nXADES).append("\n");
    sb.append("  nAuths: ").append(nAuths).append("\n");
    sb.append("  nTimestamps: ").append(nTimestamps).append("\n");
    sb.append("  nOpenSig: ").append(nOpenSig).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
