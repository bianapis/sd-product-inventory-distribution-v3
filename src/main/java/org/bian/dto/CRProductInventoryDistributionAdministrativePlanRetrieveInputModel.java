package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanRetrieveInputModel
 */
public class CRProductInventoryDistributionAdministrativePlanRetrieveInputModel   {
  private Object productInventoryDistributionAdministrativePlanRetrieveActionTaskRecord = null;

  private String productInventoryDistributionAdministrativePlanRetrieveActionRequest = null;

  private CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord productInventoryDistributionAdministrativePlanInstanceReportRecord = null;

  private CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis productInventoryDistributionAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productInventoryDistributionAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getProductInventoryDistributionAdministrativePlanRetrieveActionTaskRecord() {
    return productInventoryDistributionAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setProductInventoryDistributionAdministrativePlanRetrieveActionTaskRecord(Object productInventoryDistributionAdministrativePlanRetrieveActionTaskRecord) {
    this.productInventoryDistributionAdministrativePlanRetrieveActionTaskRecord = productInventoryDistributionAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productInventoryDistributionAdministrativePlanRetrieveActionRequest
  **/

  public String getProductInventoryDistributionAdministrativePlanRetrieveActionRequest() {
    return productInventoryDistributionAdministrativePlanRetrieveActionRequest;
  }

  public void setProductInventoryDistributionAdministrativePlanRetrieveActionRequest(String productInventoryDistributionAdministrativePlanRetrieveActionRequest) {
    this.productInventoryDistributionAdministrativePlanRetrieveActionRequest = productInventoryDistributionAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get productInventoryDistributionAdministrativePlanInstanceReportRecord
   * @return productInventoryDistributionAdministrativePlanInstanceReportRecord
  **/

  public CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord getProductInventoryDistributionAdministrativePlanInstanceReportRecord() {
    return productInventoryDistributionAdministrativePlanInstanceReportRecord;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReportRecord(CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord productInventoryDistributionAdministrativePlanInstanceReportRecord) {
    this.productInventoryDistributionAdministrativePlanInstanceReportRecord = productInventoryDistributionAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get productInventoryDistributionAdministrativePlanInstanceAnalysis
   * @return productInventoryDistributionAdministrativePlanInstanceAnalysis
  **/

  public CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis getProductInventoryDistributionAdministrativePlanInstanceAnalysis() {
    return productInventoryDistributionAdministrativePlanInstanceAnalysis;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceAnalysis(CRProductInventoryDistributionAdministrativePlanRetrieveInputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis productInventoryDistributionAdministrativePlanInstanceAnalysis) {
    this.productInventoryDistributionAdministrativePlanInstanceAnalysis = productInventoryDistributionAdministrativePlanInstanceAnalysis;
  }


}

