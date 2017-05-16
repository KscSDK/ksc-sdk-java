package com.ksc.tag.model;

import java.io.Serializable;

import lombok.ToString;

@ToString
public class DeleteTagsResult implements Serializable, Cloneable {

	private static final long serialVersionUID = 4611835333710905966L;

	private String RequestId;

	/**
	 * 调用成功返回true
	 */
	private boolean Return;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public boolean isReturn() {
		return Return;
	}

	public void setReturn(boolean return1) {
		Return = return1;
	}
}
