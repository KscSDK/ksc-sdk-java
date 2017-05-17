package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class LocalVolumeSnapshot {
	
	private String CreationDate;
	private String InstanceId;
	private String State;
	private String LocalVolumeSnapshotId;
	private String LocalVolumeSnapshotName;
	private String LocalVolumeSnapshotDesc;
	private String SourceLocalVolumeId;
	private String SourceLocalVolumeName;
	
	public String getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}
	public String getInstanceId() {
		return InstanceId;
	}
	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getLocalVolumeSnapshotId() {
		return LocalVolumeSnapshotId;
	}
	public void setLocalVolumeSnapshotId(String localVolumeSnapshotId) {
		LocalVolumeSnapshotId = localVolumeSnapshotId;
	}
	public String getLocalVolumeSnapshotName() {
		return LocalVolumeSnapshotName;
	}
	public void setLocalVolumeSnapshotName(String localVolumeSnapshotName) {
		LocalVolumeSnapshotName = localVolumeSnapshotName;
	}
	public String getLocalVolumeSnapshotDesc() {
		return LocalVolumeSnapshotDesc;
	}
	public void setLocalVolumeSnapshotDesc(String localVolumeSnapshotDesc) {
		LocalVolumeSnapshotDesc = localVolumeSnapshotDesc;
	}
	public String getSourceLocalVolumeId() {
		return SourceLocalVolumeId;
	}
	public void setSourceLocalVolumeId(String sourceLocalVolumeId) {
		SourceLocalVolumeId = sourceLocalVolumeId;
	}
	public String getSourceLocalVolumeName() {
		return SourceLocalVolumeName;
	}
	public void setSourceLocalVolumeName(String sourceLocalVolumeName) {
		SourceLocalVolumeName = sourceLocalVolumeName;
	}
	
}
