package com.ksc.ket.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.ket.model.StartStreamPullRequest;
import com.ksc.transform.Marshaller;

public class StartStreamPullRequestMarshaller
		implements Marshaller<Request<StartStreamPullRequest>, StartStreamPullRequest> {

	public Request<StartStreamPullRequest> marshall(StartStreamPullRequest startStreamPullRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (startStreamPullRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<StartStreamPullRequest> request = new DefaultRequest<StartStreamPullRequest>(startStreamPullRequest,
				"ket");

		request.addParameter("Action", "StartStreamPull");
		String version = startStreamPullRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-01-01";
		}

		byte[] content = startStreamPullRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.addParameter("Version", version);
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		return request;
	}

}
