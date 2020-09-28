package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMailingRetrieveOutputModelMailingInstanceAnalysis
 */
public class BQMailingRetrieveOutputModelMailingInstanceAnalysis   {
  private Object mailingInstanceAnalysisRecord = null;

  private String mailingInstanceAnalysisReportType = null;

  private String mailingInstanceAnalysisParameters = null;

  private Object mailingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return mailingInstanceAnalysisRecord
  **/

  public Object getMailingInstanceAnalysisRecord() {
    return mailingInstanceAnalysisRecord;
  }

  public void setMailingInstanceAnalysisRecord(Object mailingInstanceAnalysisRecord) {
    this.mailingInstanceAnalysisRecord = mailingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return mailingInstanceAnalysisReportType
  **/

  public String getMailingInstanceAnalysisReportType() {
    return mailingInstanceAnalysisReportType;
  }

  public void setMailingInstanceAnalysisReportType(String mailingInstanceAnalysisReportType) {
    this.mailingInstanceAnalysisReportType = mailingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return mailingInstanceAnalysisParameters
  **/

  public String getMailingInstanceAnalysisParameters() {
    return mailingInstanceAnalysisParameters;
  }

  public void setMailingInstanceAnalysisParameters(String mailingInstanceAnalysisParameters) {
    this.mailingInstanceAnalysisParameters = mailingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return mailingInstanceAnalysisReport
  **/

  public Object getMailingInstanceAnalysisReport() {
    return mailingInstanceAnalysisReport;
  }

  public void setMailingInstanceAnalysisReport(Object mailingInstanceAnalysisReport) {
    this.mailingInstanceAnalysisReport = mailingInstanceAnalysisReport;
  }


}

