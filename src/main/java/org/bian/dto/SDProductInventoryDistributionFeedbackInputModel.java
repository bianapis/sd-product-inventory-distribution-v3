package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionFeedbackInputModelProductInventoryDistributionFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionFeedbackInputModel
 */
public class SDProductInventoryDistributionFeedbackInputModel   {
  private Object productInventoryDistributionFeedbackActionTaskRecord = null;

  private SDProductInventoryDistributionFeedbackInputModelProductInventoryDistributionFeedbackActionRecord productInventoryDistributionFeedbackActionRecord = null;


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

  public SDProductInventoryDistributionFeedbackInputModelProductInventoryDistributionFeedbackActionRecord getProductInventoryDistributionFeedbackActionRecord() {
    return productInventoryDistributionFeedbackActionRecord;
  }

  public void setProductInventoryDistributionFeedbackActionRecord(SDProductInventoryDistributionFeedbackInputModelProductInventoryDistributionFeedbackActionRecord productInventoryDistributionFeedbackActionRecord) {
    this.productInventoryDistributionFeedbackActionRecord = productInventoryDistributionFeedbackActionRecord;
  }


}

