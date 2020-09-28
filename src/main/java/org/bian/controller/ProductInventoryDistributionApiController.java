/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class ProductInventoryDistributionApiController {

	@Autowired
	ProductInventoryDistributionApiService service;
	
	@Administer.Activate
	public BianResponse<SDProductInventoryDistributionActivateOutputModel> activate(@RequestBody BianRequest<SDProductInventoryDistributionActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("distribution")
	@Administer.Capture
	public BianResponse<BQDistributionCaptureOutputModel> captureDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureDistribution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("mailing")
	@Administer.Capture
	public BianResponse<BQMailingCaptureOutputModel> captureMailing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMailingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureMailing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("oversight")
	@Administer.Capture
	public BianResponse<BQOversightCaptureOutputModel> captureOversight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOversightCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureOversight(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("provisioning")
	@Administer.Capture
	public BianResponse<BQProvisioningCaptureOutputModel> captureProvisioning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProvisioningCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureProvisioning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Capture
	public BianResponse<CRProductInventoryDistributionAdministrativePlanCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductInventoryDistributionAdministrativePlanCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDProductInventoryDistributionConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductInventoryDistributionConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Control
	public BianResponse<CRProductInventoryDistributionAdministrativePlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductInventoryDistributionAdministrativePlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Exchange
	public BianResponse<CRProductInventoryDistributionAdministrativePlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductInventoryDistributionAdministrativePlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDProductInventoryDistributionFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductInventoryDistributionFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Grant
	public BianResponse<CRProductInventoryDistributionAdministrativePlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductInventoryDistributionAdministrativePlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Initiate
	public BianResponse<CRProductInventoryDistributionAdministrativePlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProductInventoryDistributionAdministrativePlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("distribution")
	@Administer.Initiate
	public BianResponse<BQDistributionInitiateOutputModel> initiateDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDistributionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDistribution(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("mailing")
	@Administer.Initiate
	public BianResponse<BQMailingInitiateOutputModel> initiateMailing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQMailingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateMailing(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("oversight")
	@Administer.Initiate
	public BianResponse<BQOversightInitiateOutputModel> initiateOversight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOversightInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateOversight(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("provisioning")
	@Administer.Initiate
	public BianResponse<BQProvisioningInitiateOutputModel> initiateProvisioning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProvisioningInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProvisioning(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Request
	public BianResponse<CRProductInventoryDistributionAdministrativePlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductInventoryDistributionAdministrativePlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Retrieve
	public BianResponse<CRProductInventoryDistributionAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("distribution")
	@Administer.Retrieve
	public BianResponse<BQDistributionRetrieveOutputModel> retrieveDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDistribution(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("mailing")
	@Administer.Retrieve
	public BianResponse<BQMailingRetrieveOutputModel> retrieveMailing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMailing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("oversight")
	@Administer.Retrieve
	public BianResponse<BQOversightRetrieveOutputModel> retrieveOversight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOversight(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("provisioning")
	@Administer.Retrieve
	public BianResponse<BQProvisioningRetrieveOutputModel> retrieveProvisioning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProvisioning(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDProductInventoryDistributionRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRProductInventoryDistributionAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductInventoryDistributionAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("distribution")
	@Administer.Update
	public BianResponse<BQDistributionUpdateOutputModel> updateDistribution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDistributionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDistribution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("mailing")
	@Administer.Update
	public BianResponse<BQMailingUpdateOutputModel> updateMailing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMailingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMailing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("oversight")
	@Administer.Update
	public BianResponse<BQOversightUpdateOutputModel> updateOversight(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOversightUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOversight(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("provisioning")
	@Administer.Update
	public BianResponse<BQProvisioningUpdateOutputModel> updateProvisioning(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProvisioningUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProvisioning(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
