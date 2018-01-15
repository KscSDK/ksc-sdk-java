package com.ksc.ket.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.GetQuotaUsedRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetQuotaUsedRequestMarshaller implements Marshaller<Request<GetQuotaUsedRequest>, GetQuotaUsedRequest> {
	public Request<GetQuotaUsedRequest> marshall(GetQuotaUsedRequest getQuotaUsedRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getQuotaUsedRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetQuotaUsedRequest> request = new DefaultRequest<GetQuotaUsedRequest>(getQuotaUsedRequest, "ket");

		request.addParameter("Action", "GetQuotaUsed");
		String version = getQuotaUsedRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addHeader("Accept", "application/json");
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!getQuotaUsedRequest.getUniqName().isEmpty()) {
			request.addParameter("UniqName", StringUtils.fromString(getQuotaUsedRequest.getUniqName()));
		}
		return request;
	}
}
