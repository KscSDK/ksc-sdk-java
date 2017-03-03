package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.GetPresetDetailRequestMarshaller;

public class GetPresetDetailRequest  extends KscWebServiceRequest
implements DryRunSupportedRequest<GetPresetDetailRequest>{
	
	private String Preset;
	public String getPreset() {
		return Preset;
	}

	public void setPreset(String preset) {
		this.Preset = preset;
	}

	public Request<GetPresetDetailRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetPresetDetailRequest> request = new GetPresetDetailRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	
}
