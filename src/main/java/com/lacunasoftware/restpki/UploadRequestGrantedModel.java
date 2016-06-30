package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class UploadRequestGrantedModel   {
  
  private String blobId = null;
  private String ticket = null;
  private Integer chunkSize = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ticket")
  public String getTicket() {
    return ticket;
  }
  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("chunkSize")
  public Integer getChunkSize() {
    return chunkSize;
  }
  public void setChunkSize(Integer chunkSize) {
    this.chunkSize = chunkSize;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadRequestGrantedModel {\n");
    
    sb.append("  blobId: ").append(blobId).append("\n");
    sb.append("  ticket: ").append(ticket).append("\n");
    sb.append("  chunkSize: ").append(chunkSize).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
