package com.ksc.ket.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.GetLoopListRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetLoopListRequestMarshaller implements Marshaller<Request<GetLoopListRequest>, GetLoopListRequest> {
	public Request<GetLoopListRequest> marshall(GetLoopListRequest getLoopListRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getLoopListRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetLoopListRequest> request = new DefaultRequest<GetLoopListRequest>(getLoopListRequest, "ket");

		request.addParameter("Action", "GetLoopList");
		String version = getLoopListRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!getLoopListRequest.getApp().isEmpty()) {
			request.addParameter("App", StringUtils.fromString(getLoopListRequest.getApp()));
		}
		if (!getLoopListRequest.getUniqName().isEmpty()) {
			request.addParameter("UniqName", StringUtils.fromString(getLoopListRequest.getUniqName()));
		}
		if (!getLoopListRequest.getStreamID().isEmpty()) {
			request.addParameter("StreamID", StringUtils.fromString(getLoopListRequest.getStreamID()));
		}
		return request;
	}
}
