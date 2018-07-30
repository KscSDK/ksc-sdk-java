package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeInstanceFamilysRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeInstanceFamilysRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeInstanceFamilysRequest>{

	private static final long serialVersionUID = 1L;
	
	@Override
	public Request<DescribeInstanceFamilysRequest> getDryRunRequest() {
		Request<DescribeInstanceFamilysRequest> request = new DescribeInstanceFamilysRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	
}
