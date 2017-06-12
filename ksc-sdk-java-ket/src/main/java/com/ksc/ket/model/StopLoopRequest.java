package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.StopLoopRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class StopLoopRequest extends KscWebServiceRequest implements DryRunSupportedRequest<StopLoopRequest> {
	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<StopLoopRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<StopLoopRequest> request = new StopLoopRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
}
