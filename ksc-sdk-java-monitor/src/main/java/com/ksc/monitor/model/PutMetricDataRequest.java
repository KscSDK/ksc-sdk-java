package com.ksc.monitor.model;


import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.monitor.model.transform.PutMetricDataRequestMarshaller;

import lombok.ToString;

@ToString
public class PutMetricDataRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<PutMetricDataRequest>{
	private  String data;
	@Override
	public Request<PutMetricDataRequest> getDryRunRequest() {
		Request<PutMetricDataRequest> request = new PutMetricDataRequestMarshaller()
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
