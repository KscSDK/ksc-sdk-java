package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.UpdateLoopRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class UpdateLoopRequest extends KscWebServiceRequest implements DryRunSupportedRequest<UpdateLoopRequest> {
	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<UpdateLoopRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<UpdateLoopRequest> request = new UpdateLoopRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
}
