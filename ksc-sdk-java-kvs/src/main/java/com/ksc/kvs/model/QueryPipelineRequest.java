package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kvs.model.transform.QueryPipelineRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class QueryPipelineRequest extends KscWebServiceRequest implements DryRunSupportedRequest<QueryPipelineRequest> {

	private String PipelineName;

	public Request<QueryPipelineRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<QueryPipelineRequest> request = new QueryPipelineRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

	public String getPipelineName() {
		return PipelineName;
	}

	public void setPipelineName(String pipelineName) {
		PipelineName = pipelineName;
	}

}
