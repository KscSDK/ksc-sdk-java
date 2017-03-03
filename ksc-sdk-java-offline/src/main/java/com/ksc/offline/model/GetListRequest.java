package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.GetListRequestMarshaller;

public class GetListRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<GetListRequest>{
	
	private int withDetail;
	
	private String presettype;
	
	private String preset;
	

	public String getPreset() {
		return preset;
	}


	public void setPreset(String preset) {
		this.preset = preset;
	}


	public String getPresettype() {
		return presettype;
	}


	public void setPresettype(String presettype) {
		this.presettype = presettype;
	}


	public int getWithDetail() {
		return withDetail;
	}


	public void setWithDetail(int withDetail) {
		this.withDetail = withDetail;
	}


	public Request<GetListRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetListRequest> request = new GetListRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	
	

}
