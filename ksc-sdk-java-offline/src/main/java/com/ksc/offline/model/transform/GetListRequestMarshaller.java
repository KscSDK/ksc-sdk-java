package com.ksc.offline.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.GetListRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetListRequestMarshaller implements Marshaller<Request<GetListRequest>, GetListRequest> {

	public Request<GetListRequest> marshall(GetListRequest offlineRequest) {
		// TODO Auto-generated method stub
		if (offlineRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}
		Request<GetListRequest> request = new DefaultRequest<GetListRequest>(offlineRequest, "offline");

		request.addParameter("Action", "GetPresetList");
		String version = offlineRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-09-19";
		}
		request.addParameter("Version", version);

		if (offlineRequest.getPresettype() != null) {
			request.addParameter("presetType", StringUtils.fromString(offlineRequest.getPresettype()));
		}
		if (offlineRequest.getPreset() != null) {
			request.addParameter("presets", StringUtils.fromString(offlineRequest.getPreset()));
		}

		request.addParameter("withDetail", StringUtils.fromInteger(offlineRequest.getWithDetail()));

		request.setHttpMethod(HttpMethodName.GET);

		return request;
	}

}
