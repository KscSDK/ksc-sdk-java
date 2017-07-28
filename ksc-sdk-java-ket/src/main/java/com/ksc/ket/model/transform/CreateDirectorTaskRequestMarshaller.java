package com.ksc.ket.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.CreateDirectorTaskRequest;
import com.ksc.transform.Marshaller;

public class CreateDirectorTaskRequestMarshaller
		implements Marshaller<Request<CreateDirectorTaskRequest>, CreateDirectorTaskRequest> {

	public Request<CreateDirectorTaskRequest> marshall(CreateDirectorTaskRequest createDirectorTaskRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (createDirectorTaskRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<CreateDirectorTaskRequest> request = new DefaultRequest<CreateDirectorTaskRequest>(
				createDirectorTaskRequest, "ket");

		request.addParameter("Action", "CreateDirectorTask");
		String version = createDirectorTaskRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		byte[] content = createDirectorTaskRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
