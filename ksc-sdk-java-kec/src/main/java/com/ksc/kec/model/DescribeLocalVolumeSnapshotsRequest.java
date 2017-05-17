package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeLocalVolumeSnapshotsRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeLocalVolumeSnapshotsRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeLocalVolumeSnapshotsRequest>{
	
	private static final long serialVersionUID = 1L;
	private String LocalInstanceName;
    
    @Override
	public Request<DescribeLocalVolumeSnapshotsRequest> getDryRunRequest() {
		Request<DescribeLocalVolumeSnapshotsRequest> request = new DescribeLocalVolumeSnapshotsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	public String getLocalInstanceName() {
		return LocalInstanceName;
	}

	public void setLocalInstanceName(String localInstanceName) {
		LocalInstanceName = localInstanceName;
	}
    
}
