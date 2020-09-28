package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionActivateInputModel
 */
public class SDProductInventoryDistributionActivateInputModel   {
  private Object productInventoryDistributionActivationActionTaskRecord = null;

  private String productInventoryDistributionCenterReference = null;

  private String productInventoryDistributionServiceReference = null;

  private SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecord productInventoryDistributionServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return productInventoryDistributionActivationActionTaskRecord
  **/

  public Object getProductInventoryDistributionActivationActionTaskRecord() {
    return productInventoryDistributionActivationActionTaskRecord;
  }

  public void setProductInventoryDistributionActivationActionTaskRecord(Object productInventoryDistributionActivationActionTaskRecord) {
    this.productInventoryDistributionActivationActionTaskRecord = productInventoryDistributionActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return productInventoryDistributionCenterReference
  **/

  public String getProductInventoryDistributionCenterReference() {
    return productInventoryDistributionCenterReference;
  }

  public void setProductInventoryDistributionCenterReference(String productInventoryDistributionCenterReference) {
    this.productInventoryDistributionCenterReference = productInventoryDistributionCenterReference;
  }


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
   * Get productInventoryDistributionServiceConfigurationRecord
   * @return productInventoryDistributionServiceConfigurationRecord
  **/

  public SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecord getProductInventoryDistributionServiceConfigurationRecord() {
    return productInventoryDistributionServiceConfigurationRecord;
  }

  public void setProductInventoryDistributionServiceConfigurationRecord(SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecord productInventoryDistributionServiceConfigurationRecord) {
    this.productInventoryDistributionServiceConfigurationRecord = productInventoryDistributionServiceConfigurationRecord;
  }


}

