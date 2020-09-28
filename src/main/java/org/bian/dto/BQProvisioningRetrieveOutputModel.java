package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProvisioningRetrieveOutputModelProvisioningInstanceAnalysis;
import org.bian.dto.BQProvisioningRetrieveOutputModelProvisioningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProvisioningRetrieveOutputModel
 */
public class BQProvisioningRetrieveOutputModel   {
  private String provisioningPreconditions = null;

  private String provisioningBusinessUnitEmployeeReference = null;

  private String provisioningWorkSchedule = null;

  private String businessService = null;

  private String provisioningPostconditions = null;

  private String provisioningServiceType = null;

  private String provisioningServiceDescription = null;

  private String provisioningServiceInputsandOuputs = null;

  private String provisioningServiceWorkProduct = null;

  private String provisioningServiceName = null;

  private String provisioningRetrieveActionTaskReference = null;

  private Object provisioningRetrieveActionTaskRecord = null;

  private String provisioningRetrieveActionResponse = null;

  private BQProvisioningRetrieveOutputModelProvisioningInstanceReport provisioningInstanceReport = null;

  private BQProvisioningRetrieveOutputModelProvisioningInstanceAnalysis provisioningInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return provisioningPreconditions
  **/

  public String getProvisioningPreconditions() {
    return provisioningPreconditions;
  }

  public void setProvisioningPreconditions(String provisioningPreconditions) {
    this.provisioningPreconditions = provisioningPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return provisioningBusinessUnitEmployeeReference
  **/

  public String getProvisioningBusinessUnitEmployeeReference() {
    return provisioningBusinessUnitEmployeeReference;
  }

  public void setProvisioningBusinessUnitEmployeeReference(String provisioningBusinessUnitEmployeeReference) {
    this.provisioningBusinessUnitEmployeeReference = provisioningBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return provisioningWorkSchedule
  **/

  public String getProvisioningWorkSchedule() {
    return provisioningWorkSchedule;
  }

  public void setProvisioningWorkSchedule(String provisioningWorkSchedule) {
    this.provisioningWorkSchedule = provisioningWorkSchedule;
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
   * @return provisioningPostconditions
  **/

  public String getProvisioningPostconditions() {
    return provisioningPostconditions;
  }

  public void setProvisioningPostconditions(String provisioningPostconditions) {
    this.provisioningPostconditions = provisioningPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return provisioningServiceType
  **/

  public String getProvisioningServiceType() {
    return provisioningServiceType;
  }

  public void setProvisioningServiceType(String provisioningServiceType) {
    this.provisioningServiceType = provisioningServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return provisioningServiceDescription
  **/

  public String getProvisioningServiceDescription() {
    return provisioningServiceDescription;
  }

  public void setProvisioningServiceDescription(String provisioningServiceDescription) {
    this.provisioningServiceDescription = provisioningServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return provisioningServiceInputsandOuputs
  **/

  public String getProvisioningServiceInputsandOuputs() {
    return provisioningServiceInputsandOuputs;
  }

  public void setProvisioningServiceInputsandOuputs(String provisioningServiceInputsandOuputs) {
    this.provisioningServiceInputsandOuputs = provisioningServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return provisioningServiceWorkProduct
  **/

  public String getProvisioningServiceWorkProduct() {
    return provisioningServiceWorkProduct;
  }

  public void setProvisioningServiceWorkProduct(String provisioningServiceWorkProduct) {
    this.provisioningServiceWorkProduct = provisioningServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return provisioningServiceName
  **/

  public String getProvisioningServiceName() {
    return provisioningServiceName;
  }

  public void setProvisioningServiceName(String provisioningServiceName) {
    this.provisioningServiceName = provisioningServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Provisioning instance retrieve service call 
   * @return provisioningRetrieveActionTaskReference
  **/

  public String getProvisioningRetrieveActionTaskReference() {
    return provisioningRetrieveActionTaskReference;
  }

  public void setProvisioningRetrieveActionTaskReference(String provisioningRetrieveActionTaskReference) {
    this.provisioningRetrieveActionTaskReference = provisioningRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return provisioningRetrieveActionTaskRecord
  **/

  public Object getProvisioningRetrieveActionTaskRecord() {
    return provisioningRetrieveActionTaskRecord;
  }

  public void setProvisioningRetrieveActionTaskRecord(Object provisioningRetrieveActionTaskRecord) {
    this.provisioningRetrieveActionTaskRecord = provisioningRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return provisioningRetrieveActionResponse
  **/

  public String getProvisioningRetrieveActionResponse() {
    return provisioningRetrieveActionResponse;
  }

  public void setProvisioningRetrieveActionResponse(String provisioningRetrieveActionResponse) {
    this.provisioningRetrieveActionResponse = provisioningRetrieveActionResponse;
  }


  /**
   * Get provisioningInstanceReport
   * @return provisioningInstanceReport
  **/

  public BQProvisioningRetrieveOutputModelProvisioningInstanceReport getProvisioningInstanceReport() {
    return provisioningInstanceReport;
  }

  public void setProvisioningInstanceReport(BQProvisioningRetrieveOutputModelProvisioningInstanceReport provisioningInstanceReport) {
    this.provisioningInstanceReport = provisioningInstanceReport;
  }


  /**
   * Get provisioningInstanceAnalysis
   * @return provisioningInstanceAnalysis
  **/

  public BQProvisioningRetrieveOutputModelProvisioningInstanceAnalysis getProvisioningInstanceAnalysis() {
    return provisioningInstanceAnalysis;
  }

  public void setProvisioningInstanceAnalysis(BQProvisioningRetrieveOutputModelProvisioningInstanceAnalysis provisioningInstanceAnalysis) {
    this.provisioningInstanceAnalysis = provisioningInstanceAnalysis;
  }


}

