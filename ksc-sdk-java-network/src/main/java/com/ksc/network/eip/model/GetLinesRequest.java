package com.ksc.network.eip.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.network.eip.model.transform.GetLinesRequestMarshaller;

public class GetLinesRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<GetLinesRequest> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2405270933377712072L;

	@Override
	public Request<GetLinesRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetLinesRequest> request = new GetLinesRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
