package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionConfigureInputModel
 */
public class SDProductInventoryDistributionConfigureInputModel   {
  private Object productInventoryDistributionConfigurationActionTaskRecord = null;

  private String productInventoryDistributionServicingSessionReference = null;

  private String productInventoryDistributionServiceReference = null;

  private SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecord productInventoryDistributionServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return productInventoryDistributionConfigurationActionTaskRecord
  **/

  public Object getProductInventoryDistributionConfigurationActionTaskRecord() {
    return productInventoryDistributionConfigurationActionTaskRecord;
  }

  public void setProductInventoryDistributionConfigurationActionTaskRecord(Object productInventoryDistributionConfigurationActionTaskRecord) {
    this.productInventoryDistributionConfigurationActionTaskRecord = productInventoryDistributionConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productInventoryDistributionServicingSessionReference
  **/

  public String getProductInventoryDistributionServicingSessionReference() {
    return productInventoryDistributionServicingSessionReference;
  }

  public void setProductInventoryDistributionServicingSessionReference(String productInventoryDistributionServicingSessionReference) {
    this.productInventoryDistributionServicingSessionReference = productInventoryDistributionServicingSessionReference;
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

  public SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecord getProductInventoryDistributionServiceConfigurationRecord() {
    return productInventoryDistributionServiceConfigurationRecord;
  }

  public void setProductInventoryDistributionServiceConfigurationRecord(SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecord productInventoryDistributionServiceConfigurationRecord) {
    this.productInventoryDistributionServiceConfigurationRecord = productInventoryDistributionServiceConfigurationRecord;
  }


}

