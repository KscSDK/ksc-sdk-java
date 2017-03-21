package com.ksc.network.vpc.model.InternetGateways;

import lombok.ToString;

@ToString
public class DescribeInternetGatewaysResult {
	private String RequestId;
	/**
	 * <p>
	 * Information about one or more InternetGateways.
	 * </p>
	 */

	private com.ksc.internal.SdkInternalList<InternetGateway> InternetGatewaySet;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public com.ksc.internal.SdkInternalList<InternetGateway> getInternetGatewaySet() {
		return InternetGatewaySet;
	}

	public void setNetworkInterfaceSet(java.util.Collection<InternetGateway> internetGatewaySet) {
		if (internetGatewaySet == null) {
			this.InternetGatewaySet = null;
			return;
		}
		InternetGatewaySet = new com.ksc.internal.SdkInternalList<InternetGateway>(internetGatewaySet);
	}

	public void addInternetGateways(InternetGateway... interfaces) {
		if (this.InternetGatewaySet == null) {
			this.InternetGatewaySet = new com.ksc.internal.SdkInternalList<InternetGateway>();
		}
		for (InternetGateway item : interfaces) {
			this.InternetGatewaySet.add(item);
		}
	}
}
