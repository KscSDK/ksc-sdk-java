package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeInstanceVncRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeInstanceVncRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeInstanceVncRequest>{

	private static final long serialVersionUID = 1L;
	private String InstanceId;

	@Override
	public Request<DescribeInstanceVncRequest> getDryRunRequest() {
	    	
	    Request<DescribeInstanceVncRequest> request = new DescribeInstanceVncRequestMarshaller().marshall(this);
	    request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	
	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}
	
}
