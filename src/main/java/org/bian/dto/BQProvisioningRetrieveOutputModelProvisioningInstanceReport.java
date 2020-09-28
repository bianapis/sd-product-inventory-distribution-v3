package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProvisioningRetrieveOutputModelProvisioningInstanceReport
 */
public class BQProvisioningRetrieveOutputModelProvisioningInstanceReport   {
  private Object provisioningInstanceReportRecord = null;

  private String provisioningInstanceReportType = null;

  private String provisioningInstanceReportParameters = null;

  private Object provisioningInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return provisioningInstanceReportRecord
  **/

  public Object getProvisioningInstanceReportRecord() {
    return provisioningInstanceReportRecord;
  }

  public void setProvisioningInstanceReportRecord(Object provisioningInstanceReportRecord) {
    this.provisioningInstanceReportRecord = provisioningInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return provisioningInstanceReportType
  **/

  public String getProvisioningInstanceReportType() {
    return provisioningInstanceReportType;
  }

  public void setProvisioningInstanceReportType(String provisioningInstanceReportType) {
    this.provisioningInstanceReportType = provisioningInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return provisioningInstanceReportParameters
  **/

  public String getProvisioningInstanceReportParameters() {
    return provisioningInstanceReportParameters;
  }

  public void setProvisioningInstanceReportParameters(String provisioningInstanceReportParameters) {
    this.provisioningInstanceReportParameters = provisioningInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return provisioningInstanceReport
  **/

  public Object getProvisioningInstanceReport() {
    return provisioningInstanceReport;
  }

  public void setProvisioningInstanceReport(Object provisioningInstanceReport) {
    this.provisioningInstanceReport = provisioningInstanceReport;
  }


}

