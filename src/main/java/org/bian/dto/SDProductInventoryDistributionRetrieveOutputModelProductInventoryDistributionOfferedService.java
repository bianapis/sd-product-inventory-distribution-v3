package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedService
 */
public class SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedService   {
  private String productInventoryDistributionServiceReference = null;

  private SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecord productInventoryDistributionServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return productInventoryDistributionServiceReference
  **/

  public String getProductInventoryDistributionServiceReference() {
    return productInventoryDistributionServiceReference;
  }

  public void setProductInventoryDistributionServiceReference(String productInventoryDistributionServiceReference) {
    this.productInventoryDistributionServiceReference = productInventoryDistributionServiceReference;
  }


  /**
   * Get productInventoryDistributionServiceRecord
   * @return productInventoryDistributionServiceRecord
  **/

  public SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecord getProductInventoryDistributionServiceRecord() {
    return productInventoryDistributionServiceRecord;
  }

  public void setProductInventoryDistributionServiceRecord(SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecord productInventoryDistributionServiceRecord) {
    this.productInventoryDistributionServiceRecord = productInventoryDistributionServiceRecord;
  }


}

