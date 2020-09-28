package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProvisioningRetrieveInputModelProvisioningInstanceAnalysis;
import org.bian.dto.BQProvisioningRetrieveInputModelProvisioningInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProvisioningRetrieveInputModel
 */
public class BQProvisioningRetrieveInputModel   {
  private Object provisioningRetrieveActionTaskRecord = null;

  private String provisioningRetrieveActionRequest = null;

  private BQProvisioningRetrieveInputModelProvisioningInstanceReport provisioningInstanceReport = null;

  private BQProvisioningRetrieveInputModelProvisioningInstanceAnalysis provisioningInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return provisioningRetrieveActionRequest
  **/

  public String getProvisioningRetrieveActionRequest() {
    return provisioningRetrieveActionRequest;
  }

  public void setProvisioningRetrieveActionRequest(String provisioningRetrieveActionRequest) {
    this.provisioningRetrieveActionRequest = provisioningRetrieveActionRequest;
  }


  /**
   * Get provisioningInstanceReport
   * @return provisioningInstanceReport
  **/

  public BQProvisioningRetrieveInputModelProvisioningInstanceReport getProvisioningInstanceReport() {
    return provisioningInstanceReport;
  }

  public void setProvisioningInstanceReport(BQProvisioningRetrieveInputModelProvisioningInstanceReport provisioningInstanceReport) {
    this.provisioningInstanceReport = provisioningInstanceReport;
  }


  /**
   * Get provisioningInstanceAnalysis
   * @return provisioningInstanceAnalysis
  **/

  public BQProvisioningRetrieveInputModelProvisioningInstanceAnalysis getProvisioningInstanceAnalysis() {
    return provisioningInstanceAnalysis;
  }

  public void setProvisioningInstanceAnalysis(BQProvisioningRetrieveInputModelProvisioningInstanceAnalysis provisioningInstanceAnalysis) {
    this.provisioningInstanceAnalysis = provisioningInstanceAnalysis;
  }


}

