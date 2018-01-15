package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class LocalVolumeSnapshotOperateInfo {
	
	private String LocalVolumeSnapshotId;
	private Boolean Return;
	
	public Boolean getReturn() {
		return Return;
	}
	public void setReturn(Boolean return1) {
		Return = return1;
	}
	public String getLocalVolumeSnapshotId() {
		return LocalVolumeSnapshotId;
	}
	public void setLocalVolumeSnapshotId(String localVolumeSnapshotId) {
		LocalVolumeSnapshotId = localVolumeSnapshotId;
	}
	
}
