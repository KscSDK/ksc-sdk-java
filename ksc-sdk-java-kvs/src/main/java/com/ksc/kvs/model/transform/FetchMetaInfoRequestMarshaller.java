package com.ksc.kvs.model.transform;

import java.io.ByteArrayInputStream;
import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.FetchMetaInfoRequest;
import com.ksc.transform.Marshaller;

public class FetchMetaInfoRequestMarshaller implements Marshaller<Request<FetchMetaInfoRequest>, FetchMetaInfoRequest> {

	public Request<FetchMetaInfoRequest> marshall(FetchMetaInfoRequest fetchMetaInfoRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (fetchMetaInfoRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<FetchMetaInfoRequest> request = new DefaultRequest<FetchMetaInfoRequest>(fetchMetaInfoRequest, "kvs");

		request.addParameter("Action", "FetchMetaInfo");
		String version = fetchMetaInfoRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}
		request.addParameter("Version", version);

		byte[] content = fetchMetaInfoRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		request.addHeader("Accept", "application/json");
		return request;
	}

}
