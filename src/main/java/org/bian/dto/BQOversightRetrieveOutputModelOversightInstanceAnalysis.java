package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOversightRetrieveOutputModelOversightInstanceAnalysis
 */
public class BQOversightRetrieveOutputModelOversightInstanceAnalysis   {
  private Object oversightInstanceAnalysisRecord = null;

  private String oversightInstanceAnalysisReportType = null;

  private String oversightInstanceAnalysisParameters = null;

  private Object oversightInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return oversightInstanceAnalysisRecord
  **/

  public Object getOversightInstanceAnalysisRecord() {
    return oversightInstanceAnalysisRecord;
  }

  public void setOversightInstanceAnalysisRecord(Object oversightInstanceAnalysisRecord) {
    this.oversightInstanceAnalysisRecord = oversightInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return oversightInstanceAnalysisReportType
  **/

  public String getOversightInstanceAnalysisReportType() {
    return oversightInstanceAnalysisReportType;
  }

  public void setOversightInstanceAnalysisReportType(String oversightInstanceAnalysisReportType) {
    this.oversightInstanceAnalysisReportType = oversightInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return oversightInstanceAnalysisParameters
  **/

  public String getOversightInstanceAnalysisParameters() {
    return oversightInstanceAnalysisParameters;
  }

  public void setOversightInstanceAnalysisParameters(String oversightInstanceAnalysisParameters) {
    this.oversightInstanceAnalysisParameters = oversightInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return oversightInstanceAnalysisReport
  **/

  public Object getOversightInstanceAnalysisReport() {
    return oversightInstanceAnalysisReport;
  }

  public void setOversightInstanceAnalysisReport(Object oversightInstanceAnalysisReport) {
    this.oversightInstanceAnalysisReport = oversightInstanceAnalysisReport;
  }


}

