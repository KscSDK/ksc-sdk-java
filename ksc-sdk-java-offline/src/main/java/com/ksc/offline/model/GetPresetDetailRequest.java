package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.GetPresetDetailRequestMarshaller;

public class GetPresetDetailRequest  extends KscWebServiceRequest
implements DryRunSupportedRequest<GetPresetDetailRequest>{
	
	private String preset;
	public String getPreset() {
		return preset;
	}

	public void setPreset(String preset) {
		this.preset = preset;
	}

	public Request<GetPresetDetailRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetPresetDetailRequest> request = new GetPresetDetailRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	
}
