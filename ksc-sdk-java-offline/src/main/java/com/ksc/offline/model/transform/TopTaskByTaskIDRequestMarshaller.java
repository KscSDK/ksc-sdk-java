package com.ksc.offline.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.TopTaskByTaskIDRequest;
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
				"offline");

		request.addParameter("Action", "TopTaskByTaskID");
		String version = topTaskByTaskIDRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-09-19";
		}
		request.addParameter("Version", version);
		if (!topTaskByTaskIDRequest.getTaskid().isEmpty()) {
			request.addParameter("taskid", StringUtils.fromString(topTaskByTaskIDRequest.getTaskid()));
		}
		request.setHttpMethod(HttpMethodName.GET);
		return request;
	}
}
