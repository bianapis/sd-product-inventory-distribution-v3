package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecord
 */
public class SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecord   {
  private String productInventoryDistributionServiceConfigurationSettingReference = null;

  private String productInventoryDistributionServiceConfigurationSettingType = null;

  private SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup productInventoryDistributionServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return productInventoryDistributionServiceConfigurationSettingReference
  **/

  public String getProductInventoryDistributionServiceConfigurationSettingReference() {
    return productInventoryDistributionServiceConfigurationSettingReference;
  }

  public void setProductInventoryDistributionServiceConfigurationSettingReference(String productInventoryDistributionServiceConfigurationSettingReference) {
    this.productInventoryDistributionServiceConfigurationSettingReference = productInventoryDistributionServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return productInventoryDistributionServiceConfigurationSettingType
  **/

  public String getProductInventoryDistributionServiceConfigurationSettingType() {
    return productInventoryDistributionServiceConfigurationSettingType;
  }

  public void setProductInventoryDistributionServiceConfigurationSettingType(String productInventoryDistributionServiceConfigurationSettingType) {
    this.productInventoryDistributionServiceConfigurationSettingType = productInventoryDistributionServiceConfigurationSettingType;
  }


  /**
   * Get productInventoryDistributionServiceConfigurationSetup
   * @return productInventoryDistributionServiceConfigurationSetup
  **/

  public SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup getProductInventoryDistributionServiceConfigurationSetup() {
    return productInventoryDistributionServiceConfigurationSetup;
  }

  public void setProductInventoryDistributionServiceConfigurationSetup(SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup productInventoryDistributionServiceConfigurationSetup) {
    this.productInventoryDistributionServiceConfigurationSetup = productInventoryDistributionServiceConfigurationSetup;
  }


}

