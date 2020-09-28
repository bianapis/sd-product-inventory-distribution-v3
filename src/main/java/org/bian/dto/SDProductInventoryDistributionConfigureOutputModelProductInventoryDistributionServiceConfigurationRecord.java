package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement;
import org.bian.dto.SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup;
import org.bian.dto.SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionConfigureOutputModelProductInventoryDistributionServiceConfigurationRecord
 */
public class SDProductInventoryDistributionConfigureOutputModelProductInventoryDistributionServiceConfigurationRecord   {
  private String productInventoryDistributionServiceConfigurationSettingDescription = null;

  private SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup productInventoryDistributionServiceConfigurationSetup = null;

  private SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription productInventoryDistributionServiceSubscription = null;

  private SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement productInventoryDistributionServiceAgreement = null;

  private String productInventoryDistributionServiceStatus = null;


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

  public SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup getProductInventoryDistributionServiceConfigurationSetup() {
    return productInventoryDistributionServiceConfigurationSetup;
  }

  public void setProductInventoryDistributionServiceConfigurationSetup(SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup productInventoryDistributionServiceConfigurationSetup) {
    this.productInventoryDistributionServiceConfigurationSetup = productInventoryDistributionServiceConfigurationSetup;
  }


  /**
   * Get productInventoryDistributionServiceSubscription
   * @return productInventoryDistributionServiceSubscription
  **/

  public SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription getProductInventoryDistributionServiceSubscription() {
    return productInventoryDistributionServiceSubscription;
  }

  public void setProductInventoryDistributionServiceSubscription(SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription productInventoryDistributionServiceSubscription) {
    this.productInventoryDistributionServiceSubscription = productInventoryDistributionServiceSubscription;
  }


  /**
   * Get productInventoryDistributionServiceAgreement
   * @return productInventoryDistributionServiceAgreement
  **/

  public SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement getProductInventoryDistributionServiceAgreement() {
    return productInventoryDistributionServiceAgreement;
  }

  public void setProductInventoryDistributionServiceAgreement(SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement productInventoryDistributionServiceAgreement) {
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

