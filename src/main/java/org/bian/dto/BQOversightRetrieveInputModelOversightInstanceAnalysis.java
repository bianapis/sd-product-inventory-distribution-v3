package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOversightRetrieveInputModelOversightInstanceAnalysis
 */
public class BQOversightRetrieveInputModelOversightInstanceAnalysis   {
  private String oversightInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return oversightInstanceAnalysisReference
  **/

  public String getOversightInstanceAnalysisReference() {
    return oversightInstanceAnalysisReference;
  }

  public void setOversightInstanceAnalysisReference(String oversightInstanceAnalysisReference) {
    this.oversightInstanceAnalysisReference = oversightInstanceAnalysisReference;
  }


}

