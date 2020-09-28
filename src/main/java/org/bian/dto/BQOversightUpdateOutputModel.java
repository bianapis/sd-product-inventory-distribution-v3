package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOversightUpdateOutputModel
 */
public class BQOversightUpdateOutputModel   {
  private String oversightPreconditions = null;

  private String oversightBusinessUnitEmployeeReference = null;

  private String oversightWorkSchedule = null;

  private String administrativeOversight = null;

  private String oversightPostconditions = null;

  private String oversightAdministrativeOversightServiceType = null;

  private String oversightAdministrativeOversightServiceDescription = null;

  private String oversightAdministrativeOversightServiceInputsandOuputs = null;

  private String oversightAdministrativeOversightServiceWorkProduct = null;

  private String oversightAdministrativeOversightServiceName = null;

  private String oversightUpdateActionTaskReference = null;

  private Object oversightUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return oversightPreconditions
  **/

  public String getOversightPreconditions() {
    return oversightPreconditions;
  }

  public void setOversightPreconditions(String oversightPreconditions) {
    this.oversightPreconditions = oversightPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return oversightBusinessUnitEmployeeReference
  **/

  public String getOversightBusinessUnitEmployeeReference() {
    return oversightBusinessUnitEmployeeReference;
  }

  public void setOversightBusinessUnitEmployeeReference(String oversightBusinessUnitEmployeeReference) {
    this.oversightBusinessUnitEmployeeReference = oversightBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return oversightWorkSchedule
  **/

  public String getOversightWorkSchedule() {
    return oversightWorkSchedule;
  }

  public void setOversightWorkSchedule(String oversightWorkSchedule) {
    this.oversightWorkSchedule = oversightWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Product Inventory Distribution AdministrativePlan specific Business Service 
   * @return administrativeOversight
  **/

  public String getAdministrativeOversight() {
    return administrativeOversight;
  }

  public void setAdministrativeOversight(String administrativeOversight) {
    this.administrativeOversight = administrativeOversight;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return oversightPostconditions
  **/

  public String getOversightPostconditions() {
    return oversightPostconditions;
  }

  public void setOversightPostconditions(String oversightPostconditions) {
    this.oversightPostconditions = oversightPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return oversightAdministrativeOversightServiceType
  **/

  public String getOversightAdministrativeOversightServiceType() {
    return oversightAdministrativeOversightServiceType;
  }

  public void setOversightAdministrativeOversightServiceType(String oversightAdministrativeOversightServiceType) {
    this.oversightAdministrativeOversightServiceType = oversightAdministrativeOversightServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return oversightAdministrativeOversightServiceDescription
  **/

  public String getOversightAdministrativeOversightServiceDescription() {
    return oversightAdministrativeOversightServiceDescription;
  }

  public void setOversightAdministrativeOversightServiceDescription(String oversightAdministrativeOversightServiceDescription) {
    this.oversightAdministrativeOversightServiceDescription = oversightAdministrativeOversightServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return oversightAdministrativeOversightServiceInputsandOuputs
  **/

  public String getOversightAdministrativeOversightServiceInputsandOuputs() {
    return oversightAdministrativeOversightServiceInputsandOuputs;
  }

  public void setOversightAdministrativeOversightServiceInputsandOuputs(String oversightAdministrativeOversightServiceInputsandOuputs) {
    this.oversightAdministrativeOversightServiceInputsandOuputs = oversightAdministrativeOversightServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return oversightAdministrativeOversightServiceWorkProduct
  **/

  public String getOversightAdministrativeOversightServiceWorkProduct() {
    return oversightAdministrativeOversightServiceWorkProduct;
  }

  public void setOversightAdministrativeOversightServiceWorkProduct(String oversightAdministrativeOversightServiceWorkProduct) {
    this.oversightAdministrativeOversightServiceWorkProduct = oversightAdministrativeOversightServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return oversightAdministrativeOversightServiceName
  **/

  public String getOversightAdministrativeOversightServiceName() {
    return oversightAdministrativeOversightServiceName;
  }

  public void setOversightAdministrativeOversightServiceName(String oversightAdministrativeOversightServiceName) {
    this.oversightAdministrativeOversightServiceName = oversightAdministrativeOversightServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return oversightUpdateActionTaskReference
  **/

  public String getOversightUpdateActionTaskReference() {
    return oversightUpdateActionTaskReference;
  }

  public void setOversightUpdateActionTaskReference(String oversightUpdateActionTaskReference) {
    this.oversightUpdateActionTaskReference = oversightUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return oversightUpdateActionTaskRecord
  **/

  public Object getOversightUpdateActionTaskRecord() {
    return oversightUpdateActionTaskRecord;
  }

  public void setOversightUpdateActionTaskRecord(Object oversightUpdateActionTaskRecord) {
    this.oversightUpdateActionTaskRecord = oversightUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

