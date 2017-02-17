package com.lacunasoftware.restpki;

import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-17T15:30:21.925-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class MultipartUploadEndRequest   {
  
  private List<String> partETags = new ArrayList<String>();
  private String completeMD5 = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partETags")
  public List<String> getPartETags() {
    return partETags;
  }
  public void setPartETags(List<String> partETags) {
    this.partETags = partETags;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("completeMD5")
  public String getCompleteMD5() {
    return completeMD5;
  }
  public void setCompleteMD5(String completeMD5) {
    this.completeMD5 = completeMD5;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipartUploadEndRequest {\n");
    
    sb.append("  partETags: ").append(partETags).append("\n");
    sb.append("  completeMD5: ").append(completeMD5).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
