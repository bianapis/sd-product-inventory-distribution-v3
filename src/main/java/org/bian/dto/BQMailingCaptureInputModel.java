package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductInventoryDistributionAdministrativePlanCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQMailingCaptureInputModel
 */
public class BQMailingCaptureInputModel   {
  private String productInventoryDistributionAdministrativePlanInstanceReference = null;

  private String mailingInstanceReference = null;

  private String mailingPreconditions = null;

  private String mailingBusinessUnitEmployeeReference = null;

  private String mailingWorkSchedule = null;

  private String mailingPostconditions = null;

  private String mailingMailingServiceType = null;

  private String mailingMailingServiceDescription = null;

  private String mailingMailingServiceInputsandOuputs = null;

  private String mailingMailingServiceWorkProduct = null;

  private Object mailingCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Mailing instance 
   * @return mailingInstanceReference
  **/

  public String getMailingInstanceReference() {
    return mailingInstanceReference;
  }

  public void setMailingInstanceReference(String mailingInstanceReference) {
    this.mailingInstanceReference = mailingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return mailingPreconditions
  **/

  public String getMailingPreconditions() {
    return mailingPreconditions;
  }

  public void setMailingPreconditions(String mailingPreconditions) {
    this.mailingPreconditions = mailingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return mailingBusinessUnitEmployeeReference
  **/

  public String getMailingBusinessUnitEmployeeReference() {
    return mailingBusinessUnitEmployeeReference;
  }

  public void setMailingBusinessUnitEmployeeReference(String mailingBusinessUnitEmployeeReference) {
    this.mailingBusinessUnitEmployeeReference = mailingBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return mailingWorkSchedule
  **/

  public String getMailingWorkSchedule() {
    return mailingWorkSchedule;
  }

  public void setMailingWorkSchedule(String mailingWorkSchedule) {
    this.mailingWorkSchedule = mailingWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return mailingPostconditions
  **/

  public String getMailingPostconditions() {
    return mailingPostconditions;
  }

  public void setMailingPostconditions(String mailingPostconditions) {
    this.mailingPostconditions = mailingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return mailingMailingServiceType
  **/

  public String getMailingMailingServiceType() {
    return mailingMailingServiceType;
  }

  public void setMailingMailingServiceType(String mailingMailingServiceType) {
    this.mailingMailingServiceType = mailingMailingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return mailingMailingServiceDescription
  **/

  public String getMailingMailingServiceDescription() {
    return mailingMailingServiceDescription;
  }

  public void setMailingMailingServiceDescription(String mailingMailingServiceDescription) {
    this.mailingMailingServiceDescription = mailingMailingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return mailingMailingServiceInputsandOuputs
  **/

  public String getMailingMailingServiceInputsandOuputs() {
    return mailingMailingServiceInputsandOuputs;
  }

  public void setMailingMailingServiceInputsandOuputs(String mailingMailingServiceInputsandOuputs) {
    this.mailingMailingServiceInputsandOuputs = mailingMailingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return mailingMailingServiceWorkProduct
  **/

  public String getMailingMailingServiceWorkProduct() {
    return mailingMailingServiceWorkProduct;
  }

  public void setMailingMailingServiceWorkProduct(String mailingMailingServiceWorkProduct) {
    this.mailingMailingServiceWorkProduct = mailingMailingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return mailingCaptureActionTaskRecord
  **/

  public Object getMailingCaptureActionTaskRecord() {
    return mailingCaptureActionTaskRecord;
  }

  public void setMailingCaptureActionTaskRecord(Object mailingCaptureActionTaskRecord) {
    this.mailingCaptureActionTaskRecord = mailingCaptureActionTaskRecord;
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

