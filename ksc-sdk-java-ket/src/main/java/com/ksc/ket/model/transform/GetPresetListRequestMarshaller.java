package com.ksc.ket.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.GetPresetListRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetPresetListRequestMarshaller implements Marshaller<Request<GetPresetListRequest>, GetPresetListRequest> {
	public Request<GetPresetListRequest> marshall(GetPresetListRequest getPresetListRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (getPresetListRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetPresetListRequest> request = new DefaultRequest<GetPresetListRequest>(getPresetListRequest, "ket");

		request.addParameter("Action", "GetPresetList");
		String version = getPresetListRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (!getPresetListRequest.getApp().isEmpty()) {
			request.addParameter("App", StringUtils.fromString(getPresetListRequest.getApp()));
		}
		if (!getPresetListRequest.getUniqName().isEmpty()) {
			request.addParameter("UniqName", StringUtils.fromString(getPresetListRequest.getUniqName()));
		}
		return request;
	}
}