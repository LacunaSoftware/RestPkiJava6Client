package com.lacunasoftware.restpki;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-30T19:04:19.798-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class AccountSettingsData   {
  
  private Boolean storeTransactionDetails = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("storeTransactionDetails")
  public Boolean getStoreTransactionDetails() {
    return storeTransactionDetails;
  }
  public void setStoreTransactionDetails(Boolean storeTransactionDetails) {
    this.storeTransactionDetails = storeTransactionDetails;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSettingsData {\n");
    
    sb.append("  storeTransactionDetails: ").append(storeTransactionDetails).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
