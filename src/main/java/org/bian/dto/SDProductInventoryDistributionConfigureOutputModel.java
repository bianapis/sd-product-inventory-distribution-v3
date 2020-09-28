package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionConfigureOutputModelProductInventoryDistributionServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionConfigureOutputModel
 */
public class SDProductInventoryDistributionConfigureOutputModel   {
  private String productInventoryDistributionConfigurationActionTaskReference = null;

  private Object productInventoryDistributionConfigurationActionTaskRecord = null;

  private SDProductInventoryDistributionConfigureOutputModelProductInventoryDistributionServiceConfigurationRecord productInventoryDistributionServiceConfigurationRecord = null;

  private String productInventoryDistributionServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return productInventoryDistributionConfigurationActionTaskReference
  **/

  public String getProductInventoryDistributionConfigurationActionTaskReference() {
    return productInventoryDistributionConfigurationActionTaskReference;
  }

  public void setProductInventoryDistributionConfigurationActionTaskReference(String productInventoryDistributionConfigurationActionTaskReference) {
    this.productInventoryDistributionConfigurationActionTaskReference = productInventoryDistributionConfigurationActionTaskReference;
  }


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
   * Get productInventoryDistributionServiceConfigurationRecord
   * @return productInventoryDistributionServiceConfigurationRecord
  **/

  public SDProductInventoryDistributionConfigureOutputModelProductInventoryDistributionServiceConfigurationRecord getProductInventoryDistributionServiceConfigurationRecord() {
    return productInventoryDistributionServiceConfigurationRecord;
  }

  public void setProductInventoryDistributionServiceConfigurationRecord(SDProductInventoryDistributionConfigureOutputModelProductInventoryDistributionServiceConfigurationRecord productInventoryDistributionServiceConfigurationRecord) {
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

