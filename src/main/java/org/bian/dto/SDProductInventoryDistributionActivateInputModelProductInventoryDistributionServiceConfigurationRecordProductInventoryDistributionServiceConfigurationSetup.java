package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup
 */
public class SDProductInventoryDistributionActivateInputModelProductInventoryDistributionServiceConfigurationRecordProductInventoryDistributionServiceConfigurationSetup   {
  private String productInventoryDistributionServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return productInventoryDistributionServiceConfigurationParameter
  **/

  public String getProductInventoryDistributionServiceConfigurationParameter() {
    return productInventoryDistributionServiceConfigurationParameter;
  }

  public void setProductInventoryDistributionServiceConfigurationParameter(String productInventoryDistributionServiceConfigurationParameter) {
    this.productInventoryDistributionServiceConfigurationParameter = productInventoryDistributionServiceConfigurationParameter;
  }


}

