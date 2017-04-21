package com.ksc.kec.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of StartInstances.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyInstanceAttributeResult implements Serializable, Cloneable {

	private static final long serialVersionUID = -6894433093187290242L;
	/**
	 * 
	 */

	private String RequestId;
	private Boolean Return;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public Boolean getReturn() {
		return Return;
	}

	public void setReturn(Boolean aReturn) {
		Return = aReturn;
	}
}
