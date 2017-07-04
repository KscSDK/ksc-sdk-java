package com.ksc.monitor.model;

import lombok.ToString;
@ToString
public class GetCustomMetricStatisticsResponse {
	
	private GetCustomMetricStatisticsResult GetMetricStatisticsResult;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public GetCustomMetricStatisticsResult getGetMetricStatisticsResult() {
		return GetMetricStatisticsResult;
	}

	public void setGetMetricStatisticsResult(GetCustomMetricStatisticsResult getMetricStatisticsResult) {
		GetMetricStatisticsResult = getMetricStatisticsResult;
	}
}
