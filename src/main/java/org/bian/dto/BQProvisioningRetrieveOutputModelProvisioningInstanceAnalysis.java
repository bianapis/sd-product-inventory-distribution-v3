package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProvisioningRetrieveOutputModelProvisioningInstanceAnalysis
 */
public class BQProvisioningRetrieveOutputModelProvisioningInstanceAnalysis   {
  private Object provisioningInstanceAnalysisRecord = null;

  private String provisioningInstanceAnalysisReportType = null;

  private String provisioningInstanceAnalysisParameters = null;

  private Object provisioningInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return provisioningInstanceAnalysisRecord
  **/

  public Object getProvisioningInstanceAnalysisRecord() {
    return provisioningInstanceAnalysisRecord;
  }

  public void setProvisioningInstanceAnalysisRecord(Object provisioningInstanceAnalysisRecord) {
    this.provisioningInstanceAnalysisRecord = provisioningInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return provisioningInstanceAnalysisReportType
  **/

  public String getProvisioningInstanceAnalysisReportType() {
    return provisioningInstanceAnalysisReportType;
  }

  public void setProvisioningInstanceAnalysisReportType(String provisioningInstanceAnalysisReportType) {
    this.provisioningInstanceAnalysisReportType = provisioningInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return provisioningInstanceAnalysisParameters
  **/

  public String getProvisioningInstanceAnalysisParameters() {
    return provisioningInstanceAnalysisParameters;
  }

  public void setProvisioningInstanceAnalysisParameters(String provisioningInstanceAnalysisParameters) {
    this.provisioningInstanceAnalysisParameters = provisioningInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return provisioningInstanceAnalysisReport
  **/

  public Object getProvisioningInstanceAnalysisReport() {
    return provisioningInstanceAnalysisReport;
  }

  public void setProvisioningInstanceAnalysisReport(Object provisioningInstanceAnalysisReport) {
    this.provisioningInstanceAnalysisReport = provisioningInstanceAnalysisReport;
  }


}

