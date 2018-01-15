package com.ksc.network.slb.model;

import java.io.Serializable;

import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeInstancesWithListener.
 * </p>
 */
@ToString
public class DescribeInstancesWithListenerResult implements Serializable, Cloneable {
	/**
	* 
	*/
	private static final long serialVersionUID = -1152397641363296840L;
	private String RequestId;
	/**
	 * <p>
	 * 真实服务器信息
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<RealServer> RealServerSet;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public com.ksc.internal.SdkInternalList<RealServer> getRealServerSet() {
		return RealServerSet;
	}

	public void setRealServerSet(com.ksc.internal.SdkInternalList<RealServer> realServerSet) {
		RealServerSet = realServerSet;
	}

	public void addRealServerSet(RealServer... realServers) {
		if (this.RealServerSet == null) {
			this.RealServerSet = new com.ksc.internal.SdkInternalList<RealServer>();
		}
		for (RealServer realServer : realServers) {
			this.RealServerSet.add(realServer);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DescribeInstancesWithListenerResult that = (DescribeInstancesWithListenerResult) o;

		if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
		return RealServerSet != null ? RealServerSet.equals(that.RealServerSet) : that.RealServerSet == null;
	}

	@Override
	public int hashCode() {
		int result = RequestId != null ? RequestId.hashCode() : 0;
		result = 31 * result + (RealServerSet != null ? RealServerSet.hashCode() : 0);
		return result;
	}
}
