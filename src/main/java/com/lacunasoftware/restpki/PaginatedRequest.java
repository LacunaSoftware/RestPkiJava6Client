package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class PaginatedRequest   {
  
  private Integer pageIndex = null;
  private Integer pageSize = null;
  public enum SortDirectionEnum {
     Descending,  Ascending, 
  };
  private SortDirectionEnum sortDirection = null;
  private String sortField = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sortDirection")
  public SortDirectionEnum getSortDirection() {
    return sortDirection;
  }
  public void setSortDirection(SortDirectionEnum sortDirection) {
    this.sortDirection = sortDirection;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sortField")
  public String getSortField() {
    return sortField;
  }
  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedRequest {\n");
    
    sb.append("  pageIndex: ").append(pageIndex).append("\n");
    sb.append("  pageSize: ").append(pageSize).append("\n");
    sb.append("  sortDirection: ").append(sortDirection).append("\n");
    sb.append("  sortField: ").append(sortField).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
