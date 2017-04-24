package com.ksc.ket.model.transform;


import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.StopStreamPullRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class StopStreamPullRequestMarshaller
		implements Marshaller<Request<StopStreamPullRequest>, StopStreamPullRequest> {

	@Override
	public Request<StopStreamPullRequest> marshall(StopStreamPullRequest stopStreamPullRequest) {
		// TODO Auto-generated method stub
		if (stopStreamPullRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<StopStreamPullRequest> request = new DefaultRequest<StopStreamPullRequest>(stopStreamPullRequest,
				"ket");

		request.addParameter("Action", "StopStreamPull");
		String version = stopStreamPullRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		byte[] content = stopStreamPullRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
