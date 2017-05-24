package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.GetPresetListRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class GetPresetListRequest extends KscWebServiceRequest implements DryRunSupportedRequest<GetPresetListRequest> {
	private String app = "";
	private String uniqName = "";

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getUniqName() {
		return uniqName;
	}

	public void setUniqName(String uniqName) {
		this.uniqName = uniqName;
	}

	public Request<GetPresetListRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetPresetListRequest> request = new GetPresetListRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
}
