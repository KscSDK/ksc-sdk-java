package com.ksc.monitor.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.monitor.model.ListCustomMetricsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ListCustomMetricsRequestMarshaller
		implements Marshaller<Request<ListCustomMetricsRequest>, ListCustomMetricsRequest> {

	@Override
	public Request<ListCustomMetricsRequest> marshall(ListCustomMetricsRequest listMetricsRequest) {
		// TODO Auto-generated method stub
		if (listMetricsRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}
		Request<ListCustomMetricsRequest> request = new DefaultRequest<ListCustomMetricsRequest>(listMetricsRequest,
				"monitor");
		request.addParameter("Action", "ListMetrics");
		String version = listMetricsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-07-01";
		}

		byte[] content = listMetricsRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);

		request.addParameter("Version", version);

		return request;
	}

}
