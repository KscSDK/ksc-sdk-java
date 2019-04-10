package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class GetMetricStatisticsBatchV2Response {

	private com.ksc.internal.SdkInternalList<GetMetricStatisticsBatchResult> GetMetricStatisticsBatchResults;
	private Metadata ResponseMetadata;
	private com.ksc.internal.SdkInternalList<String> ErrorMessages;
	

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
	public void withErrorMessages(String... errorMessages) {
		if (this.ErrorMessages == null) {
			this.ErrorMessages = new com.ksc.internal.SdkInternalList<String>();
		}
		for (String ele : errorMessages) {
			this.ErrorMessages.add(ele);
		}
	}
	public com.ksc.internal.SdkInternalList<GetMetricStatisticsBatchResult> getGetMetricStatisticsBatchResults() {
		return GetMetricStatisticsBatchResults;
	}

	public void setGetMetricStatisticsBatchResults(
			com.ksc.internal.SdkInternalList<GetMetricStatisticsBatchResult> getMetricStatisticsBatchResults) {
		GetMetricStatisticsBatchResults = getMetricStatisticsBatchResults;
	}

	public com.ksc.internal.SdkInternalList<String> getErrorMessages() {
		return ErrorMessages;
	}

	public void setErrorMessages(com.ksc.internal.SdkInternalList<String> errorMessages) {
		ErrorMessages = errorMessages;
	}

}
