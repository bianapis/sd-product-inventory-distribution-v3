package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement
 */
public class SDProductInventoryDistributionConfigureInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceAgreement   {
  private String productInventoryDistributionServiceAgreementReference = null;

  private String productInventoryDistributionServiceUserReference = null;

  private String productInventoryDistributionServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return productInventoryDistributionServiceAgreementReference
  **/

  public String getProductInventoryDistributionServiceAgreementReference() {
    return productInventoryDistributionServiceAgreementReference;
  }

  public void setProductInventoryDistributionServiceAgreementReference(String productInventoryDistributionServiceAgreementReference) {
    this.productInventoryDistributionServiceAgreementReference = productInventoryDistributionServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return productInventoryDistributionServiceUserReference
  **/

  public String getProductInventoryDistributionServiceUserReference() {
    return productInventoryDistributionServiceUserReference;
  }

  public void setProductInventoryDistributionServiceUserReference(String productInventoryDistributionServiceUserReference) {
    this.productInventoryDistributionServiceUserReference = productInventoryDistributionServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return productInventoryDistributionServiceAgreementTermsandConditions
  **/

  public String getProductInventoryDistributionServiceAgreementTermsandConditions() {
    return productInventoryDistributionServiceAgreementTermsandConditions;
  }

  public void setProductInventoryDistributionServiceAgreementTermsandConditions(String productInventoryDistributionServiceAgreementTermsandConditions) {
    this.productInventoryDistributionServiceAgreementTermsandConditions = productInventoryDistributionServiceAgreementTermsandConditions;
  }


}

