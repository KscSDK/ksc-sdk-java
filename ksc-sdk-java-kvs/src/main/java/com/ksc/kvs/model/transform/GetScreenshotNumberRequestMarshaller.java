package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.GetScreenshotNumberRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetScreenshotNumberRequestMarshaller
		implements Marshaller<Request<GetScreenshotNumberRequest>, GetScreenshotNumberRequest> {

	public Request<GetScreenshotNumberRequest> marshall(GetScreenshotNumberRequest getScreenshotNumberRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getScreenshotNumberRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetScreenshotNumberRequest> request = new DefaultRequest<GetScreenshotNumberRequest>(
				getScreenshotNumberRequest, "kvs");

		request.addParameter("Action", "GetScreenshotNumber");
		String version = getScreenshotNumberRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);
		if (getScreenshotNumberRequest.getStartUnixTime() != 0) {
			request.addParameter("StartUnixTime",
					StringUtils.fromInteger(getScreenshotNumberRequest.getStartUnixTime()));
		}
		if (getScreenshotNumberRequest.getEndUnixTime() != 0) {
			request.addParameter("EndUnixTime", StringUtils.fromInteger(getScreenshotNumberRequest.getEndUnixTime()));
		}
		if (getScreenshotNumberRequest.getGranularity() != 0) {
			request.addParameter("Granularity", StringUtils.fromInteger(getScreenshotNumberRequest.getGranularity()));
		}
		if (getScreenshotNumberRequest.getResultType() != 0) {
			request.addParameter("ResultType", StringUtils.fromInteger(getScreenshotNumberRequest.getResultType()));
		}
		request.setHttpMethod(HttpMethodName.GET);
		request.addHeader("Accept", "application/json");
		return request;
	}
}