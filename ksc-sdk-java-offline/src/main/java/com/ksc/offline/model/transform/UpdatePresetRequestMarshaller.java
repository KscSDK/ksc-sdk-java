package com.ksc.offline.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.UpdatePersetRequest;
import com.ksc.transform.Marshaller;

public class UpdatePresetRequestMarshaller implements Marshaller<Request<UpdatePersetRequest>, UpdatePersetRequest> {
	public Request<UpdatePersetRequest> marshall(UpdatePersetRequest updatePersetRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (updatePersetRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<UpdatePersetRequest> request = new DefaultRequest<UpdatePersetRequest>(updatePersetRequest, "offline");

		request.addParameter("Action", "UpdatePreset");
		String version = updatePersetRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-09-19";
		}

		byte[] content = updatePersetRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}
}
