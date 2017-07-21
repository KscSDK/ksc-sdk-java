package com.ksc.kec.model;

import java.io.Serializable;
import java.util.List;

import com.ksc.internal.SdkInternalList;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeLocalVolumesResult implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	private Integer LocalVolumeCount;
	private List<LocalVolume> LocalVolumeSet = new SdkInternalList<LocalVolume>();
	private Integer Marker;
	private String RequestId;
	
	public DescribeLocalVolumesResult withLocalVolumesSet(LocalVolume... instances) {
		for (LocalVolume instance : instances) {
			this.LocalVolumeSet.add(instance);
		}
		return this;
	}
	public Integer getLocalVolumeCount() {
		return LocalVolumeCount;
	}
	public void setLocalVolumeCount(Integer localVolumeCount) {
		LocalVolumeCount = localVolumeCount;
	}
	public List<LocalVolume> getLocalVolumeSet() {
		return LocalVolumeSet;
	}
	public void setLocalVolumeSet(List<LocalVolume> localVolumeSet) {
		LocalVolumeSet = localVolumeSet;
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
