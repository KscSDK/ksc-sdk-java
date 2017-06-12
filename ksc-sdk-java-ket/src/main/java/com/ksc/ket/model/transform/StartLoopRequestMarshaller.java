package com.ksc.ket.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.StartLoopRequest;
import com.ksc.transform.Marshaller;

public class StartLoopRequestMarshaller implements Marshaller<Request<StartLoopRequest>, StartLoopRequest> {

	public Request<StartLoopRequest> marshall(StartLoopRequest startLoopRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (startLoopRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<StartLoopRequest> request = new DefaultRequest<StartLoopRequest>(startLoopRequest, "ket");

		request.addParameter("Action", "StartLoop");
		String version = startLoopRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		byte[] content = startLoopRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
