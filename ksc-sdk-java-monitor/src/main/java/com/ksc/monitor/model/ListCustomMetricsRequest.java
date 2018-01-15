package com.ksc.monitor.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.monitor.model.transform.ListCustomMetricsRequestMarshaller;

import lombok.ToString;

@ToString
public class ListCustomMetricsRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<ListCustomMetricsRequest>{
	
	private  String data;
	@Override
	public Request<ListCustomMetricsRequest> getDryRunRequest() {
		Request<ListCustomMetricsRequest> request = new ListCustomMetricsRequestMarshaller()
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
