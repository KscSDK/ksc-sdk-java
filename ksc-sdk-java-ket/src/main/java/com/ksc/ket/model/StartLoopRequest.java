package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.StartLoopRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class StartLoopRequest extends KscWebServiceRequest implements DryRunSupportedRequest<StartLoopRequest> {

	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<StartLoopRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<StartLoopRequest> request = new StartLoopRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
}
