package com.ksc.monitor.model.transform;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.monitor.model.GetMetricStatisticsBatchRequest;
import com.ksc.monitor.model.GetMetricStatisticsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetMetricStatisticsBatchRequestMarshaller
		implements Marshaller<Request<GetMetricStatisticsBatchRequest>, GetMetricStatisticsBatchRequest> {

	@Override
	public Request<GetMetricStatisticsBatchRequest> marshall(GetMetricStatisticsBatchRequest getMetricStatisticsBatchRequest) {
		// TODO Auto-generated method stub
		if (getMetricStatisticsBatchRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetMetricStatisticsBatchRequest> request = new DefaultRequest<GetMetricStatisticsBatchRequest>(
				getMetricStatisticsBatchRequest, "monitor");
		request.addParameter("Action", "GetMetricStatisticsBatch");
		String version = getMetricStatisticsBatchRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2018-09-29";
		}
		byte[] content = getMetricStatisticsBatchRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		request.addParameter("Version", version);
		return request;
	}

}
