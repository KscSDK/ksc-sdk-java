package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.GetPresetListRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetPresetListRequestMarshaller implements Marshaller<Request<GetPresetListRequest>, GetPresetListRequest> {

	public Request<GetPresetListRequest> marshall(GetPresetListRequest kvsRequest) {
		// TODO Auto-generated method stub
		if (kvsRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}
		Request<GetPresetListRequest> request = new DefaultRequest<GetPresetListRequest>(kvsRequest, "kvs");

		request.addParameter("Action", "GetPresetList");
		String version = kvsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);

		if (kvsRequest.getPresettype() != null) {
			request.addParameter("PresetType", StringUtils.fromString(kvsRequest.getPresettype()));
		} else if (kvsRequest.getPresetType() != null) {
			request.addParameter("PresetType", StringUtils.fromString(kvsRequest.getPresetType()));
		}
		if (kvsRequest.getPreset() != null || kvsRequest.getPresets() != null) {
			request.addParameter("Presets", StringUtils.fromString(kvsRequest.getPreset()));
		}
		request.addParameter("WithDetail", StringUtils.fromInteger(kvsRequest.getWithDetail()));
		request.setHttpMethod(HttpMethodName.GET);
		request.addHeader("Accept", "application/json");

		return request;
	}

}
