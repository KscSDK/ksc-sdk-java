package com.ksc.ket.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.UpdateLoopRequest;
import com.ksc.transform.Marshaller;

public class UpdateLoopRequestMarshaller 
implements Marshaller<Request<UpdateLoopRequest>, UpdateLoopRequest> {

	@Override
	public Request<UpdateLoopRequest> marshall(UpdateLoopRequest updateLoopRequest) {
		// TODO Auto-generated method stub
		if (updateLoopRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<UpdateLoopRequest> request = new DefaultRequest<UpdateLoopRequest>(updateLoopRequest,
				"ket");
		request.addHeader("Accept", "application/json");
		request.addParameter("Action", "UpdateLoop");
		String version = updateLoopRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		byte[] content = updateLoopRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
