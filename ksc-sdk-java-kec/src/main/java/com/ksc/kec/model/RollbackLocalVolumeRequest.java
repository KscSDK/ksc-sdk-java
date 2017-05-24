package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.RollbackLocalVolumeRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class RollbackLocalVolumeRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<RollbackLocalVolumeRequest>{
	
	private static final long serialVersionUID = 1L;
	private String LocalVolumeId;
	private String LocalVolumeSnapshotId;
	
	@Override
	public Request<RollbackLocalVolumeRequest> getDryRunRequest() {
	    	
	    Request<RollbackLocalVolumeRequest> request = new RollbackLocalVolumeRequestMarshaller().marshall(this);
	    request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	
	public String getLocalVolumeId() {
		return LocalVolumeId;
	}
	public void setLocalVolumeId(String localVolumeId) {
		LocalVolumeId = localVolumeId;
	}
	public String getLocalVolumeSnapshotId() {
		return LocalVolumeSnapshotId;
	}
	public void setLocalVolumeSnapshotId(String localVolumeSnapshotId) {
		LocalVolumeSnapshotId = localVolumeSnapshotId;
	}

}
