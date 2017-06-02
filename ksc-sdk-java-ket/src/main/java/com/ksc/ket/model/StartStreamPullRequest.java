package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.StartStreamPullRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class StartStreamPullRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<StartStreamPullRequest> {

	private String data = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<StartStreamPullRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<StartStreamPullRequest> request = new StartStreamPullRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}