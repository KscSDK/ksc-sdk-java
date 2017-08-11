package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.GetInterfaceNumberRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetInterfaceNumberRequestMarshaller
		implements Marshaller<Request<GetInterfaceNumberRequest>, GetInterfaceNumberRequest> {

	public Request<GetInterfaceNumberRequest> marshall(GetInterfaceNumberRequest getInterfaceNumberRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getInterfaceNumberRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetInterfaceNumberRequest> request = new DefaultRequest<GetInterfaceNumberRequest>(
				getInterfaceNumberRequest, "kvs");

		request.addParameter("Action", "GetInterfaceNumber");
		String version = getInterfaceNumberRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);
		if (getInterfaceNumberRequest.getStartUnixTime() != 0) {
			request.addParameter("StartUnixTime",
					StringUtils.fromInteger(getInterfaceNumberRequest.getStartUnixTime()));
		}
		if (getInterfaceNumberRequest.getEndUnixTime() != 0) {
			request.addParameter("EndUnixTime", StringUtils.fromInteger(getInterfaceNumberRequest.getEndUnixTime()));
		}
		if (getInterfaceNumberRequest.getGranularity() != 0) {
			request.addParameter("Granularity", StringUtils.fromInteger(getInterfaceNumberRequest.getGranularity()));
		}
		if (getInterfaceNumberRequest.getResultType() != 0) {
			request.addParameter("ResultType", StringUtils.fromInteger(getInterfaceNumberRequest.getResultType()));
		}
		request.setHttpMethod(HttpMethodName.GET);
		return request;
	}
}
