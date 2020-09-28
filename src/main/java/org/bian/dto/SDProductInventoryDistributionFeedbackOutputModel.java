package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionFeedbackOutputModelProductInventoryDistributionFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionFeedbackOutputModel
 */
public class SDProductInventoryDistributionFeedbackOutputModel   {
  private String productInventoryDistributionFeedbackActionTaskReference = null;

  private Object productInventoryDistributionFeedbackActionTaskRecord = null;

  private SDProductInventoryDistributionFeedbackOutputModelProductInventoryDistributionFeedbackActionRecord productInventoryDistributionFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return productInventoryDistributionFeedbackActionTaskReference
  **/

  public String getProductInventoryDistributionFeedbackActionTaskReference() {
    return productInventoryDistributionFeedbackActionTaskReference;
  }

  public void setProductInventoryDistributionFeedbackActionTaskReference(String productInventoryDistributionFeedbackActionTaskReference) {
    this.productInventoryDistributionFeedbackActionTaskReference = productInventoryDistributionFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return productInventoryDistributionFeedbackActionTaskRecord
  **/

  public Object getProductInventoryDistributionFeedbackActionTaskRecord() {
    return productInventoryDistributionFeedbackActionTaskRecord;
  }

  public void setProductInventoryDistributionFeedbackActionTaskRecord(Object productInventoryDistributionFeedbackActionTaskRecord) {
    this.productInventoryDistributionFeedbackActionTaskRecord = productInventoryDistributionFeedbackActionTaskRecord;
  }


  /**
   * Get productInventoryDistributionFeedbackActionRecord
   * @return productInventoryDistributionFeedbackActionRecord
  **/

  public SDProductInventoryDistributionFeedbackOutputModelProductInventoryDistributionFeedbackActionRecord getProductInventoryDistributionFeedbackActionRecord() {
    return productInventoryDistributionFeedbackActionRecord;
  }

  public void setProductInventoryDistributionFeedbackActionRecord(SDProductInventoryDistributionFeedbackOutputModelProductInventoryDistributionFeedbackActionRecord productInventoryDistributionFeedbackActionRecord) {
    this.productInventoryDistributionFeedbackActionRecord = productInventoryDistributionFeedbackActionRecord;
  }


}

