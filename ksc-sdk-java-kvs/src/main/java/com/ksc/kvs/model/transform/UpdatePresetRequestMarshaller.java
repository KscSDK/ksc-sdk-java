package com.ksc.kvs.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.UpdatePresetRequest;
import com.ksc.transform.Marshaller;

public class UpdatePresetRequestMarshaller implements Marshaller<Request<UpdatePresetRequest>, UpdatePresetRequest> {
	public Request<UpdatePresetRequest> marshall(UpdatePresetRequest updatePersetRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (updatePersetRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<UpdatePresetRequest> request = new DefaultRequest<UpdatePresetRequest>(updatePersetRequest, "kvs");

		request.addParameter("Action", "UpdatePreset");
		String version = updatePersetRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
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
