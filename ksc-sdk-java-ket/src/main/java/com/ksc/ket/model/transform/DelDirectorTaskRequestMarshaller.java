package com.ksc.ket.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.DelDirectorTaskRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DelDirectorTaskRequestMarshaller
		implements Marshaller<Request<DelDirectorTaskRequest>, DelDirectorTaskRequest> {

	public Request<DelDirectorTaskRequest> marshall(DelDirectorTaskRequest delDirectorTaskRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (delDirectorTaskRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DelDirectorTaskRequest> request = new DefaultRequest<DelDirectorTaskRequest>(delDirectorTaskRequest,
				"ket");

		request.addParameter("Action", "DelDirectorTask");
		String version = delDirectorTaskRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!delDirectorTaskRequest.getApp().isEmpty()) {
			request.addParameter("App", StringUtils.fromString(delDirectorTaskRequest.getApp()));
		}
		if (!delDirectorTaskRequest.getUniqName().isEmpty()) {
			request.addParameter("UniqName", StringUtils.fromString(delDirectorTaskRequest.getUniqName()));
		}
		if (!delDirectorTaskRequest.getTaskID().isEmpty()) {
			request.addParameter("TaskID", StringUtils.fromString(delDirectorTaskRequest.getTaskID()));
		}
		return request;
	}
}
