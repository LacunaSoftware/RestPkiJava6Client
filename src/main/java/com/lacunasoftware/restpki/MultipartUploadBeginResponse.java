package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-17T15:30:21.925-02:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class MultipartUploadBeginResponse   {
  
  private String blobToken = null;
  private Integer partSize = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("blobToken")
  public String getBlobToken() {
    return blobToken;
  }
  public void setBlobToken(String blobToken) {
    this.blobToken = blobToken;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("partSize")
  public Integer getPartSize() {
    return partSize;
  }
  public void setPartSize(Integer partSize) {
    this.partSize = partSize;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipartUploadBeginResponse {\n");
    
    sb.append("  blobToken: ").append(blobToken).append("\n");
    sb.append("  partSize: ").append(partSize).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
