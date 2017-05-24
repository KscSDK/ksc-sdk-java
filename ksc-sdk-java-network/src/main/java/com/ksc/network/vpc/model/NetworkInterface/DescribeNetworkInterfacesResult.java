package com.ksc.network.vpc.model.NetworkInterface;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class DescribeNetworkInterfacesResult {
	private String RequestId;
	/**
	 * <p>
	 * Information about one or more NetworkInterfaces.
	 * </p>
	 */

	private com.ksc.internal.SdkInternalList<NetworkInterface> NetworkInterfaceSet;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public com.ksc.internal.SdkInternalList<NetworkInterface> getNetworkInterfaceSet() {
		return NetworkInterfaceSet;
	}

	public void setNetworkInterfaceSet(java.util.Collection<NetworkInterface> networkInterfaceSet) {
		if (networkInterfaceSet == null) {
			this.NetworkInterfaceSet = null;
			return;
		}
		NetworkInterfaceSet = new com.ksc.internal.SdkInternalList<NetworkInterface>(networkInterfaceSet);
	}

	public void addNetworkInterfaces(NetworkInterface... interfaces) {
		if (this.NetworkInterfaceSet == null) {
			this.NetworkInterfaceSet = new com.ksc.internal.SdkInternalList<NetworkInterface>();
		}
		for (NetworkInterface item : interfaces) {
			this.NetworkInterfaceSet.add(item);
		}
	}
}
