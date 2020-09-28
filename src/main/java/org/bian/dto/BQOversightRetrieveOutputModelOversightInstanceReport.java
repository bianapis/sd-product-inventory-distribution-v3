package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOversightRetrieveOutputModelOversightInstanceReport
 */
public class BQOversightRetrieveOutputModelOversightInstanceReport   {
  private Object oversightInstanceReportRecord = null;

  private String oversightInstanceReportType = null;

  private String oversightInstanceReportParameters = null;

  private Object oversightInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return oversightInstanceReportRecord
  **/

  public Object getOversightInstanceReportRecord() {
    return oversightInstanceReportRecord;
  }

  public void setOversightInstanceReportRecord(Object oversightInstanceReportRecord) {
    this.oversightInstanceReportRecord = oversightInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return oversightInstanceReportType
  **/

  public String getOversightInstanceReportType() {
    return oversightInstanceReportType;
  }

  public void setOversightInstanceReportType(String oversightInstanceReportType) {
    this.oversightInstanceReportType = oversightInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return oversightInstanceReportParameters
  **/

  public String getOversightInstanceReportParameters() {
    return oversightInstanceReportParameters;
  }

  public void setOversightInstanceReportParameters(String oversightInstanceReportParameters) {
    this.oversightInstanceReportParameters = oversightInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return oversightInstanceReport
  **/

  public Object getOversightInstanceReport() {
    return oversightInstanceReport;
  }

  public void setOversightInstanceReport(Object oversightInstanceReport) {
    this.oversightInstanceReport = oversightInstanceReport;
  }


}

