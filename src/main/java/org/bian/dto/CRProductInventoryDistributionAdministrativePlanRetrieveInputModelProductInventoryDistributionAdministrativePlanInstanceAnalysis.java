package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis
 */
public class CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis   {
  private String productInventoryDistributionAdministrativePlanInstanceAnalysisReference = null;

  private String productInventoryDistributionAdministrativePlanInstanceAnalysisReportType = null;

  private String productInventoryDistributionAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productInventoryDistributionAdministrativePlanInstanceAnalysisReference
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceAnalysisReference() {
    return productInventoryDistributionAdministrativePlanInstanceAnalysisReference;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceAnalysisReference(String productInventoryDistributionAdministrativePlanInstanceAnalysisReference) {
    this.productInventoryDistributionAdministrativePlanInstanceAnalysisReference = productInventoryDistributionAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productInventoryDistributionAdministrativePlanInstanceAnalysisReportType
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceAnalysisReportType() {
    return productInventoryDistributionAdministrativePlanInstanceAnalysisReportType;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceAnalysisReportType(String productInventoryDistributionAdministrativePlanInstanceAnalysisReportType) {
    this.productInventoryDistributionAdministrativePlanInstanceAnalysisReportType = productInventoryDistributionAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productInventoryDistributionAdministrativePlanInstanceAnalysisParameters
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceAnalysisParameters() {
    return productInventoryDistributionAdministrativePlanInstanceAnalysisParameters;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceAnalysisParameters(String productInventoryDistributionAdministrativePlanInstanceAnalysisParameters) {
    this.productInventoryDistributionAdministrativePlanInstanceAnalysisParameters = productInventoryDistributionAdministrativePlanInstanceAnalysisParameters;
  }


}

