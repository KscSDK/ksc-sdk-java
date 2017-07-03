package com.ksc.monitor.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.monitor.model.GetMetricStatisticsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetMetricStatisticsRequestMarshaller
		implements Marshaller<Request<GetMetricStatisticsRequest>, GetMetricStatisticsRequest> {

	@Override
	public Request<GetMetricStatisticsRequest> marshall(GetMetricStatisticsRequest getMetricStatisticsRequest) {
		// TODO Auto-generated method stub
		if (getMetricStatisticsRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<GetMetricStatisticsRequest> request = new DefaultRequest<GetMetricStatisticsRequest>(
				getMetricStatisticsRequest, "monitor");
		request.addParameter("Action", "GetMetricStatistics");
		String version = getMetricStatisticsRequest.getVersion();
		System.out.println("version"+version);
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2010-05-23";
		}
		System.out.println("version"+version);
		if (version.equalsIgnoreCase("2017-07-01")){
			byte[] content = getMetricStatisticsRequest.getData().getBytes();
			request.addHeader("Content-Type", "application/json");
			request.setContent(new ByteArrayInputStream(content));
			request.addHeader("Content-Length", Integer.toString(content.length));
			request.addHeader("Accept", "application/xml");
			request.setHttpMethod(HttpMethodName.POST);
		}else{
			request.setHttpMethod(HttpMethodName.GET);			
		}		
		request.addParameter("Version", version);
		if (getMetricStatisticsRequest.getInstanceId() != null) {
			request.addParameter("InstanceID", StringUtils.fromString(getMetricStatisticsRequest.getInstanceId()));
		}
		if (getMetricStatisticsRequest.getMetricName() != null) {
			request.addParameter("MetricName", StringUtils.fromString(getMetricStatisticsRequest.getMetricName()));
		}
		if (getMetricStatisticsRequest.getNamespace() != null) {
			request.addParameter("Namespace", StringUtils.fromString(getMetricStatisticsRequest.getNamespace()));
		}
		if (getMetricStatisticsRequest.getStartTime() != null) {
			request.addParameter("StartTime", StringUtils.fromString(getMetricStatisticsRequest.getStartTime()));
		}
		if (getMetricStatisticsRequest.getEndTime() != null) {
			request.addParameter("EndTime", StringUtils.fromString(getMetricStatisticsRequest.getEndTime()));
		}
		if (getMetricStatisticsRequest.getPeriod() != null) {
			request.addParameter("Period", StringUtils.fromInteger(getMetricStatisticsRequest.getPeriod()));
		}
		if (getMetricStatisticsRequest.getAggregate() != null) {
			request.addParameter("Aggregate", StringUtils.fromString(getMetricStatisticsRequest.getAggregate()));
		}
		return request;
	}

}
