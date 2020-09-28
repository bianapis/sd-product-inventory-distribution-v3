/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductInventoryDistributionApiServiceImpl implements ProductInventoryDistributionApiService {

	public SDProductInventoryDistributionActivateOutputModel activate(SDProductInventoryDistributionActivateInputModel request){
		return JsonReader.read("activate-SDProductInventoryDistributionActivateOutputModel.json",new TypeReference<SDProductInventoryDistributionActivateOutputModel>(){});
	}
	
	public BQDistributionCaptureOutputModel captureDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionCaptureInputModel request){
		return JsonReader.read("capture-BQDistributionCaptureOutputModel.json",new TypeReference<BQDistributionCaptureOutputModel>(){});
	}
	
	public BQMailingCaptureOutputModel captureMailing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMailingCaptureInputModel request){
		return JsonReader.read("capture-BQMailingCaptureOutputModel.json",new TypeReference<BQMailingCaptureOutputModel>(){});
	}
	
	public BQOversightCaptureOutputModel captureOversight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOversightCaptureInputModel request){
		return JsonReader.read("capture-BQOversightCaptureOutputModel.json",new TypeReference<BQOversightCaptureOutputModel>(){});
	}
	
	public BQProvisioningCaptureOutputModel captureProvisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProvisioningCaptureInputModel request){
		return JsonReader.read("capture-BQProvisioningCaptureOutputModel.json",new TypeReference<BQProvisioningCaptureOutputModel>(){});
	}
	
	public CRProductInventoryDistributionAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanCaptureInputModel request){
		return JsonReader.read("capture-CRProductInventoryDistributionAdministrativePlanCaptureOutputModel.json",new TypeReference<CRProductInventoryDistributionAdministrativePlanCaptureOutputModel>(){});
	}
	
	public SDProductInventoryDistributionConfigureOutputModel configure(String sdReferenceId, SDProductInventoryDistributionConfigureInputModel request){
		return JsonReader.read("configure-SDProductInventoryDistributionConfigureOutputModel.json",new TypeReference<SDProductInventoryDistributionConfigureOutputModel>(){});
	}
	
	public CRProductInventoryDistributionAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanControlInputModel request){
		return JsonReader.read("control-CRProductInventoryDistributionAdministrativePlanControlOutputModel.json",new TypeReference<CRProductInventoryDistributionAdministrativePlanControlOutputModel>(){});
	}
	
	public CRProductInventoryDistributionAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanExchangeInputModel request){
		return JsonReader.read("exchange-CRProductInventoryDistributionAdministrativePlanExchangeOutputModel.json",new TypeReference<CRProductInventoryDistributionAdministrativePlanExchangeOutputModel>(){});
	}
	
	public SDProductInventoryDistributionFeedbackOutputModel feedback(String sdReferenceId, SDProductInventoryDistributionFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductInventoryDistributionFeedbackOutputModel.json",new TypeReference<SDProductInventoryDistributionFeedbackOutputModel>(){});
	}
	
	public CRProductInventoryDistributionAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanGrantInputModel request){
		return JsonReader.read("grant-CRProductInventoryDistributionAdministrativePlanGrantOutputModel.json",new TypeReference<CRProductInventoryDistributionAdministrativePlanGrantOutputModel>(){});
	}
	
	public CRProductInventoryDistributionAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRProductInventoryDistributionAdministrativePlanInitiateInputModel request){
		return JsonReader.read("initiate-CRProductInventoryDistributionAdministrativePlanInitiateOutputModel.json",new TypeReference<CRProductInventoryDistributionAdministrativePlanInitiateOutputModel>(){});
	}
	
	public BQDistributionInitiateOutputModel initiateDistribution(String sdReferenceId, String crReferenceId, BQDistributionInitiateInputModel request){
		return JsonReader.read("initiate-BQDistributionInitiateOutputModel.json",new TypeReference<BQDistributionInitiateOutputModel>(){});
	}
	
	public BQMailingInitiateOutputModel initiateMailing(String sdReferenceId, String crReferenceId, BQMailingInitiateInputModel request){
		return JsonReader.read("initiate-BQMailingInitiateOutputModel.json",new TypeReference<BQMailingInitiateOutputModel>(){});
	}
	
	public BQOversightInitiateOutputModel initiateOversight(String sdReferenceId, String crReferenceId, BQOversightInitiateInputModel request){
		return JsonReader.read("initiate-BQOversightInitiateOutputModel.json",new TypeReference<BQOversightInitiateOutputModel>(){});
	}
	
	public BQProvisioningInitiateOutputModel initiateProvisioning(String sdReferenceId, String crReferenceId, BQProvisioningInitiateInputModel request){
		return JsonReader.read("initiate-BQProvisioningInitiateOutputModel.json",new TypeReference<BQProvisioningInitiateOutputModel>(){});
	}
	
	public CRProductInventoryDistributionAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRProductInventoryDistributionAdministrativePlanRequestOutputModel.json",new TypeReference<CRProductInventoryDistributionAdministrativePlanRequestOutputModel>(){});
	}
	
	public CRProductInventoryDistributionAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductInventoryDistributionAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRProductInventoryDistributionAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public BQDistributionRetrieveOutputModel retrieveDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDistributionRetrieveOutputModel.json",new TypeReference<BQDistributionRetrieveOutputModel>(){});
	}
	
	public BQMailingRetrieveOutputModel retrieveMailing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMailingRetrieveOutputModel.json",new TypeReference<BQMailingRetrieveOutputModel>(){});
	}
	
	public BQOversightRetrieveOutputModel retrieveOversight(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOversightRetrieveOutputModel.json",new TypeReference<BQOversightRetrieveOutputModel>(){});
	}
	
	public BQProvisioningRetrieveOutputModel retrieveProvisioning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProvisioningRetrieveOutputModel.json",new TypeReference<BQProvisioningRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductInventoryDistributionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductInventoryDistributionRetrieveOutputModel.json",new TypeReference<SDProductInventoryDistributionRetrieveOutputModel>(){});
	}
	
	public CRProductInventoryDistributionAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductInventoryDistributionAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRProductInventoryDistributionAdministrativePlanUpdateOutputModel.json",new TypeReference<CRProductInventoryDistributionAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQDistributionUpdateOutputModel updateDistribution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDistributionUpdateInputModel request){
		return JsonReader.read("update-BQDistributionUpdateOutputModel.json",new TypeReference<BQDistributionUpdateOutputModel>(){});
	}
	
	public BQMailingUpdateOutputModel updateMailing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMailingUpdateInputModel request){
		return JsonReader.read("update-BQMailingUpdateOutputModel.json",new TypeReference<BQMailingUpdateOutputModel>(){});
	}
	
	public BQOversightUpdateOutputModel updateOversight(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOversightUpdateInputModel request){
		return JsonReader.read("update-BQOversightUpdateOutputModel.json",new TypeReference<BQOversightUpdateOutputModel>(){});
	}
	
	public BQProvisioningUpdateOutputModel updateProvisioning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProvisioningUpdateInputModel request){
		return JsonReader.read("update-BQProvisioningUpdateOutputModel.json",new TypeReference<BQProvisioningUpdateOutputModel>(){});
	}
	
}
