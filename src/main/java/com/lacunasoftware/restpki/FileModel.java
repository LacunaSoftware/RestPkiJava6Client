package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class FileModel   {
  
  private String mimeType = null;
  private String content = null;
  private String blobId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("blobId")
  public String getBlobId() {
    return blobId;
  }
  public void setBlobId(String blobId) {
    this.blobId = blobId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileModel {\n");
    
    sb.append("  mimeType: ").append(mimeType).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  blobId: ").append(blobId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
