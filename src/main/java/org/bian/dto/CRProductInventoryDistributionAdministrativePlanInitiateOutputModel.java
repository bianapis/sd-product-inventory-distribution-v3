package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductInventoryDistributionAdministrativePlanInitiateOutputModel
 */
public class CRProductInventoryDistributionAdministrativePlanInitiateOutputModel   {
  private String productInventoryDistributionAdministrativePlanInstanceReference = null;

  private String productInventoryDistributionAdministrativePlanInitiateActionReference = null;

  private Object productInventoryDistributionAdministrativePlanInitiateActionRecord = null;

  private String productInventoryDistributionAdministrativePlanInstanceStatus = null;

  private String productInventoryDistributionAdministrativePlanBudgetType = null;

  private String productInventoryDistributionAdministrativePlanAssignment = null;

  private String productInventoryDistributionAdministrativePlanPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Inventory Distribution AdministrativePlan instance 
   * @return productInventoryDistributionAdministrativePlanInstanceReference
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceReference() {
    return productInventoryDistributionAdministrativePlanInstanceReference;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReference(String productInventoryDistributionAdministrativePlanInstanceReference) {
    this.productInventoryDistributionAdministrativePlanInstanceReference = productInventoryDistributionAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productInventoryDistributionAdministrativePlanInitiateActionReference
  **/

  public String getProductInventoryDistributionAdministrativePlanInitiateActionReference() {
    return productInventoryDistributionAdministrativePlanInitiateActionReference;
  }

  public void setProductInventoryDistributionAdministrativePlanInitiateActionReference(String productInventoryDistributionAdministrativePlanInitiateActionReference) {
    this.productInventoryDistributionAdministrativePlanInitiateActionReference = productInventoryDistributionAdministrativePlanInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productInventoryDistributionAdministrativePlanInitiateActionRecord
  **/

  public Object getProductInventoryDistributionAdministrativePlanInitiateActionRecord() {
    return productInventoryDistributionAdministrativePlanInitiateActionRecord;
  }

  public void setProductInventoryDistributionAdministrativePlanInitiateActionRecord(Object productInventoryDistributionAdministrativePlanInitiateActionRecord) {
    this.productInventoryDistributionAdministrativePlanInitiateActionRecord = productInventoryDistributionAdministrativePlanInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Inventory Distribution AdministrativePlan instance (e.g. initialised, pending, active) 
   * @return productInventoryDistributionAdministrativePlanInstanceStatus
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceStatus() {
    return productInventoryDistributionAdministrativePlanInstanceStatus;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceStatus(String productInventoryDistributionAdministrativePlanInstanceStatus) {
    this.productInventoryDistributionAdministrativePlanInstanceStatus = productInventoryDistributionAdministrativePlanInstanceStatus;
  }


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


}

