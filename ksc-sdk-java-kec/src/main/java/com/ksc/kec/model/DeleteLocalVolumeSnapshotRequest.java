package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DeleteLocalVolumeSnapshotRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class DeleteLocalVolumeSnapshotRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DeleteLocalVolumeSnapshotRequest>{
	
	private com.ksc.internal.SdkInternalList<String> localVolumeSnapshotIds;
	
	public java.util.List<String> getLocalVolumeSnapshotIds() {
		if (localVolumeSnapshotIds == null) {
			localVolumeSnapshotIds = new com.ksc.internal.SdkInternalList<String>();
		}
		return localVolumeSnapshotIds;
	}
	
	public void setLocalVolumeSnapshotIds(java.util.Collection<String> localVolumeSnapshotIds) {
		if (localVolumeSnapshotIds == null) {
			this.localVolumeSnapshotIds = null;
			return;
		}

		this.localVolumeSnapshotIds = new com.ksc.internal.SdkInternalList<String>(
				localVolumeSnapshotIds);
	}
	
	public DeleteLocalVolumeSnapshotRequest withLocalVolumeSnapshotIds(String... localVolumeSnapshotIds) {
		if (this.localVolumeSnapshotIds == null) {
			setLocalVolumeSnapshotIds(new com.ksc.internal.SdkInternalList<String>(
					localVolumeSnapshotIds.length));
		}
		for (String ele : localVolumeSnapshotIds) {
			this.localVolumeSnapshotIds.add(ele);
		}
		return this;
	}
	
	public DeleteLocalVolumeSnapshotRequest withLocalVolumeSnapshotIds(
			java.util.Collection<String> localVolumeSnapshotIds) {
		setLocalVolumeSnapshotIds(localVolumeSnapshotIds);
		return this;
	}
	
	@Override
	public Request<DeleteLocalVolumeSnapshotRequest> getDryRunRequest() {
		Request<DeleteLocalVolumeSnapshotRequest> request = new DeleteLocalVolumeSnapshotRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
