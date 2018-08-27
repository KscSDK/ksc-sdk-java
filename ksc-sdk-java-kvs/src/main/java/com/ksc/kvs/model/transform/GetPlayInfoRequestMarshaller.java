package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.GetPlayInfoRequest;
import com.ksc.kvs.model.GetTaskByTaskIDRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetPlayInfoRequestMarshaller
		implements Marshaller<Request<GetPlayInfoRequest>, GetPlayInfoRequest> {

	public Request<GetPlayInfoRequest> marshall(GetPlayInfoRequest getPlayInfoRequest) {
		if (getPlayInfoRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetPlayInfoRequest> request = new DefaultRequest<GetPlayInfoRequest>(getPlayInfoRequest,
				"kvs");

		request.addParameter("Action", "GetPlayInfo");
		request.addParameter("Version", "2018-08-20");
		if (null != getPlayInfoRequest.getVideoId()) {
			request.addParameter("VideoId", StringUtils.fromString(getPlayInfoRequest.getVideoId().toString()));
		}
		if (!StringUtils.isNullOrEmpty(getPlayInfoRequest.getFormats())) {
			request.addParameter("Formats", StringUtils.fromString(getPlayInfoRequest.getFormats()));
		}
		if (null != getPlayInfoRequest.getAuthTimeOut()) {
			request.addParameter("AuthTimeOut", StringUtils.fromString(getPlayInfoRequest.getAuthTimeOut().toString()));
		}
		request.setHttpMethod(HttpMethodName.GET);
		request.addHeader("Accept", "application/json");
		return request;
	}
}
