package com.ksc.kec.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyImageAttributeResult implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
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
	public void setReturn(Boolean return1) {
		Return = return1;
	}
}
