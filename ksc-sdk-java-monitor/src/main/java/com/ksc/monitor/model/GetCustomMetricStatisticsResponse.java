package com.ksc.monitor.model;

import lombok.ToString;
@ToString
public class GetCustomMetricStatisticsResponse {
	
	private GetCustomMetricStatisticsResult GetCustomMetricStatisticsResult;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public GetCustomMetricStatisticsResult getGetCustomMetricStatisticsResult() {
		return GetCustomMetricStatisticsResult;
	}

	public void setGetCustomMetricStatisticsResult(GetCustomMetricStatisticsResult getCustomMetricStatisticsResult) {
		GetCustomMetricStatisticsResult = getCustomMetricStatisticsResult;
	}

	
}
