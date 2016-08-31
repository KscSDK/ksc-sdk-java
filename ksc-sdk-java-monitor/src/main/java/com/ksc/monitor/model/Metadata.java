package com.ksc.monitor.model;

import lombok.ToString;

@ToString
public class Metadata {
	private String RequestId;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	
}
