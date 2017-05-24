package com.ksc.ket.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.GetPresetDetailRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetPresetDetailRequestMarshaller
		implements Marshaller<Request<GetPresetDetailRequest>, GetPresetDetailRequest> {
	public Request<GetPresetDetailRequest> marshall(GetPresetDetailRequest getPresetDetailRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getPresetDetailRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetPresetDetailRequest> request = new DefaultRequest<GetPresetDetailRequest>(getPresetDetailRequest,
				"ket");

		request.addParameter("Action", "GetPresetDetail");
		String version = getPresetDetailRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!getPresetDetailRequest.getPreset().isEmpty()) {
			request.addParameter("Preset", StringUtils.fromString(getPresetDetailRequest.getPreset()));
		}
		if (!getPresetDetailRequest.getApp().isEmpty()) {
			request.addParameter("App", StringUtils.fromString(getPresetDetailRequest.getApp()));
		}
		if (!getPresetDetailRequest.getUniqName().isEmpty()) {
			request.addParameter("UniqName", StringUtils.fromString(getPresetDetailRequest.getUniqName()));
		}
		return request;
	}
}
