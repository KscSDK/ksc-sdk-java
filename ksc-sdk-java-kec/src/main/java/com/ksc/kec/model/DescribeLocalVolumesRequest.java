package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeLocalVolumesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeLocalVolumesRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeLocalVolumesRequest>{

	private static final long serialVersionUID = 1L;
	private String InstanceName;
	
	@Override
	public Request<DescribeLocalVolumesRequest> getDryRunRequest() {
		Request<DescribeLocalVolumesRequest> request = new DescribeLocalVolumesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	public String getInstanceName() {
		return InstanceName;
	}

	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}
	
}
