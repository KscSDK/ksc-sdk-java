package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.CreateFlowTaskRequestMarshaller;

public class CreateFlowTaskRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<CreateFlowTaskRequest>{
	
	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<CreateFlowTaskRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<CreateFlowTaskRequest> request = new CreateFlowTaskRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	

}
