package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOversightRetrieveInputModelOversightInstanceAnalysis;
import org.bian.dto.BQOversightRetrieveInputModelOversightInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOversightRetrieveInputModel
 */
public class BQOversightRetrieveInputModel   {
  private Object oversightRetrieveActionTaskRecord = null;

  private String oversightRetrieveActionRequest = null;

  private BQOversightRetrieveInputModelOversightInstanceReport oversightInstanceReport = null;

  private BQOversightRetrieveInputModelOversightInstanceAnalysis oversightInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return oversightRetrieveActionTaskRecord
  **/

  public Object getOversightRetrieveActionTaskRecord() {
    return oversightRetrieveActionTaskRecord;
  }

  public void setOversightRetrieveActionTaskRecord(Object oversightRetrieveActionTaskRecord) {
    this.oversightRetrieveActionTaskRecord = oversightRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return oversightRetrieveActionRequest
  **/

  public String getOversightRetrieveActionRequest() {
    return oversightRetrieveActionRequest;
  }

  public void setOversightRetrieveActionRequest(String oversightRetrieveActionRequest) {
    this.oversightRetrieveActionRequest = oversightRetrieveActionRequest;
  }


  /**
   * Get oversightInstanceReport
   * @return oversightInstanceReport
  **/

  public BQOversightRetrieveInputModelOversightInstanceReport getOversightInstanceReport() {
    return oversightInstanceReport;
  }

  public void setOversightInstanceReport(BQOversightRetrieveInputModelOversightInstanceReport oversightInstanceReport) {
    this.oversightInstanceReport = oversightInstanceReport;
  }


  /**
   * Get oversightInstanceAnalysis
   * @return oversightInstanceAnalysis
  **/

  public BQOversightRetrieveInputModelOversightInstanceAnalysis getOversightInstanceAnalysis() {
    return oversightInstanceAnalysis;
  }

  public void setOversightInstanceAnalysis(BQOversightRetrieveInputModelOversightInstanceAnalysis oversightInstanceAnalysis) {
    this.oversightInstanceAnalysis = oversightInstanceAnalysis;
  }


}

