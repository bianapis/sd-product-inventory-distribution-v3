package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedService;
import org.bian.dto.SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionRetrieveOutputModel
 */
public class SDProductInventoryDistributionRetrieveOutputModel   {
  private String productInventoryDistributionRetrieveActionTaskReference = null;

  private Object productInventoryDistributionRetrieveActionTaskRecord = null;

  private String productInventoryDistributionRetrieveActionResponse = null;

  private SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecord productInventoryDistributionRetrieveActionRecord = null;

  private SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedService productInventoryDistributionOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return productInventoryDistributionRetrieveActionTaskReference
  **/

  public String getProductInventoryDistributionRetrieveActionTaskReference() {
    return productInventoryDistributionRetrieveActionTaskReference;
  }

  public void setProductInventoryDistributionRetrieveActionTaskReference(String productInventoryDistributionRetrieveActionTaskReference) {
    this.productInventoryDistributionRetrieveActionTaskReference = productInventoryDistributionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productInventoryDistributionRetrieveActionResponse
  **/

  public String getProductInventoryDistributionRetrieveActionResponse() {
    return productInventoryDistributionRetrieveActionResponse;
  }

  public void setProductInventoryDistributionRetrieveActionResponse(String productInventoryDistributionRetrieveActionResponse) {
    this.productInventoryDistributionRetrieveActionResponse = productInventoryDistributionRetrieveActionResponse;
  }


  /**
   * Get productInventoryDistributionRetrieveActionRecord
   * @return productInventoryDistributionRetrieveActionRecord
  **/

  public SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecord getProductInventoryDistributionRetrieveActionRecord() {
    return productInventoryDistributionRetrieveActionRecord;
  }

  public void setProductInventoryDistributionRetrieveActionRecord(SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecord productInventoryDistributionRetrieveActionRecord) {
    this.productInventoryDistributionRetrieveActionRecord = productInventoryDistributionRetrieveActionRecord;
  }


  /**
   * Get productInventoryDistributionOfferedService
   * @return productInventoryDistributionOfferedService
  **/

  public SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedService getProductInventoryDistributionOfferedService() {
    return productInventoryDistributionOfferedService;
  }

  public void setProductInventoryDistributionOfferedService(SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedService productInventoryDistributionOfferedService) {
    this.productInventoryDistributionOfferedService = productInventoryDistributionOfferedService;
  }


}

