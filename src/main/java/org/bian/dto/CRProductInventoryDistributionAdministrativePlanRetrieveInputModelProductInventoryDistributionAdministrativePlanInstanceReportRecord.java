package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord
 */
public class CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord   {
  private String productInventoryDistributionAdministrativePlanInstanceReportReference = null;

  private String productInventoryDistributionAdministrativePlanInstanceReportType = null;

  private String productInventoryDistributionAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productInventoryDistributionAdministrativePlanInstanceReportReference
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceReportReference() {
    return productInventoryDistributionAdministrativePlanInstanceReportReference;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReportReference(String productInventoryDistributionAdministrativePlanInstanceReportReference) {
    this.productInventoryDistributionAdministrativePlanInstanceReportReference = productInventoryDistributionAdministrativePlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productInventoryDistributionAdministrativePlanInstanceReportType
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceReportType() {
    return productInventoryDistributionAdministrativePlanInstanceReportType;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReportType(String productInventoryDistributionAdministrativePlanInstanceReportType) {
    this.productInventoryDistributionAdministrativePlanInstanceReportType = productInventoryDistributionAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productInventoryDistributionAdministrativePlanInstanceReportParameters
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceReportParameters() {
    return productInventoryDistributionAdministrativePlanInstanceReportParameters;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReportParameters(String productInventoryDistributionAdministrativePlanInstanceReportParameters) {
    this.productInventoryDistributionAdministrativePlanInstanceReportParameters = productInventoryDistributionAdministrativePlanInstanceReportParameters;
  }


}

