package com.ksc.offline.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.DeletePresetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeletePresetRequestMarshaller implements Marshaller<Request<DeletePresetRequest>, DeletePresetRequest> {

	public Request<DeletePresetRequest> marshall(DeletePresetRequest deletePresetRequest) {
		if (deletePresetRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}
		Request<DeletePresetRequest> request = new DefaultRequest<DeletePresetRequest>(deletePresetRequest, "offline");

		request.addParameter("Action", "DelPreset");
		String version = deletePresetRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-09-19";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!deletePresetRequest.getPreset().isEmpty()) {
			request.addParameter("preset", StringUtils.fromString(deletePresetRequest.getPreset()));
		}
		return request;
	}

}
