package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeAvailabilityZonesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeAvailabilityZonesRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeAvailabilityZonesRequest>{

	private static final long serialVersionUID = 1L;
	
	@Override
	public Request<DescribeAvailabilityZonesRequest> getDryRunRequest() {
		Request<DescribeAvailabilityZonesRequest> request = new DescribeAvailabilityZonesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	
}
