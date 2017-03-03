package com.ksc.kvs.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.json.JSONObject;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.kvs.model.transform.PresetRequestMarshaller;
import com.ksc.util.json.Jackson;

public class PresetRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<PresetRequest>{
	
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Request<PresetRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<PresetRequest> request = new PresetRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	
}
