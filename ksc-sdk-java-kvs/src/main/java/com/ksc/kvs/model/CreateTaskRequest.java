package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.CreateTaskRequestMarshaller;
import com.ksc.kvs.model.transform.DeletePresetRequestMarshaller;

public class CreateTaskRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<CreateTaskRequest>{
	
	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<CreateTaskRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<CreateTaskRequest> request = new CreateTaskRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	

}
