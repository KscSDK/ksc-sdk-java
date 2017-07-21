package com.ksc.kec.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class CreateLocalVolumeSnapshotResult implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;

	private String RequestId;
	
	private String LocalVolumeSnapshotId;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public String getLocalVolumeSnapshotId() {
		return LocalVolumeSnapshotId;
	}

	public void setLocalVolumeSnapshotId(String localVolumeSnapshotId) {
		LocalVolumeSnapshotId = localVolumeSnapshotId;
	}

}

