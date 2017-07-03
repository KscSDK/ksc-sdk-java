package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class ListMetricsResponseV1 {

	private ListMetricsResultV1 ListMetricsResult;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public ListMetricsResultV1 getListMetricsResult() {
		return ListMetricsResult;
	}

	public void setListMetricsResult(ListMetricsResultV1 listMetricsResult) {
		ListMetricsResult = listMetricsResult;
	}

	

}
