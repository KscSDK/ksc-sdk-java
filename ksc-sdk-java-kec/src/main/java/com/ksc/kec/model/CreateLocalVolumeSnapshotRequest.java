package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.CreateLocalVolumeSnapshotRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class CreateLocalVolumeSnapshotRequest extends KscWebServiceRequest
    implements Serializable, Cloneable, DryRunSupportedRequest<CreateLocalVolumeSnapshotRequest>{
	
	private static final long serialVersionUID = 1L;
	private String LocalVolumeId;
	private String LocalVolumeSnapshotName;
	private String LocalVolumeSnapshotDesc;
	

	@Override
	public Request<CreateLocalVolumeSnapshotRequest> getDryRunRequest() {
	    	
	    Request<CreateLocalVolumeSnapshotRequest> request = new CreateLocalVolumeSnapshotRequestMarshaller().marshall(this);
	    request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}


	public String getLocalVolumeId() {
		return LocalVolumeId;
	}


	public void setLocalVolumeId(String localVolumeId) {
		LocalVolumeId = localVolumeId;
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
	 
}

