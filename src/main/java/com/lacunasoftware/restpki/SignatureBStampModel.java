package com.lacunasoftware.restpki;

import com.lacunasoftware.restpki.DigestAlgorithmAndValueModel;
import com.lacunasoftware.restpki.FileModel;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-28T18:31:08.305-03:00")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
class SignatureBStampModel   {
  
  private List<DigestAlgorithmAndValueModel> documentDigests = new ArrayList<DigestAlgorithmAndValueModel>();
  private List<DigestAlgorithmAndValueModel> indexDigests = new ArrayList<DigestAlgorithmAndValueModel>();
  private FileModel indexFile = null;
  public enum BlockchainEnum {
     Bitcoin, 
  };
  private BlockchainEnum blockchain = null;
  private String transactionId = null;
  private Long blockNumber = null;
  private Date blockDate = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("documentDigests")
  public List<DigestAlgorithmAndValueModel> getDocumentDigests() {
    return documentDigests;
  }
  public void setDocumentDigests(List<DigestAlgorithmAndValueModel> documentDigests) {
    this.documentDigests = documentDigests;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("indexDigests")
  public List<DigestAlgorithmAndValueModel> getIndexDigests() {
    return indexDigests;
  }
  public void setIndexDigests(List<DigestAlgorithmAndValueModel> indexDigests) {
    this.indexDigests = indexDigests;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("indexFile")
  public FileModel getIndexFile() {
    return indexFile;
  }
  public void setIndexFile(FileModel indexFile) {
    this.indexFile = indexFile;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("blockchain")
  public BlockchainEnum getBlockchain() {
    return blockchain;
  }
  public void setBlockchain(BlockchainEnum blockchain) {
    this.blockchain = blockchain;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("blockNumber")
  public Long getBlockNumber() {
    return blockNumber;
  }
  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("blockDate")
  public Date getBlockDate() {
    return blockDate;
  }
  public void setBlockDate(Date blockDate) {
    this.blockDate = blockDate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureBStampModel {\n");
    
    sb.append("  documentDigests: ").append(documentDigests).append("\n");
    sb.append("  indexDigests: ").append(indexDigests).append("\n");
    sb.append("  indexFile: ").append(indexFile).append("\n");
    sb.append("  blockchain: ").append(blockchain).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  blockDate: ").append(blockDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
