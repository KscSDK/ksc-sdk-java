package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class ListCustomMetricsResponse {

	private ListCustomMetricsResult ListCustomMetricsResult;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public ListCustomMetricsResult getListCustomMetricsResult() {
		return ListCustomMetricsResult;
	}

	public void setListCustomMetricsResult(ListCustomMetricsResult listCustomMetricsResult) {
		ListCustomMetricsResult = listCustomMetricsResult;
	}

	

	

}
