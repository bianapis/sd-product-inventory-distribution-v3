package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup;
import org.bian.dto.SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement;
import org.bian.dto.SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecord
 */
public class SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecord   {
  private String productInventoryDistributionServiceConfigurationSettingReference = null;

  private String productInventoryDistributionServiceConfigurationSettingDescription = null;

  private SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup productInventoryDistributionServiceConfigurationSetup = null;

  private SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription productInventoryDistributionServiceSubscription = null;

  private SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement productInventoryDistributionServiceAgreement = null;

  private String productInventoryDistributionServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return productInventoryDistributionServiceConfigurationSettingDescription
  **/

  public String getProductInventoryDistributionServiceConfigurationSettingDescription() {
    return productInventoryDistributionServiceConfigurationSettingDescription;
  }

  public void setProductInventoryDistributionServiceConfigurationSettingDescription(String productInventoryDistributionServiceConfigurationSettingDescription) {
    this.productInventoryDistributionServiceConfigurationSettingDescription = productInventoryDistributionServiceConfigurationSettingDescription;
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


  /**
   * Get productInventoryDistributionServiceSubscription
   * @return productInventoryDistributionServiceSubscription
  **/

  public SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription getProductInventoryDistributionServiceSubscription() {
    return productInventoryDistributionServiceSubscription;
  }

  public void setProductInventoryDistributionServiceSubscription(SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription productInventoryDistributionServiceSubscription) {
    this.productInventoryDistributionServiceSubscription = productInventoryDistributionServiceSubscription;
  }


  /**
   * Get productInventoryDistributionServiceAgreement
   * @return productInventoryDistributionServiceAgreement
  **/

  public SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement getProductInventoryDistributionServiceAgreement() {
    return productInventoryDistributionServiceAgreement;
  }

  public void setProductInventoryDistributionServiceAgreement(SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement productInventoryDistributionServiceAgreement) {
    this.productInventoryDistributionServiceAgreement = productInventoryDistributionServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return productInventoryDistributionServiceStatus
  **/

  public String getProductInventoryDistributionServiceStatus() {
    return productInventoryDistributionServiceStatus;
  }

  public void setProductInventoryDistributionServiceStatus(String productInventoryDistributionServiceStatus) {
    this.productInventoryDistributionServiceStatus = productInventoryDistributionServiceStatus;
  }


}

