package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionActivityAnalysis;
import org.bian.dto.SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecord
 */
public class SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecord   {
  private SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionActivityAnalysis productInventoryDistributionActivityAnalysis = null;

  private SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionPerformanceAnalysis productInventoryDistributionPerformanceAnalysis = null;

  private SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get productInventoryDistributionActivityAnalysis
   * @return productInventoryDistributionActivityAnalysis
  **/

  public SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionActivityAnalysis getProductInventoryDistributionActivityAnalysis() {
    return productInventoryDistributionActivityAnalysis;
  }

  public void setProductInventoryDistributionActivityAnalysis(SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionActivityAnalysis productInventoryDistributionActivityAnalysis) {
    this.productInventoryDistributionActivityAnalysis = productInventoryDistributionActivityAnalysis;
  }


  /**
   * Get productInventoryDistributionPerformanceAnalysis
   * @return productInventoryDistributionPerformanceAnalysis
  **/

  public SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionPerformanceAnalysis getProductInventoryDistributionPerformanceAnalysis() {
    return productInventoryDistributionPerformanceAnalysis;
  }

  public void setProductInventoryDistributionPerformanceAnalysis(SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordProductInventoryDistributionPerformanceAnalysis productInventoryDistributionPerformanceAnalysis) {
    this.productInventoryDistributionPerformanceAnalysis = productInventoryDistributionPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDProductInventoryDistributionRetrieveInputModelProductInventoryDistributionRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}
