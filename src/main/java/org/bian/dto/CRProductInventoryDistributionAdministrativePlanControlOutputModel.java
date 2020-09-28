package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanControlOutputModel
 */
public class CRProductInventoryDistributionAdministrativePlanControlOutputModel   {
  private String productInventoryDistributionAdministrativePlanBudgetType = null;

  private String productInventoryDistributionAdministrativePlanAssignment = null;

  private String productInventoryDistributionAdministrativePlanPlan = null;

  private String productInventoryDistributionAdministrativePlanControlActionTaskReference = null;

  private Object productInventoryDistributionAdministrativePlanControlActionTaskRecord = null;

  private String productInventoryDistributionAdministrativePlanControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Inventory Distribution AdministrativePlan instance control processing service call 
   * @return productInventoryDistributionAdministrativePlanControlActionTaskReference
  **/

  public String getProductInventoryDistributionAdministrativePlanControlActionTaskReference() {
    return productInventoryDistributionAdministrativePlanControlActionTaskReference;
  }

  public void setProductInventoryDistributionAdministrativePlanControlActionTaskReference(String productInventoryDistributionAdministrativePlanControlActionTaskReference) {
    this.productInventoryDistributionAdministrativePlanControlActionTaskReference = productInventoryDistributionAdministrativePlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return productInventoryDistributionAdministrativePlanControlActionTaskRecord
  **/

  public Object getProductInventoryDistributionAdministrativePlanControlActionTaskRecord() {
    return productInventoryDistributionAdministrativePlanControlActionTaskRecord;
  }

  public void setProductInventoryDistributionAdministrativePlanControlActionTaskRecord(Object productInventoryDistributionAdministrativePlanControlActionTaskRecord) {
    this.productInventoryDistributionAdministrativePlanControlActionTaskRecord = productInventoryDistributionAdministrativePlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return productInventoryDistributionAdministrativePlanControlActionResponse
  **/

  public String getProductInventoryDistributionAdministrativePlanControlActionResponse() {
    return productInventoryDistributionAdministrativePlanControlActionResponse;
  }

  public void setProductInventoryDistributionAdministrativePlanControlActionResponse(String productInventoryDistributionAdministrativePlanControlActionResponse) {
    this.productInventoryDistributionAdministrativePlanControlActionResponse = productInventoryDistributionAdministrativePlanControlActionResponse;
  }


}

