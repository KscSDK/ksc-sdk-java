package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.GetQuotaUsedRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class GetQuotaUsedRequest extends KscWebServiceRequest implements DryRunSupportedRequest<GetQuotaUsedRequest> {
	private String uniqName = "";

	public String getUniqName() {
		return uniqName;
	}

	public void setUniqName(String uniqName) {
		this.uniqName = uniqName;
	}

	@Override
	public Request<GetQuotaUsedRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetQuotaUsedRequest> request = new GetQuotaUsedRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
