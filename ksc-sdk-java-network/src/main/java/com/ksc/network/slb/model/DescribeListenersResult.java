package com.ksc.network.slb.model;

import java.io.Serializable;

import com.ksc.internal.SdkInternalList;
import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeListeners.
 * </p>
 */
@ToString
public class DescribeListenersResult implements Serializable, Cloneable {
	/**
	* 
	*/
	private String RequestId;
	/**
	 * <p>
	 * 负载均衡信息的列表
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<Listener> ListenerSet;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public SdkInternalList<Listener> getListenerSet() {
		return ListenerSet;
	}

	public void setListenerSet(SdkInternalList<Listener> listenerSet) {
		ListenerSet = listenerSet;
	}

	public void addListenerSet(Listener... listeners) {
		if (this.ListenerSet == null) {
			this.ListenerSet = new com.ksc.internal.SdkInternalList<Listener>();
		}
		for (Listener listener : listeners) {
			this.ListenerSet.add(listener);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DescribeListenersResult that = (DescribeListenersResult) o;

		if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
		return ListenerSet != null ? ListenerSet.equals(that.ListenerSet) : that.ListenerSet == null;
	}

	@Override
	public int hashCode() {
		int result = RequestId != null ? RequestId.hashCode() : 0;
		result = 31 * result + (ListenerSet != null ? ListenerSet.hashCode() : 0);
		return result;
	}

	@Override
	public DescribeListenersResult clone() {
		try {
			return (DescribeListenersResult) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}
}
