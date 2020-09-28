package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionActivateOutputModel
 */
public class SDProductInventoryDistributionActivateOutputModel   {
  private String productInventoryDistributionActivationActionTaskReference = null;

  private Object productInventoryDistributionActivationActionTaskRecord = null;

  private String productInventoryDistributionServicingSessionReference = null;

  private Object productInventoryDistributionServicingSessionRecord = null;

  private SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecord productInventoryDistributionServiceConfigurationRecord = null;

  private String productInventoryDistributionServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return productInventoryDistributionActivationActionTaskReference
  **/

  public String getProductInventoryDistributionActivationActionTaskReference() {
    return productInventoryDistributionActivationActionTaskReference;
  }

  public void setProductInventoryDistributionActivationActionTaskReference(String productInventoryDistributionActivationActionTaskReference) {
    this.productInventoryDistributionActivationActionTaskReference = productInventoryDistributionActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return productInventoryDistributionServicingSessionRecord
  **/

  public Object getProductInventoryDistributionServicingSessionRecord() {
    return productInventoryDistributionServicingSessionRecord;
  }

  public void setProductInventoryDistributionServicingSessionRecord(Object productInventoryDistributionServicingSessionRecord) {
    this.productInventoryDistributionServicingSessionRecord = productInventoryDistributionServicingSessionRecord;
  }


  /**
   * Get productInventoryDistributionServiceConfigurationRecord
   * @return productInventoryDistributionServiceConfigurationRecord
  **/

  public SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecord getProductInventoryDistributionServiceConfigurationRecord() {
    return productInventoryDistributionServiceConfigurationRecord;
  }

  public void setProductInventoryDistributionServiceConfigurationRecord(SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecord productInventoryDistributionServiceConfigurationRecord) {
    this.productInventoryDistributionServiceConfigurationRecord = productInventoryDistributionServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return productInventoryDistributionServicingSessionStatus
  **/

  public String getProductInventoryDistributionServicingSessionStatus() {
    return productInventoryDistributionServicingSessionStatus;
  }

  public void setProductInventoryDistributionServicingSessionStatus(String productInventoryDistributionServicingSessionStatus) {
    this.productInventoryDistributionServicingSessionStatus = productInventoryDistributionServicingSessionStatus;
  }


}

