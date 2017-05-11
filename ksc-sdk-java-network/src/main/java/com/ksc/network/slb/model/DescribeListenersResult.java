package com.ksc.network.slb.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * Contains the output of DescribeListeners.
 * </p>
 */
@ToString
@EqualsAndHashCode
public class DescribeListenersResult implements Serializable, Cloneable {
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
	private com.ksc.internal.SdkInternalList<Listener> ListenerSet;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public com.ksc.internal.SdkInternalList<Listener> getListenerSet() {
		return ListenerSet;
	}

	public void setListenerSet(com.ksc.internal.SdkInternalList<Listener> listenerSet) {
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

}
