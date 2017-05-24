package com.ksc.kec.model;

import lombok.ToString;

@ToString
public class LocalVolume {
	
	private String CreationDate;
	private String InstanceId;
	private String InstanceName;
	private String InstanceState;
	private String LocalVolumeCategory;
	private String LocalVolumeId;
	private String LocalVolumeName;
	private Integer LocalVolumeSize;
	private String LocalVolumeState;
	private String LocalVolumeType;
	
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
	public String getInstanceName() {
		return InstanceName;
	}
	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}
	public String getInstanceState() {
		return InstanceState;
	}
	public void setInstanceState(String instanceState) {
		InstanceState = instanceState;
	}
	public String getLocalVolumeCategory() {
		return LocalVolumeCategory;
	}
	public void setLocalVolumeCategory(String localVolumeCategory) {
		LocalVolumeCategory = localVolumeCategory;
	}
	public String getLocalVolumeId() {
		return LocalVolumeId;
	}
	public void setLocalVolumeId(String localVolumeId) {
		LocalVolumeId = localVolumeId;
	}
	public String getLocalVolumeName() {
		return LocalVolumeName;
	}
	public void setLocalVolumeName(String localVolumeName) {
		LocalVolumeName = localVolumeName;
	}
	public Integer getLocalVolumeSize() {
		return LocalVolumeSize;
	}
	public void setLocalVolumeSize(Integer localVolumeSize) {
		LocalVolumeSize = localVolumeSize;
	}
	public String getLocalVolumeState() {
		return LocalVolumeState;
	}
	public void setLocalVolumeState(String localVolumeState) {
		LocalVolumeState = localVolumeState;
	}
	public String getLocalVolumeType() {
		return LocalVolumeType;
	}
	public void setLocalVolumeType(String localVolumeType) {
		LocalVolumeType = localVolumeType;
	}
	
}
