package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.UpdatePresetRequestMarshaller;

public class UpdatePersetRequest  extends KscWebServiceRequest
implements DryRunSupportedRequest<UpdatePersetRequest>{
	
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<UpdatePersetRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<UpdatePersetRequest> request = new UpdatePresetRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	
	
}
