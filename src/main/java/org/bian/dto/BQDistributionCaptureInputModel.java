package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryDistributionAdministrativePlanCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQDistributionCaptureInputModel
 */
public class BQDistributionCaptureInputModel   {
  private String productInventoryDistributionAdministrativePlanInstanceReference = null;

  private String distributionInstanceReference = null;

  private String distributionPreconditions = null;

  private String distributionBusinessUnitEmployeeReference = null;

  private String distributionWorkSchedule = null;

  private String businessService = null;

  private String distributionPostconditions = null;

  private String distributionServiceType = null;

  private String distributionServiceDescription = null;

  private String distributionServiceInputsandOuputs = null;

  private String distributionServiceWorkProduct = null;

  private String distributionServiceName = null;

  private Object distributionCaptureActionTaskRecord = null;

  private CRProductInventoryDistributionAdministrativePlanCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Inventory Distribution AdministrativePlan instance 
   * @return productInventoryDistributionAdministrativePlanInstanceReference
  **/

  public String getProductInventoryDistributionAdministrativePlanInstanceReference() {
    return productInventoryDistributionAdministrativePlanInstanceReference;
  }

  public void setProductInventoryDistributionAdministrativePlanInstanceReference(String productInventoryDistributionAdministrativePlanInstanceReference) {
    this.productInventoryDistributionAdministrativePlanInstanceReference = productInventoryDistributionAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Distribution instance 
   * @return distributionInstanceReference
  **/

  public String getDistributionInstanceReference() {
    return distributionInstanceReference;
  }

  public void setDistributionInstanceReference(String distributionInstanceReference) {
    this.distributionInstanceReference = distributionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return distributionPreconditions
  **/

  public String getDistributionPreconditions() {
    return distributionPreconditions;
  }

  public void setDistributionPreconditions(String distributionPreconditions) {
    this.distributionPreconditions = distributionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return distributionBusinessUnitEmployeeReference
  **/

  public String getDistributionBusinessUnitEmployeeReference() {
    return distributionBusinessUnitEmployeeReference;
  }

  public void setDistributionBusinessUnitEmployeeReference(String distributionBusinessUnitEmployeeReference) {
    this.distributionBusinessUnitEmployeeReference = distributionBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return distributionWorkSchedule
  **/

  public String getDistributionWorkSchedule() {
    return distributionWorkSchedule;
  }

  public void setDistributionWorkSchedule(String distributionWorkSchedule) {
    this.distributionWorkSchedule = distributionWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Product Inventory Distribution AdministrativePlan specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return distributionPostconditions
  **/

  public String getDistributionPostconditions() {
    return distributionPostconditions;
  }

  public void setDistributionPostconditions(String distributionPostconditions) {
    this.distributionPostconditions = distributionPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return distributionServiceType
  **/

  public String getDistributionServiceType() {
    return distributionServiceType;
  }

  public void setDistributionServiceType(String distributionServiceType) {
    this.distributionServiceType = distributionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return distributionServiceDescription
  **/

  public String getDistributionServiceDescription() {
    return distributionServiceDescription;
  }

  public void setDistributionServiceDescription(String distributionServiceDescription) {
    this.distributionServiceDescription = distributionServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return distributionServiceInputsandOuputs
  **/

  public String getDistributionServiceInputsandOuputs() {
    return distributionServiceInputsandOuputs;
  }

  public void setDistributionServiceInputsandOuputs(String distributionServiceInputsandOuputs) {
    this.distributionServiceInputsandOuputs = distributionServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return distributionServiceWorkProduct
  **/

  public String getDistributionServiceWorkProduct() {
    return distributionServiceWorkProduct;
  }

  public void setDistributionServiceWorkProduct(String distributionServiceWorkProduct) {
    this.distributionServiceWorkProduct = distributionServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return distributionServiceName
  **/

  public String getDistributionServiceName() {
    return distributionServiceName;
  }

  public void setDistributionServiceName(String distributionServiceName) {
    this.distributionServiceName = distributionServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return distributionCaptureActionTaskRecord
  **/

  public Object getDistributionCaptureActionTaskRecord() {
    return distributionCaptureActionTaskRecord;
  }

  public void setDistributionCaptureActionTaskRecord(Object distributionCaptureActionTaskRecord) {
    this.distributionCaptureActionTaskRecord = distributionCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRProductInventoryDistributionAdministrativePlanCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRProductInventoryDistributionAdministrativePlanCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

