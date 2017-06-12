package com.ksc.ket.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.GetStreamTranListRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetStreamTranListRequestMarshaller
		implements Marshaller<Request<GetStreamTranListRequest>, GetStreamTranListRequest> {
	public Request<GetStreamTranListRequest> marshall(GetStreamTranListRequest getStreamTranListRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getStreamTranListRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetStreamTranListRequest> request = new DefaultRequest<GetStreamTranListRequest>(
				getStreamTranListRequest, "ket");

		request.addParameter("Action", "GetStreamTranList");
		String version = getStreamTranListRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!getStreamTranListRequest.getApp().isEmpty()) {
			request.addParameter("App", StringUtils.fromString(getStreamTranListRequest.getApp()));
		}
		if (!getStreamTranListRequest.getUniqName().isEmpty()) {
			request.addParameter("UniqName", StringUtils.fromString(getStreamTranListRequest.getUniqName()));
		}
		if (!getStreamTranListRequest.getStreamID().isEmpty()) {
			request.addParameter("StreamID", StringUtils.fromString(getStreamTranListRequest.getStreamID()));
		}
		if (getStreamTranListRequest.getOutPull() != -1) {
			request.addParameter("OutPull", StringUtils.fromInteger(getStreamTranListRequest.getOutPull()));
		}
		return request;
	}
}