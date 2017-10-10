package com.ksc.kvs.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.CreateFlowTaskRequest;
import com.ksc.transform.Marshaller;

public class CreateFlowTaskRequestMarshaller implements Marshaller<Request<CreateFlowTaskRequest>, CreateFlowTaskRequest> {

	public Request<CreateFlowTaskRequest> marshall(CreateFlowTaskRequest createTaskRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (createTaskRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<CreateFlowTaskRequest> request = new DefaultRequest<CreateFlowTaskRequest>(createTaskRequest, "kvs");

		request.addParameter("Action", "CreateFlowTask");
		String version = createTaskRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);

		byte[] content = createTaskRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
