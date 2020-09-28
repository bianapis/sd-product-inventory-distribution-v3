package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanExchangeOutputModel
 */
public class CRProductInventoryDistributionAdministrativePlanExchangeOutputModel   {
  private String productInventoryDistributionAdministrativePlanBudgetType = null;

  private String productInventoryDistributionAdministrativePlanAssignment = null;

  private String productInventoryDistributionAdministrativePlanPlan = null;

  private String productInventoryDistributionAdministrativePlanExchangeActionTaskReference = null;

  private Object productInventoryDistributionAdministrativePlanExchangeActionTaskRecord = null;

  private String productInventoryDistributionAdministrativePlanExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Inventory Distribution AdministrativePlan instance exchange service call 
   * @return productInventoryDistributionAdministrativePlanExchangeActionTaskReference
  **/

  public String getProductInventoryDistributionAdministrativePlanExchangeActionTaskReference() {
    return productInventoryDistributionAdministrativePlanExchangeActionTaskReference;
  }

  public void setProductInventoryDistributionAdministrativePlanExchangeActionTaskReference(String productInventoryDistributionAdministrativePlanExchangeActionTaskReference) {
    this.productInventoryDistributionAdministrativePlanExchangeActionTaskReference = productInventoryDistributionAdministrativePlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productInventoryDistributionAdministrativePlanExchangeActionTaskRecord
  **/

  public Object getProductInventoryDistributionAdministrativePlanExchangeActionTaskRecord() {
    return productInventoryDistributionAdministrativePlanExchangeActionTaskRecord;
  }

  public void setProductInventoryDistributionAdministrativePlanExchangeActionTaskRecord(Object productInventoryDistributionAdministrativePlanExchangeActionTaskRecord) {
    this.productInventoryDistributionAdministrativePlanExchangeActionTaskRecord = productInventoryDistributionAdministrativePlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productInventoryDistributionAdministrativePlanExchangeActionResponse
  **/

  public String getProductInventoryDistributionAdministrativePlanExchangeActionResponse() {
    return productInventoryDistributionAdministrativePlanExchangeActionResponse;
  }

  public void setProductInventoryDistributionAdministrativePlanExchangeActionResponse(String productInventoryDistributionAdministrativePlanExchangeActionResponse) {
    this.productInventoryDistributionAdministrativePlanExchangeActionResponse = productInventoryDistributionAdministrativePlanExchangeActionResponse;
  }


}

