package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kvs.model.transform.UpdatePipelineRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class UpdatePipelineRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<UpdatePipelineRequest> {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<UpdatePipelineRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<UpdatePipelineRequest> request = new UpdatePipelineRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
