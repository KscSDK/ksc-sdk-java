package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.FetchMetaInfoRequestMarshaller;

public class FetchMetaInfoRequest extends KscWebServiceRequest implements DryRunSupportedRequest<FetchMetaInfoRequest> {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<FetchMetaInfoRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<FetchMetaInfoRequest> request = new FetchMetaInfoRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}