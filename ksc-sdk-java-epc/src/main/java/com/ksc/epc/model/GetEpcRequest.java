package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.epc.model.transform.GetEpcRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.ToString;

@ToString
public class GetEpcRequest extends KscWebServiceRequest implements DryRunSupportedRequest<GetEpcRequest> {
	private String epcHostId;

	@Override
	public Request<GetEpcRequest> getDryRunRequest() {
		Request<GetEpcRequest> request = new GetEpcRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

	public String getEpcHostId() {
		return epcHostId;
	}

	public void setEpcHostId(String epcHostId) {
		this.epcHostId = epcHostId;
	}

}
