package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis
 */
public class CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis   {
  private String productInventoryDistributionAdministrativePlanInstanceAnalysisData = null;

  private String productInventoryDistributionAdministrativePlanInstanceAnalysisReportType = null;

  private Object productInventoryDistributionAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productInventoryDistributionAdministrativePlanInstanceAnalysisData
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceAnalysisData() {
    return productInventoryDistributionAdministrativePlanInstanceAnalysisData;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceAnalysisData(String productInventoryDistributionAdministrativePlanInstanceAnalysisData) {
    this.productInventoryDistributionAdministrativePlanInstanceAnalysisData = productInventoryDistributionAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productInventoryDistributionAdministrativePlanInstanceAnalysisReport
  **/

  public Object getProductInventoryDistributionAdministrativePlanInstanceAnalysisReport() {
    return productInventoryDistributionAdministrativePlanInstanceAnalysisReport;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceAnalysisReport(Object productInventoryDistributionAdministrativePlanInstanceAnalysisReport) {
    this.productInventoryDistributionAdministrativePlanInstanceAnalysisReport = productInventoryDistributionAdministrativePlanInstanceAnalysisReport;
  }


}

