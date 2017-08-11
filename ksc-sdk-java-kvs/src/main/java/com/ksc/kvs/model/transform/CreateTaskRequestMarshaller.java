package com.ksc.kvs.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.CreateTaskRequest;
import com.ksc.transform.Marshaller;

public class CreateTaskRequestMarshaller implements Marshaller<Request<CreateTaskRequest>, CreateTaskRequest> {

	public Request<CreateTaskRequest> marshall(CreateTaskRequest createTaskRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (createTaskRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<CreateTaskRequest> request = new DefaultRequest<CreateTaskRequest>(createTaskRequest, "kvs");

		request.addParameter("Action", "CreateTask");
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
