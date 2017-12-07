package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.CreateDirectorTaskRequestMarshaller;
import com.ksc.ket.model.transform.UpdateDirectorTaskRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class UpdateDirectorTaskRequest extends KscWebServiceRequest implements DryRunSupportedRequest<UpdateDirectorTaskRequest> {

	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<UpdateDirectorTaskRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<UpdateDirectorTaskRequest> request = new UpdateDirectorTaskRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
}

