package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class GetMetricStatisticsResponse {
	
	private GetMetricStatisticsResult GetMetricStatisticsResult;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public GetMetricStatisticsResult getGetMetricStatisticsResult() {
		return GetMetricStatisticsResult;
	}

	public void setGetMetricStatisticsResult(GetMetricStatisticsResult getMetricStatisticsResult) {
		GetMetricStatisticsResult = getMetricStatisticsResult;
	}
	

}
