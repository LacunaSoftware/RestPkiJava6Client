package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.TimestampRequestModel;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class TimestampRequestList   {
  
  private Integer start = null;
  private Integer count = null;
  private Integer totalCount = null;
  private List<TimestampRequestModel> requests = new ArrayList<TimestampRequestModel>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("requests")
  public List<TimestampRequestModel> getRequests() {
    return requests;
  }
  public void setRequests(List<TimestampRequestModel> requests) {
    this.requests = requests;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimestampRequestList {\n");
    
    sb.append("  start: ").append(start).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  totalCount: ").append(totalCount).append("\n");
    sb.append("  requests: ").append(requests).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
