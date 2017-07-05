package com.ksc.monitor.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.monitor.model.transform.GetCustomMetricStatisticsRequestMarshaller;

import lombok.ToString;

@ToString
public class GetCustomMetricStatisticsRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<GetCustomMetricStatisticsRequest> {
	private String data;
	
	@Override
	public Request<GetCustomMetricStatisticsRequest> getDryRunRequest() {
		Request<GetCustomMetricStatisticsRequest> request = new GetCustomMetricStatisticsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	
}
