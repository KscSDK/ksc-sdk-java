package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class ListMetricsResponse {

	private ListMetricsResult ListMetricsResult;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public ListMetricsResult getListMetricsResult() {
		return ListMetricsResult;
	}

	public void setListMetricsResult(ListMetricsResult listMetricsResult) {
		ListMetricsResult = listMetricsResult;
	}

}
