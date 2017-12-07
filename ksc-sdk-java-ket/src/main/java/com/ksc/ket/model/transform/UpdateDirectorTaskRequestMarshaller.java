package com.ksc.ket.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.UpdateDirectorTaskRequest;
import com.ksc.transform.Marshaller;

public class UpdateDirectorTaskRequestMarshaller implements Marshaller<Request<UpdateDirectorTaskRequest>, UpdateDirectorTaskRequest> {

	public Request<UpdateDirectorTaskRequest> marshall(UpdateDirectorTaskRequest updateDirectorTaskRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (updateDirectorTaskRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<UpdateDirectorTaskRequest> request = new DefaultRequest<UpdateDirectorTaskRequest>(
				updateDirectorTaskRequest, "ket");

		request.addParameter("Action", "UpdateDirectorTask");
		String version = updateDirectorTaskRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addHeader("Accept", "application/json");
		byte[] content = updateDirectorTaskRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
