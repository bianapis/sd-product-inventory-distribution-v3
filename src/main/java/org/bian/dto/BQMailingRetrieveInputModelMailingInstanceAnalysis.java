package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMailingRetrieveInputModelMailingInstanceAnalysis
 */
public class BQMailingRetrieveInputModelMailingInstanceAnalysis   {
  private String mailingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return mailingInstanceAnalysisReference
  **/

  public String getMailingInstanceAnalysisReference() {
    return mailingInstanceAnalysisReference;
  }

  public void setMailingInstanceAnalysisReference(String mailingInstanceAnalysisReference) {
    this.mailingInstanceAnalysisReference = mailingInstanceAnalysisReference;
  }


}

