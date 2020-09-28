package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecordProductInventoryDistributionServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecord
 */
public class SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecord   {
  private String productInventoryDistributionServiceType = null;

  private String productInventoryDistributionServiceVersion = null;

  private String productInventoryDistributionServiceDescription = null;

  private SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecordProductInventoryDistributionServicePoliciesandGuidelines productInventoryDistributionServicePoliciesandGuidelines = null;

  private String productInventoryDistributionServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return productInventoryDistributionServiceType
  **/

  public String getProductInventoryDistributionServiceType() {
    return productInventoryDistributionServiceType;
  }

  public void setProductInventoryDistributionServiceType(String productInventoryDistributionServiceType) {
    this.productInventoryDistributionServiceType = productInventoryDistributionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return productInventoryDistributionServiceVersion
  **/

  public String getProductInventoryDistributionServiceVersion() {
    return productInventoryDistributionServiceVersion;
  }

  public void setProductInventoryDistributionServiceVersion(String productInventoryDistributionServiceVersion) {
    this.productInventoryDistributionServiceVersion = productInventoryDistributionServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return productInventoryDistributionServiceDescription
  **/

  public String getProductInventoryDistributionServiceDescription() {
    return productInventoryDistributionServiceDescription;
  }

  public void setProductInventoryDistributionServiceDescription(String productInventoryDistributionServiceDescription) {
    this.productInventoryDistributionServiceDescription = productInventoryDistributionServiceDescription;
  }


  /**
   * Get productInventoryDistributionServicePoliciesandGuidelines
   * @return productInventoryDistributionServicePoliciesandGuidelines
  **/

  public SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecordProductInventoryDistributionServicePoliciesandGuidelines getProductInventoryDistributionServicePoliciesandGuidelines() {
    return productInventoryDistributionServicePoliciesandGuidelines;
  }

  public void setProductInventoryDistributionServicePoliciesandGuidelines(SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionOfferedServiceProductInventoryDistributionServiceRecordProductInventoryDistributionServicePoliciesandGuidelines productInventoryDistributionServicePoliciesandGuidelines) {
    this.productInventoryDistributionServicePoliciesandGuidelines = productInventoryDistributionServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return productInventoryDistributionServiceSchedule
  **/

  public String getProductInventoryDistributionServiceSchedule() {
    return productInventoryDistributionServiceSchedule;
  }

  public void setProductInventoryDistributionServiceSchedule(String productInventoryDistributionServiceSchedule) {
    this.productInventoryDistributionServiceSchedule = productInventoryDistributionServiceSchedule;
  }


}

