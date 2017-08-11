package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.TopTaskByTaskIDRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class TopTaskByTaskIDRequestMarshaller
		implements Marshaller<Request<TopTaskByTaskIDRequest>, TopTaskByTaskIDRequest> {

	public Request<TopTaskByTaskIDRequest> marshall(TopTaskByTaskIDRequest topTaskByTaskIDRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (topTaskByTaskIDRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<TopTaskByTaskIDRequest> request = new DefaultRequest<TopTaskByTaskIDRequest>(topTaskByTaskIDRequest,
				"kvs");

		request.addParameter("Action", "TopTaskByTaskID");
		String version = topTaskByTaskIDRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);
		if (!topTaskByTaskIDRequest.getTaskID().isEmpty()) {
			request.addParameter("TaskID", StringUtils.fromString(topTaskByTaskIDRequest.getTaskID()));
		}

		request.setHttpMethod(HttpMethodName.GET);
		return request;
	}
}
