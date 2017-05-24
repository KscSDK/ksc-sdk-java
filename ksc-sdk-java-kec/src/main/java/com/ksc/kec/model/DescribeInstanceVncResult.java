package com.ksc.kec.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeInstanceVncResult implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	private String RequestId;
	private String vncUrl;
	
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	public String getVncUrl() {
		return vncUrl;
	}
	public void setVncUrl(String vncUrl) {
		this.vncUrl = vncUrl;
	}
}
