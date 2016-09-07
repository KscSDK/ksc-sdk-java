package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.epc.model.GetEpcRequest;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetEpcRequestMarshaller implements Marshaller<Request<GetEpcRequest>, GetEpcRequest> {

	@Override
	public Request<GetEpcRequest> marshall(GetEpcRequest getEpcRequest) {
		if (getEpcRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetEpcRequest> request = new DefaultRequest<GetEpcRequest>(getEpcRequest, "epc");
		request.addParameter("Action", "GetEpc");
		String version = getEpcRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2015-11-01";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (getEpcRequest.getEpcHostId() != null) {
			request.addParameter("EpcHostId", StringUtils.fromString(getEpcRequest.getEpcHostId()));
		}
		return request;
	}

}
