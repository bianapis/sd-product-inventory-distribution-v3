package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionOfferedService;
import org.bian.dto.SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionRetrieveInputModel
 */
public class SDProductInventoryDistributionRetrieveInputModel   {
  private Object productInventoryDistributionRetrieveActionTaskRecord = null;

  private String productInventoryDistributionRetrieveActionRequest = null;

  private SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecord productInventoryDistributionRetrieveActionRecord = null;

  private SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionOfferedService productInventoryDistributionOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productInventoryDistributionRetrieveActionTaskRecord
  **/

  public Object getProductInventoryDistributionRetrieveActionTaskRecord() {
    return productInventoryDistributionRetrieveActionTaskRecord;
  }

  public void setProductInventoryDistributionRetrieveActionTaskRecord(Object productInventoryDistributionRetrieveActionTaskRecord) {
    this.productInventoryDistributionRetrieveActionTaskRecord = productInventoryDistributionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productInventoryDistributionRetrieveActionRequest
  **/

  public String getProductInventoryDistributionRetrieveActionRequest() {
    return productInventoryDistributionRetrieveActionRequest;
  }

  public void setProductInventoryDistributionRetrieveActionRequest(String productInventoryDistributionRetrieveActionRequest) {
    this.productInventoryDistributionRetrieveActionRequest = productInventoryDistributionRetrieveActionRequest;
  }


  /**
   * Get productInventoryDistributionRetrieveActionRecord
   * @return productInventoryDistributionRetrieveActionRecord
  **/

  public SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecord getProductInventoryDistributionRetrieveActionRecord() {
    return productInventoryDistributionRetrieveActionRecord;
  }

  public void setProductInventoryDistributionRetrieveActionRecord(SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecord productInventoryDistributionRetrieveActionRecord) {
    this.productInventoryDistributionRetrieveActionRecord = productInventoryDistributionRetrieveActionRecord;
  }


  /**
   * Get productInventoryDistributionOfferedService
   * @return productInventoryDistributionOfferedService
  **/

  public SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionOfferedService getProductInventoryDistributionOfferedService() {
    return productInventoryDistributionOfferedService;
  }

  public void setProductInventoryDistributionOfferedService(SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionOfferedService productInventoryDistributionOfferedService) {
    this.productInventoryDistributionOfferedService = productInventoryDistributionOfferedService;
  }


}

