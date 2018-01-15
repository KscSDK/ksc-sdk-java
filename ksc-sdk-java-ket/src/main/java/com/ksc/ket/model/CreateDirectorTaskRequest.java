package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.CreateDirectorTaskRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class CreateDirectorTaskRequest extends KscWebServiceRequest implements DryRunSupportedRequest<CreateDirectorTaskRequest> {

	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<CreateDirectorTaskRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<CreateDirectorTaskRequest> request = new CreateDirectorTaskRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
}
