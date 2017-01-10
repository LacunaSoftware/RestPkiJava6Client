package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-10T18:51:53.435-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class CountEntry   {
  
  private Integer success = null;
  private Integer fail = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("success")
  public Integer getSuccess() {
    return success;
  }
  public void setSuccess(Integer success) {
    this.success = success;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fail")
  public Integer getFail() {
    return fail;
  }
  public void setFail(Integer fail) {
    this.fail = fail;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountEntry {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  fail: ").append(fail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
