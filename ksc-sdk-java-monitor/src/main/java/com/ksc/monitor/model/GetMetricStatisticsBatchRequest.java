package com.ksc.monitor.model;
import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.monitor.model.transform.GetMetricStatisticsBatchRequestMarshaller;


import lombok.ToString;

@ToString
public class GetMetricStatisticsBatchRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<GetMetricStatisticsBatchRequest> {
	private  String data;
	@Override
	public Request<GetMetricStatisticsBatchRequest> getDryRunRequest() {
		Request<GetMetricStatisticsBatchRequest> request = new GetMetricStatisticsBatchRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	public  String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
