package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.QueryPipelineRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class QueryPipelineRequestMarshaller implements Marshaller<Request<QueryPipelineRequest>, QueryPipelineRequest> {

	public Request<QueryPipelineRequest> marshall(QueryPipelineRequest queryPipelineRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (queryPipelineRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<QueryPipelineRequest> request = new DefaultRequest<QueryPipelineRequest>(queryPipelineRequest, "kvs");

		request.addParameter("Action", "QueryPipeline");
		String version = queryPipelineRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);
		if (!queryPipelineRequest.getPipelineName().isEmpty()) {
			request.addParameter("PipelineName", StringUtils.fromString(queryPipelineRequest.getPipelineName()));
		}
		request.setHttpMethod(HttpMethodName.GET);
		return request;
	}
}
