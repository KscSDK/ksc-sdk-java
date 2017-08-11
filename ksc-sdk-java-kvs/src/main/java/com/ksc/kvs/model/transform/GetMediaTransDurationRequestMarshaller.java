package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.GetMediaTransDurationRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetMediaTransDurationRequestMarshaller
		implements Marshaller<Request<GetMediaTransDurationRequest>, GetMediaTransDurationRequest> {

	public Request<GetMediaTransDurationRequest> marshall(GetMediaTransDurationRequest getMediaTransDurationRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getMediaTransDurationRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetMediaTransDurationRequest> request = new DefaultRequest<GetMediaTransDurationRequest>(
				getMediaTransDurationRequest, "kvs");

		request.addParameter("Action", "GetMediaTransDuration");
		String version = getMediaTransDurationRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);
		if (getMediaTransDurationRequest.getStartUnixTime() != 0) {
			request.addParameter("StartUnixTime",
					StringUtils.fromInteger(getMediaTransDurationRequest.getStartUnixTime()));
		}
		if (getMediaTransDurationRequest.getEndUnixTime() != 0) {
			request.addParameter("EndUnixTime", StringUtils.fromInteger(getMediaTransDurationRequest.getEndUnixTime()));
		}
		if (getMediaTransDurationRequest.getGranularity() != 0) {
			request.addParameter("Granularity", StringUtils.fromInteger(getMediaTransDurationRequest.getGranularity()));
		}
		if (getMediaTransDurationRequest.getResultType() != 0) {
			request.addParameter("ResultType", StringUtils.fromInteger(getMediaTransDurationRequest.getResultType()));
		}
		request.setHttpMethod(HttpMethodName.GET);
		return request;
	}
}
