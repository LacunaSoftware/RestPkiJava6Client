package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.CultureSummary;
import com.lacunasoftware.restpki.TimeZoneSummary;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class RegionAndTimeModel   {
  
  public enum DateFormatEnum {
     Standard,  Long,  Short,  LongDateShortTime,  ShortDateLongTime, 
  };
  private DateFormatEnum dateFormat = null;
  private TimeZoneSummary timeZone = null;
  private CultureSummary culture = null;

  
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
  @JsonProperty("timeZone")
  public TimeZoneSummary getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(TimeZoneSummary timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("culture")
  public CultureSummary getCulture() {
    return culture;
  }
  public void setCulture(CultureSummary culture) {
    this.culture = culture;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionAndTimeModel {\n");
    
    sb.append("  dateFormat: ").append(dateFormat).append("\n");
    sb.append("  timeZone: ").append(timeZone).append("\n");
    sb.append("  culture: ").append(culture).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
