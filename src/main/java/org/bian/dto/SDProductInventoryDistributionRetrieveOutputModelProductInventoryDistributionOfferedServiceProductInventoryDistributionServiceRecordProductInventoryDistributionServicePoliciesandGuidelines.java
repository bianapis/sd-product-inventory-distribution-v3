package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecordProductInventoryDistributionServicePoliciesandGuidelines
 */
public class SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecordProductInventoryDistributionServicePoliciesandGuidelines   {
  private String productInventoryDistributionServiceEligibility = null;

  private String productInventoryDistributionServiceIntendedUses = null;

  private String productInventoryDistributionServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return productInventoryDistributionServiceEligibility
  **/

  public String getProductInventoryDistributionServiceEligibility() {
    return productInventoryDistributionServiceEligibility;
  }

  public void setProductInventoryDistributionServiceEligibility(String productInventoryDistributionServiceEligibility) {
    this.productInventoryDistributionServiceEligibility = productInventoryDistributionServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return productInventoryDistributionServiceIntendedUses
  **/

  public String getProductInventoryDistributionServiceIntendedUses() {
    return productInventoryDistributionServiceIntendedUses;
  }

  public void setProductInventoryDistributionServiceIntendedUses(String productInventoryDistributionServiceIntendedUses) {
    this.productInventoryDistributionServiceIntendedUses = productInventoryDistributionServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return productInventoryDistributionServicePricingandTerms
  **/

  public String getProductInventoryDistributionServicePricingandTerms() {
    return productInventoryDistributionServicePricingandTerms;
  }

  public void setProductInventoryDistributionServicePricingandTerms(String productInventoryDistributionServicePricingandTerms) {
    this.productInventoryDistributionServicePricingandTerms = productInventoryDistributionServicePricingandTerms;
  }


}

