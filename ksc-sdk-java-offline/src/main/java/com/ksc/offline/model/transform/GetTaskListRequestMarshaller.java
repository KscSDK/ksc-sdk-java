package com.ksc.offline.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.GetTaskListRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetTaskListRequestMarshaller implements Marshaller<Request<GetTaskListRequest>, GetTaskListRequest> {

	public Request<GetTaskListRequest> marshall(GetTaskListRequest getTaskListRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getTaskListRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetTaskListRequest> request = new DefaultRequest<GetTaskListRequest>(getTaskListRequest, "offline");

		request.addParameter("Action", "GetTaskList");
		String version = getTaskListRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-09-19";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		if (getTaskListRequest.getStartdate() != -1) {
			request.addParameter("startdate", StringUtils.fromInteger(getTaskListRequest.getStartdate()));
		}
		if (getTaskListRequest.getEnddate() != -1) {
			request.addParameter("enddate", StringUtils.fromInteger(getTaskListRequest.getEnddate()));
		}
		if (getTaskListRequest.getMarker() != -1) {
			request.addParameter("marker", StringUtils.fromInteger(getTaskListRequest.getMarker()));
		}
		if (getTaskListRequest.getLimit() != -1) {
			request.addParameter("limit", StringUtils.fromInteger(getTaskListRequest.getLimit()));

		}

		return request;
	}

}
