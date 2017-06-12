package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.DelPresetRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class DelPresetRequest extends KscWebServiceRequest implements DryRunSupportedRequest<DelPresetRequest> {
	private String preset;
	private String app;
	private String uniqName;

	public String getPreset() {
		return preset;
	}

	public void setPreset(String preset) {
		this.preset = preset;
	}

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

	public Request<DelPresetRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<DelPresetRequest> request = new DelPresetRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
}
