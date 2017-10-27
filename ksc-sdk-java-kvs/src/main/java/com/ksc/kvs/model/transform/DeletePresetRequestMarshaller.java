package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.DeletePresetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeletePresetRequestMarshaller implements Marshaller<Request<DeletePresetRequest>, DeletePresetRequest> {

	public Request<DeletePresetRequest> marshall(DeletePresetRequest deletePresetRequest) {
		if (deletePresetRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}
		Request<DeletePresetRequest> request = new DefaultRequest<DeletePresetRequest>(deletePresetRequest, "kvs");

		request.addParameter("Action", "DelPreset");
		String version = deletePresetRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!deletePresetRequest.getPreset().isEmpty()) {
			request.addParameter("Preset", StringUtils.fromString(deletePresetRequest.getPreset()));
		}
		request.addHeader("Accept", "application/json");
		return request;
	}

}
