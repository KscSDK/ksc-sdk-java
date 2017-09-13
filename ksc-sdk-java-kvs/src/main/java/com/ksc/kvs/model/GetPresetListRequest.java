package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kvs.model.transform.GetPresetListRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class GetPresetListRequest extends KscWebServiceRequest implements DryRunSupportedRequest<GetPresetListRequest> {

	private int withDetail;

	private String presettype;

	private String presetType;

	private String preset;
	
	private String presets;

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

	public Request<GetPresetListRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetPresetListRequest> request = new GetPresetListRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

	public String getPresetType() {
		return presetType;
	}

	public void setPresetType(String presetType) {
		this.presetType = presetType;
	}

	public String getPresets() {
		return presets;
	}

	public void setPresets(String presets) {
		this.presets = presets;
	}

}
