package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.StopStreamPullRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class StopStreamPullRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<StopStreamPullRequest> {
	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<StopStreamPullRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<StopStreamPullRequest> request = new StopStreamPullRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
}
