package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMailingCaptureOutputModel
 */
public class BQMailingCaptureOutputModel   {
  private String mailingPreconditions = null;

  private String mailingBusinessUnitEmployeeReference = null;

  private String mailingWorkSchedule = null;

  private String mailingPostconditions = null;

  private String mailingMailingServiceType = null;

  private String mailingMailingServiceDescription = null;

  private String mailingMailingServiceInputsandOuputs = null;

  private String mailingMailingServiceWorkProduct = null;

  private String mailingCaptureActionTaskReference = null;

  private Object mailingCaptureActionTaskRecord = null;

  private String mailingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Mailing instance capture service call 
   * @return mailingCaptureActionTaskReference
  **/

  public String getMailingCaptureActionTaskReference() {
    return mailingCaptureActionTaskReference;
  }

  public void setMailingCaptureActionTaskReference(String mailingCaptureActionTaskReference) {
    this.mailingCaptureActionTaskReference = mailingCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Mailing structured input transaction/record 
   * @return mailingCaptureRecordReference
  **/

  public String getMailingCaptureRecordReference() {
    return mailingCaptureRecordReference;
  }

  public void setMailingCaptureRecordReference(String mailingCaptureRecordReference) {
    this.mailingCaptureRecordReference = mailingCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

