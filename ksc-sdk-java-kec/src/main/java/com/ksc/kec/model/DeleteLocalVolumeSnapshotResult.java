package com.ksc.kec.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DeleteLocalVolumeSnapshotResult implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	private String RequestId;
	private com.ksc.internal.SdkInternalList<LocalVolumeSnapshotOperateInfo> ReturnSet;
	
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
	public com.ksc.internal.SdkInternalList<LocalVolumeSnapshotOperateInfo> getReturnSet() {
		return ReturnSet;
	}

	public void setReturnSet(com.ksc.internal.SdkInternalList<LocalVolumeSnapshotOperateInfo> returnSet) {
		ReturnSet = returnSet;
	}
	 
	public void addReturnSet(LocalVolumeSnapshotOperateInfo... infos){
		if(this.ReturnSet==null){
			this.ReturnSet= new  com.ksc.internal.SdkInternalList<LocalVolumeSnapshotOperateInfo>();
		}
		for(LocalVolumeSnapshotOperateInfo info : infos){
			this.ReturnSet.add(info);
		}
	}
}
