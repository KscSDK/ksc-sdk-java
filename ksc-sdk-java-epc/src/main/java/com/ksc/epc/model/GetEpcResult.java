package com.ksc.epc.model;

import lombok.ToString;

/**
 * <p>
 * Contains the output of GetEpc.
 * </p>
 */
@ToString
public class GetEpcResult {

	private String RequestId;
	private EpcHost EpcHost;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public EpcHost getEpcHost() {
		return EpcHost;
	}

	public void setEpcHost(EpcHost epcHost) {
		EpcHost = epcHost;
	}

}
