package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMailingRetrieveOutputModelMailingInstanceReport
 */
public class BQMailingRetrieveOutputModelMailingInstanceReport   {
  private Object mailingInstanceReportRecord = null;

  private String mailingInstanceReportType = null;

  private String mailingInstanceReportParameters = null;

  private Object mailingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return mailingInstanceReportRecord
  **/

  public Object getMailingInstanceReportRecord() {
    return mailingInstanceReportRecord;
  }

  public void setMailingInstanceReportRecord(Object mailingInstanceReportRecord) {
    this.mailingInstanceReportRecord = mailingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return mailingInstanceReportType
  **/

  public String getMailingInstanceReportType() {
    return mailingInstanceReportType;
  }

  public void setMailingInstanceReportType(String mailingInstanceReportType) {
    this.mailingInstanceReportType = mailingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return mailingInstanceReportParameters
  **/

  public String getMailingInstanceReportParameters() {
    return mailingInstanceReportParameters;
  }

  public void setMailingInstanceReportParameters(String mailingInstanceReportParameters) {
    this.mailingInstanceReportParameters = mailingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return mailingInstanceReport
  **/

  public Object getMailingInstanceReport() {
    return mailingInstanceReport;
  }

  public void setMailingInstanceReport(Object mailingInstanceReport) {
    this.mailingInstanceReport = mailingInstanceReport;
  }


}

