package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription
 */
public class SDProductInventoryDistributionActivateOutputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceSubscription   {
  private String productInventoryDistributionServiceSubscriberReference = null;

  private String productInventoryDistributionServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return productInventoryDistributionServiceSubscriberReference
  **/

  public String getProductInventoryDistributionServiceSubscriberReference() {
    return productInventoryDistributionServiceSubscriberReference;
  }

  public void setProductInventoryDistributionServiceSubscriberReference(String productInventoryDistributionServiceSubscriberReference) {
    this.productInventoryDistributionServiceSubscriberReference = productInventoryDistributionServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return productInventoryDistributionServiceSubscriberAccessProfile
  **/

  public String getProductInventoryDistributionServiceSubscriberAccessProfile() {
    return productInventoryDistributionServiceSubscriberAccessProfile;
  }

  public void setProductInventoryDistributionServiceSubscriberAccessProfile(String productInventoryDistributionServiceSubscriberAccessProfile) {
    this.productInventoryDistributionServiceSubscriberAccessProfile = productInventoryDistributionServiceSubscriberAccessProfile;
  }


}

