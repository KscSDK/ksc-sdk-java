package com.ksc.monitor.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.monitor.model.GetCustomMetricStatisticsRequest;
import com.ksc.transform.Marshaller;

public class GetCustomMetricStatisticsRequestMarshaller
		implements Marshaller<Request<GetCustomMetricStatisticsRequest>, GetCustomMetricStatisticsRequest> {

	@Override
	public Request<GetCustomMetricStatisticsRequest> marshall(GetCustomMetricStatisticsRequest getCustomMetricStatisticsRequest) {
		// TODO Auto-generated method stub
		if (getCustomMetricStatisticsRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetCustomMetricStatisticsRequest> request = new DefaultRequest<GetCustomMetricStatisticsRequest>(
				getCustomMetricStatisticsRequest, "monitor");
		request.addParameter("Action", "GetMetricStatistics");
		String version = getCustomMetricStatisticsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-07-01";
		}
		System.out.println("version"+version);
	
			byte[] content = getCustomMetricStatisticsRequest.getData().getBytes();
			request.addHeader("Content-Type", "application/json");
			request.setContent(new ByteArrayInputStream(content));
			request.addHeader("Content-Length", Integer.toString(content.length));
			request.addHeader("Accept", "application/xml");
			request.setHttpMethod(HttpMethodName.POST);	
		request.addParameter("Version", version);
		
		return request;
	}

}
