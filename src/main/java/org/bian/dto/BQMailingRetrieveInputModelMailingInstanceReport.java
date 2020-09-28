package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMailingRetrieveInputModelMailingInstanceReport
 */
public class BQMailingRetrieveInputModelMailingInstanceReport   {
  private String mailingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return mailingInstanceReportReference
  **/

  public String getMailingInstanceReportReference() {
    return mailingInstanceReportReference;
  }

  public void setMailingInstanceReportReference(String mailingInstanceReportReference) {
    this.mailingInstanceReportReference = mailingInstanceReportReference;
  }


}

