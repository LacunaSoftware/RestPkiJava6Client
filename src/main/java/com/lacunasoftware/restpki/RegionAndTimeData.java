package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class RegionAndTimeData   {
  
  public enum DateFormatEnum {
     Standard,  Long,  Short,  LongDateShortTime,  ShortDateLongTime, 
  };
  private DateFormatEnum dateFormat = null;
  private String timeZoneId = null;
  private String cultureId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dateFormat")
  public DateFormatEnum getDateFormat() {
    return dateFormat;
  }
  public void setDateFormat(DateFormatEnum dateFormat) {
    this.dateFormat = dateFormat;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timeZoneId")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cultureId")
  public String getCultureId() {
    return cultureId;
  }
  public void setCultureId(String cultureId) {
    this.cultureId = cultureId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionAndTimeData {\n");
    
    sb.append("  dateFormat: ").append(dateFormat).append("\n");
    sb.append("  timeZoneId: ").append(timeZoneId).append("\n");
    sb.append("  cultureId: ").append(cultureId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
