package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOversightRetrieveInputModelOversightInstanceReport
 */
public class BQOversightRetrieveInputModelOversightInstanceReport   {
  private String oversightInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return oversightInstanceReportReference
  **/

  public String getOversightInstanceReportReference() {
    return oversightInstanceReportReference;
  }

  public void setOversightInstanceReportReference(String oversightInstanceReportReference) {
    this.oversightInstanceReportReference = oversightInstanceReportReference;
  }


}

