package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMailingRetrieveInputModelMailingInstanceAnalysis;
import org.bian.dto.BQMailingRetrieveInputModelMailingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMailingRetrieveInputModel
 */
public class BQMailingRetrieveInputModel   {
  private Object mailingRetrieveActionTaskRecord = null;

  private String mailingRetrieveActionRequest = null;

  private BQMailingRetrieveInputModelMailingInstanceReport mailingInstanceReport = null;

  private BQMailingRetrieveInputModelMailingInstanceAnalysis mailingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return mailingRetrieveActionTaskRecord
  **/

  public Object getMailingRetrieveActionTaskRecord() {
    return mailingRetrieveActionTaskRecord;
  }

  public void setMailingRetrieveActionTaskRecord(Object mailingRetrieveActionTaskRecord) {
    this.mailingRetrieveActionTaskRecord = mailingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return mailingRetrieveActionRequest
  **/

  public String getMailingRetrieveActionRequest() {
    return mailingRetrieveActionRequest;
  }

  public void setMailingRetrieveActionRequest(String mailingRetrieveActionRequest) {
    this.mailingRetrieveActionRequest = mailingRetrieveActionRequest;
  }


  /**
   * Get mailingInstanceReport
   * @return mailingInstanceReport
  **/

  public BQMailingRetrieveInputModelMailingInstanceReport getMailingInstanceReport() {
    return mailingInstanceReport;
  }

  public void setMailingInstanceReport(BQMailingRetrieveInputModelMailingInstanceReport mailingInstanceReport) {
    this.mailingInstanceReport = mailingInstanceReport;
  }


  /**
   * Get mailingInstanceAnalysis
   * @return mailingInstanceAnalysis
  **/

  public BQMailingRetrieveInputModelMailingInstanceAnalysis getMailingInstanceAnalysis() {
    return mailingInstanceAnalysis;
  }

  public void setMailingInstanceAnalysis(BQMailingRetrieveInputModelMailingInstanceAnalysis mailingInstanceAnalysis) {
    this.mailingInstanceAnalysis = mailingInstanceAnalysis;
  }


}

