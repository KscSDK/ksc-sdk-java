package com.ksc.ket.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.StopLoopRequest;
import com.ksc.transform.Marshaller;

public class StopLoopRequestMarshaller implements Marshaller<Request<StopLoopRequest>, StopLoopRequest> {

	@Override
	public Request<StopLoopRequest> marshall(StopLoopRequest stopLoopRequest) {
		// TODO Auto-generated method stub
		if (stopLoopRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<StopLoopRequest> request = new DefaultRequest<StopLoopRequest>(stopLoopRequest, "ket");

		request.addParameter("Action", "StopLoop");
		String version = stopLoopRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		byte[] content = stopLoopRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
