package com.ksc.monitor.model;

import lombok.ToString;
@ToString
public class GetCustomMetricStatisticsResponse {
	
	private GetMetricStatisticsResultV1 GetMetricStatisticsResult;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public GetMetricStatisticsResultV1 getGetMetricStatisticsResult() {
		return GetMetricStatisticsResult;
	}

	public void setGetMetricStatisticsResult(GetMetricStatisticsResultV1 getMetricStatisticsResult) {
		GetMetricStatisticsResult = getMetricStatisticsResult;
	}

	


	
	

}
