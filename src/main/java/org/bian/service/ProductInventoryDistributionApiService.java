/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductInventoryDistributionApiService {

	SDProductInventoryDistributionActivateOutputModel activate(SDProductInventoryDistributionActivateInputModel request);
	
	BQDistributionCaptureOutputModel captureDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionCaptureInputModel request);
	
	BQMailingCaptureOutputModel captureMailing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMailingCaptureInputModel request);
	
	BQOversightCaptureOutputModel captureOversight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOversightCaptureInputModel request);
	
	BQProvisioningCaptureOutputModel captureProvisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProvisioningCaptureInputModel request);
	
	CRProductInventoryDistributionAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanCaptureInputModel request);
	
	SDProductInventoryDistributionConfigureOutputModel configure(String sdReferenceId, SDProductInventoryDistributionConfigureInputModel request);
	
	CRProductInventoryDistributionAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanControlInputModel request);
	
	CRProductInventoryDistributionAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanExchangeInputModel request);
	
	SDProductInventoryDistributionFeedbackOutputModel feedback(String sdReferenceId, SDProductInventoryDistributionFeedbackInputModel request);
	
	CRProductInventoryDistributionAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanGrantInputModel request);
	
	CRProductInventoryDistributionAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRProductInventoryDistributionAdministrativePlanInitiateInputModel request);
	
	BQDistributionInitiateOutputModel initiateDistribution(String sdReferenceId, String crReferenceId, BQDistributionInitiateInputModel request);
	
	BQMailingInitiateOutputModel initiateMailing(String sdReferenceId, String crReferenceId, BQMailingInitiateInputModel request);
	
	BQOversightInitiateOutputModel initiateOversight(String sdReferenceId, String crReferenceId, BQOversightInitiateInputModel request);
	
	BQProvisioningInitiateOutputModel initiateProvisioning(String sdReferenceId, String crReferenceId, BQProvisioningInitiateInputModel request);
	
	CRProductInventoryDistributionAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanRequestInputModel request);
	
	CRProductInventoryDistributionAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQDistributionRetrieveOutputModel retrieveDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMailingRetrieveOutputModel retrieveMailing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOversightRetrieveOutputModel retrieveOversight(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProvisioningRetrieveOutputModel retrieveProvisioning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductInventoryDistributionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductInventoryDistributionAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanUpdateInputModel request);
	
	BQDistributionUpdateOutputModel updateDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionUpdateInputModel request);
	
	BQMailingUpdateOutputModel updateMailing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMailingUpdateInputModel request);
	
	BQOversightUpdateOutputModel updateOversight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOversightUpdateInputModel request);
	
	BQProvisioningUpdateOutputModel updateProvisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProvisioningUpdateInputModel request);
	
}
