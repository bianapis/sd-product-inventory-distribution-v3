package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord
 */
public class CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord   {
  private String productInventoryDistributionAdministrativePlanInstanceReportData = null;

  private String productInventoryDistributionAdministrativePlanInstanceReportType = null;

  private Object productInventoryDistributionAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productInventoryDistributionAdministrativePlanInstanceReportData
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceReportData() {
    return productInventoryDistributionAdministrativePlanInstanceReportData;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReportData(String productInventoryDistributionAdministrativePlanInstanceReportData) {
    this.productInventoryDistributionAdministrativePlanInstanceReportData = productInventoryDistributionAdministrativePlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productInventoryDistributionAdministrativePlanInstanceReport
  **/

  public Object getProductInventoryDistributionAdministrativePlanInstanceReport() {
    return productInventoryDistributionAdministrativePlanInstanceReport;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReport(Object productInventoryDistributionAdministrativePlanInstanceReport) {
    this.productInventoryDistributionAdministrativePlanInstanceReport = productInventoryDistributionAdministrativePlanInstanceReport;
  }


}

