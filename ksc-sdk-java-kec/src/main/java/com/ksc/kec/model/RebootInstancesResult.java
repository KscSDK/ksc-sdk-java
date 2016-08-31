package com.ksc.kec.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;
/**
 * <p>
 * Contains the output of RebootInstances.
 * </p>
 */

@ToString
@EqualsAndHashCode(callSuper = false)
public class RebootInstancesResult implements Serializable, Cloneable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 96488656667183531L;
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
