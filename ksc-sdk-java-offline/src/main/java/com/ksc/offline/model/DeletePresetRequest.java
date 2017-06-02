package com.ksc.offline.model;


import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.DeletePresetRequestMarshaller;

public class DeletePresetRequest  extends KscWebServiceRequest
implements DryRunSupportedRequest<DeletePresetRequest>{
	private String preset;

	public String getPreset() {
		return preset;
	}

	public void setPreset(String preset) {
		this.preset = preset;
	}

	public Request<DeletePresetRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<DeletePresetRequest> request = new DeletePresetRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	
}
