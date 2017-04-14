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
public class TerminateInstancesResult implements Serializable, Cloneable {

	private static final long serialVersionUID = -6894433093187290242L;
	/**
	 * 
	 */

	private String RequestId;
    /**
     * <p>
     * Information about one or more Elastic IP addresses.
     * </p>
     */
    private com.ksc.internal.SdkInternalList<OperateInfo> InstancesSet;
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	public com.ksc.internal.SdkInternalList<OperateInfo> getInstancesSet() {
		return InstancesSet;
	}
	public void setInstancesSet(com.ksc.internal.SdkInternalList<OperateInfo> instancesSet) {
		InstancesSet = instancesSet;
	}
	public void addInstanceSet(OperateInfo... infos){
		if(this.InstancesSet==null){
			this.InstancesSet= new  com.ksc.internal.SdkInternalList<OperateInfo>();
		}
		for(OperateInfo info : infos){
			this.InstancesSet.add(info);
		}
	}
    

}
