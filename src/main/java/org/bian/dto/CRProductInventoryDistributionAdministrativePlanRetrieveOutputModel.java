package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanRetrieveOutputModel
 */
public class CRProductInventoryDistributionAdministrativePlanRetrieveOutputModel   {
  private String productInventoryDistributionAdministrativePlanBudgetType = null;

  private String productInventoryDistributionAdministrativePlanAssignment = null;

  private String productInventoryDistributionAdministrativePlanPlan = null;

  private String productInventoryDistributionAdministrativePlanReference = null;

  private String productInventoryDistributionAdministrativePlanRetrieveActionTaskReference = null;

  private Object productInventoryDistributionAdministrativePlanRetrieveActionTaskRecord = null;

  private String productInventoryDistributionAdministrativePlanRetrieveActionResponse = null;

  private CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord productInventoryDistributionAdministrativePlanInstanceReportRecord = null;

  private CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis productInventoryDistributionAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within Product Inventory Distribution AdministrativePlan according to the type of resource and/or activity that is budgetted 
   * @return productInventoryDistributionAdministrativePlanBudgetType
  **/

  public String getProductInventoryDistributionAdministrativePlanBudgetType() {
    return productInventoryDistributionAdministrativePlanBudgetType;
  }

  public void setProductInventoryDistributionAdministrativePlanBudgetType(String productInventoryDistributionAdministrativePlanBudgetType) {
    this.productInventoryDistributionAdministrativePlanBudgetType = productInventoryDistributionAdministrativePlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for Product Inventory Distribution AdministrativePlan 
   * @return productInventoryDistributionAdministrativePlanAssignment
  **/

  public String getProductInventoryDistributionAdministrativePlanAssignment() {
    return productInventoryDistributionAdministrativePlanAssignment;
  }

  public void setProductInventoryDistributionAdministrativePlanAssignment(String productInventoryDistributionAdministrativePlanAssignment) {
    this.productInventoryDistributionAdministrativePlanAssignment = productInventoryDistributionAdministrativePlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A plan that defines clerical support for ProductInventoryDistribution 
   * @return productInventoryDistributionAdministrativePlanPlan
  **/

  public String getProductInventoryDistributionAdministrativePlanPlan() {
    return productInventoryDistributionAdministrativePlanPlan;
  }

  public void setProductInventoryDistributionAdministrativePlanPlan(String productInventoryDistributionAdministrativePlanPlan) {
    this.productInventoryDistributionAdministrativePlanPlan = productInventoryDistributionAdministrativePlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party who is involved in Product Inventory Distribution AdministrativePlan 
   * @return productInventoryDistributionAdministrativePlanReference
  **/

  public String getProductInventoryDistributionAdministrativePlanReference() {
    return productInventoryDistributionAdministrativePlanReference;
  }

  public void setProductInventoryDistributionAdministrativePlanReference(String productInventoryDistributionAdministrativePlanReference) {
    this.productInventoryDistributionAdministrativePlanReference = productInventoryDistributionAdministrativePlanReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Inventory Distribution AdministrativePlan instance retrieve service call 
   * @return productInventoryDistributionAdministrativePlanRetrieveActionTaskReference
  **/

  public String getProductInventoryDistributionAdministrativePlanRetrieveActionTaskReference() {
    return productInventoryDistributionAdministrativePlanRetrieveActionTaskReference;
  }

  public void setProductInventoryDistributionAdministrativePlanRetrieveActionTaskReference(String productInventoryDistributionAdministrativePlanRetrieveActionTaskReference) {
    this.productInventoryDistributionAdministrativePlanRetrieveActionTaskReference = productInventoryDistributionAdministrativePlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productInventoryDistributionAdministrativePlanRetrieveActionResponse
  **/

  public String getProductInventoryDistributionAdministrativePlanRetrieveActionResponse() {
    return productInventoryDistributionAdministrativePlanRetrieveActionResponse;
  }

  public void setProductInventoryDistributionAdministrativePlanRetrieveActionResponse(String productInventoryDistributionAdministrativePlanRetrieveActionResponse) {
    this.productInventoryDistributionAdministrativePlanRetrieveActionResponse = productInventoryDistributionAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get productInventoryDistributionAdministrativePlanInstanceReportRecord
   * @return productInventoryDistributionAdministrativePlanInstanceReportRecord
  **/

  public CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord getProductInventoryDistributionAdministrativePlanInstanceReportRecord() {
    return productInventoryDistributionAdministrativePlanInstanceReportRecord;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReportRecord(CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceReportRecord productInventoryDistributionAdministrativePlanInstanceReportRecord) {
    this.productInventoryDistributionAdministrativePlanInstanceReportRecord = productInventoryDistributionAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get productInventoryDistributionAdministrativePlanInstanceAnalysis
   * @return productInventoryDistributionAdministrativePlanInstanceAnalysis
  **/

  public CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis getProductInventoryDistributionAdministrativePlanInstanceAnalysis() {
    return productInventoryDistributionAdministrativePlanInstanceAnalysis;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceAnalysis(CRProductInventoryDistributionAdministrativePlanRetrieveOutputModelProductInventoryDistributionAdministrativePlanInstanceAnalysis productInventoryDistributionAdministrativePlanInstanceAnalysis) {
    this.productInventoryDistributionAdministrativePlanInstanceAnalysis = productInventoryDistributionAdministrativePlanInstanceAnalysis;
  }


}

