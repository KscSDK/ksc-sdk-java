package com.ksc.ket.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.DelPresetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DelPresetRequestMarshaller implements Marshaller<Request<DelPresetRequest>, DelPresetRequest> {
	public Request<DelPresetRequest> marshall(DelPresetRequest delPresetRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (delPresetRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DelPresetRequest> request = new DefaultRequest<DelPresetRequest>(delPresetRequest, "ket");

		request.addParameter("Action", "DelPreset");
		String version = delPresetRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!delPresetRequest.getPreset().isEmpty()) {
			request.addParameter("Preset", StringUtils.fromString(delPresetRequest.getPreset()));
		}
		if (!delPresetRequest.getApp().isEmpty()) {
			request.addParameter("App", StringUtils.fromString(delPresetRequest.getApp()));
		}
		if (!delPresetRequest.getUniqName().isEmpty()) {
			request.addParameter("UniqName", StringUtils.fromString(delPresetRequest.getUniqName()));
		}
		return request;
	}
}
