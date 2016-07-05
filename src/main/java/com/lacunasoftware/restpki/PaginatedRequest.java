package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-05T18:14:42.102-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PaginatedRequest   {
  
  private Integer pageIndex = null;
  private Integer pageSize = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pageIndex")
  public Integer getPageIndex() {
    return pageIndex;
  }
  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedRequest {\n");
    
    sb.append("  pageIndex: ").append(pageIndex).append("\n");
    sb.append("  pageSize: ").append(pageSize).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
