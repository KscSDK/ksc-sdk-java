package com.ksc.monitor.model.transform;

import java.util.HashMap;
import java.util.Map.Entry;

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
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2010-05-25";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
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
		if (getMetricStatisticsRequest.getDimensions() != null) {
			HashMap<String,String> dimensions=getMetricStatisticsRequest.getDimensions() ;
			if (dimensions.size()!=0){
				 for (Entry<String, String> entry : dimensions.entrySet()) {
					 if ((entry.getValue()!=null &&entry.getValue()!="")&&(entry.getKey()!=null &&entry.getKey()!="")){
						 request.addParameter(entry.getKey(), StringUtils.fromString(entry.getValue()));
					 }
				 }
			}
			
		}
		return request;
	}

}
