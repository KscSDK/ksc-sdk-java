package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class ListCustomMetricsResponse {

	private ListCustomMetricsResult ListMetricsResult;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public ListCustomMetricsResult getListMetricsResult() {
		return ListMetricsResult;
	}

	public void setListMetricsResult(ListCustomMetricsResult listMetricsResult) {
		ListMetricsResult = listMetricsResult;
	}

	

}
