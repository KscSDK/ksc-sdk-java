package com.ksc.offline.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.GetPresetDetailRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetPresetDetailRequestMarshaller
		implements Marshaller<Request<GetPresetDetailRequest>, GetPresetDetailRequest> {

	public Request<GetPresetDetailRequest> marshall(GetPresetDetailRequest getPresetDetailRequest) {
		if (getPresetDetailRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}
		Request<GetPresetDetailRequest> request = new DefaultRequest<GetPresetDetailRequest>(getPresetDetailRequest,
				"offline");

		request.addParameter("Action", "GetPresetDetail");
		String version = getPresetDetailRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-09-19";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!getPresetDetailRequest.getPreset().isEmpty()) {
			request.addParameter("preset", StringUtils.fromString(getPresetDetailRequest.getPreset()));
		}

		return request;
	}

}
