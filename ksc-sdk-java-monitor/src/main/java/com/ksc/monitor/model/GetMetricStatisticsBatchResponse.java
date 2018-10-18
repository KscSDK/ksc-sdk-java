package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class GetMetricStatisticsBatchResponse {

	private com.ksc.internal.SdkInternalList<GetMetricStatisticsBatchResult> GetMetricStatisticsBatchResults;
	private Metadata ResponseMetadata;

	public Metadata getResponseMetadata() {
		return ResponseMetadata;
	}

	public void setResponseMetadata(Metadata responseMetadata) {
		ResponseMetadata = responseMetadata;
	}

	public void withGetMetricStatisticsBatchResults(GetMetricStatisticsBatchResult... results) {
		if (this.GetMetricStatisticsBatchResults == null) {
			this.GetMetricStatisticsBatchResults = new com.ksc.internal.SdkInternalList<GetMetricStatisticsBatchResult>();
		}
		for (GetMetricStatisticsBatchResult ele : results) {
			this.GetMetricStatisticsBatchResults.add(ele);
		}
	}

	public com.ksc.internal.SdkInternalList<GetMetricStatisticsBatchResult> getGetMetricStatisticsBatchResults() {
		return GetMetricStatisticsBatchResults;
	}

	public void setGetMetricStatisticsBatchResults(
			com.ksc.internal.SdkInternalList<GetMetricStatisticsBatchResult> getMetricStatisticsBatchResults) {
		GetMetricStatisticsBatchResults = getMetricStatisticsBatchResults;
	}

}
