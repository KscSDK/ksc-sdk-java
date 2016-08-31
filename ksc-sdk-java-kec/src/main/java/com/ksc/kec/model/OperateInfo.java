package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class OperateInfo {
	private String InstanceId;
	private Boolean Return;
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public Boolean getReturn() {
		return Return;
	}
	public void setReturn(Boolean return1) {
		Return = return1;
	}
	
}
