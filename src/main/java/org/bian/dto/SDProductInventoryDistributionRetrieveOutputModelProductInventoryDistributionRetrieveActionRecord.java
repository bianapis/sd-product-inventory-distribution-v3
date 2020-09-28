package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionActivityAnalysis;
import org.bian.dto.SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecord
 */
public class SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecord   {
  private SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionActivityAnalysis productInventoryDistributionActivityAnalysis = null;

  private SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionPerformanceAnalysis productInventoryDistributionPerformanceAnalysis = null;

  private SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get productInventoryDistributionActivityAnalysis
   * @return productInventoryDistributionActivityAnalysis
  **/

  public SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionActivityAnalysis getProductInventoryDistributionActivityAnalysis() {
    return productInventoryDistributionActivityAnalysis;
  }

  public void setProductInventoryDistributionActivityAnalysis(SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionActivityAnalysis productInventoryDistributionActivityAnalysis) {
    this.productInventoryDistributionActivityAnalysis = productInventoryDistributionActivityAnalysis;
  }


  /**
   * Get productInventoryDistributionPerformanceAnalysis
   * @return productInventoryDistributionPerformanceAnalysis
  **/

  public SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionPerformanceAnalysis getProductInventoryDistributionPerformanceAnalysis() {
    return productInventoryDistributionPerformanceAnalysis;
  }

  public void setProductInventoryDistributionPerformanceAnalysis(SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionPerformanceAnalysis productInventoryDistributionPerformanceAnalysis) {
    this.productInventoryDistributionPerformanceAnalysis = productInventoryDistributionPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDProductInventoryDistributionRetrieveOutputModelProductInventoryDistributionRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}
