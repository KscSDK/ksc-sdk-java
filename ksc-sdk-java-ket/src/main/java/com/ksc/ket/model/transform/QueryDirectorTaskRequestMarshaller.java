package com.ksc.ket.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.QueryDirectorTaskRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class QueryDirectorTaskRequestMarshaller
		implements Marshaller<Request<QueryDirectorTaskRequest>, QueryDirectorTaskRequest> {
	public Request<QueryDirectorTaskRequest> marshall(QueryDirectorTaskRequest queryDirectorTaskRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (queryDirectorTaskRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<QueryDirectorTaskRequest> request = new DefaultRequest<QueryDirectorTaskRequest>(
				queryDirectorTaskRequest, "ket");

		request.addParameter("Action", "QueryDirectorTask");
		String version = queryDirectorTaskRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!queryDirectorTaskRequest.getApp().isEmpty()) {
			request.addParameter("App", StringUtils.fromString(queryDirectorTaskRequest.getApp()));
		}
		if (!queryDirectorTaskRequest.getUniqName().isEmpty()) {
			request.addParameter("UniqName", StringUtils.fromString(queryDirectorTaskRequest.getUniqName()));
		}
		if (!queryDirectorTaskRequest.getTaskID().isEmpty()) {
			request.addParameter("TaskID", StringUtils.fromString(queryDirectorTaskRequest.getTaskID()));
		}
		return request;
	}
}
