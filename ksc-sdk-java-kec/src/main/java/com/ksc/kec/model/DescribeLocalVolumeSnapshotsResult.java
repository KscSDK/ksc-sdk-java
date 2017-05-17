package com.ksc.kec.model;

import java.io.Serializable;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeLocalVolumeSnapshotsResult implements Serializable, Cloneable{
	
	private static final long serialVersionUID = 1L;
	private Integer LocalVolumeSnapshotCount;
	private List<LocalVolumeSnapshot> LocalVolumeSnapshotSet;
	private Integer Marker;
	private String RequestId;
	
	public DescribeLocalVolumeSnapshotsResult withLLocalVolumeSnapshot(LocalVolumeSnapshot... instances) {
		for (LocalVolumeSnapshot instance : instances) {
			this.LocalVolumeSnapshotSet.add(instance);
		}
		return this;
	}
	
	public Integer getLocalVolumeSnapshotCount() {
		return LocalVolumeSnapshotCount;
	}
	public void setLocalVolumeSnapshotCount(Integer localVolumeSnapshotCount) {
		LocalVolumeSnapshotCount = localVolumeSnapshotCount;
	}
	public List<LocalVolumeSnapshot> getLocalVolumeSnapshotSet() {
		return LocalVolumeSnapshotSet;
	}
	public void setLocalVolumeSnapshotSet(List<LocalVolumeSnapshot> localVolumeSnapshotSet) {
		LocalVolumeSnapshotSet = localVolumeSnapshotSet;
	}
	public Integer getMarker() {
		return Marker;
	}
	public void setMarker(Integer marker) {
		Marker = marker;
	}
	public String getRequestId() {
		return RequestId;
	}
	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

}
