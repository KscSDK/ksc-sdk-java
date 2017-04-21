package com.ksc.live.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.live.model.transform.GetListRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class GetListRequest extends KscWebServiceRequest {
	
	private String uniquename;
	
	private int marker;

	private int limit;

	private String app;

	private  String pubdomain;

	public String getUniquename() {
		return uniquename;
	}

	public int getMarker() {
		return marker;
	}

	public int getLimit() {
		return limit;
	}

	public String getApp() {
		return app;
	}

	public String getPubdomain() {
		return pubdomain;
	}

	public void setPubdomain(String pubdomain) {
		this.pubdomain = pubdomain;
	}

	public void setUniquename(String uniquename) {
		this.uniquename = uniquename;
	}

	public void setMarker(int marker) {
		this.marker = marker;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void setApp(String app) {
		this.app = app;
	}


}
