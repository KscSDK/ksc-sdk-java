package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.DescribeRegionsRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@ToString
@EqualsAndHashCode(callSuper = false)
public class DescribeRegionsRequest extends KscWebServiceRequest
       implements Serializable, Cloneable, DryRunSupportedRequest<DescribeRegionsRequest>{

	private static final long serialVersionUID = 1L;
	
	@Override
	public Request<DescribeRegionsRequest> getDryRunRequest() {
		Request<DescribeRegionsRequest> request = new DescribeRegionsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}
	
}
