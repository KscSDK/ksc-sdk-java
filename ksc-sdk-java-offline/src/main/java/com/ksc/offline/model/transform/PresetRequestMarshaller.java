package com.ksc.offline.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.PresetRequest;
import com.ksc.transform.Marshaller;

public class PresetRequestMarshaller implements Marshaller<Request<PresetRequest>, PresetRequest> {

	public Request<PresetRequest> marshall(PresetRequest presetRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (presetRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<PresetRequest> request = new DefaultRequest<PresetRequest>(presetRequest, "offline");

		request.addParameter("Action", "Preset");
		String version = presetRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-09-19";
		}

		byte[] content = presetRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
