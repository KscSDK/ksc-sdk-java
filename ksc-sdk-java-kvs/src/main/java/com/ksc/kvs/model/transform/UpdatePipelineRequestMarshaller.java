package com.ksc.kvs.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.UpdatePipelineRequest;
import com.ksc.transform.Marshaller;

public class UpdatePipelineRequestMarshaller
		implements Marshaller<Request<UpdatePipelineRequest>, UpdatePipelineRequest> {
	public Request<UpdatePipelineRequest> marshall(UpdatePipelineRequest updatePipelineRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (updatePipelineRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<UpdatePipelineRequest> request = new DefaultRequest<UpdatePipelineRequest>(updatePipelineRequest,
				"kvs");

		request.addParameter("Action", "UpdatePipeline");
		String version = updatePipelineRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		byte[] content = updatePipelineRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}
}
