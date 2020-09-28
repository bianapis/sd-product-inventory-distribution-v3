package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProvisioningRetrieveInputModelProvisioningInstanceReport
 */
public class BQProvisioningRetrieveInputModelProvisioningInstanceReport   {
  private String provisioningInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return provisioningInstanceReportReference
  **/

  public String getProvisioningInstanceReportReference() {
    return provisioningInstanceReportReference;
  }

  public void setProvisioningInstanceReportReference(String provisioningInstanceReportReference) {
    this.provisioningInstanceReportReference = provisioningInstanceReportReference;
  }


}

