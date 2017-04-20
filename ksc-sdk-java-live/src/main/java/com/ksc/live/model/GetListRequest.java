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

	private  String pubhost;

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

	public String getPubhost() {
		return pubhost;
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

	public void setPubhost(String pubhost) {
		this.pubhost = pubhost;
	}

//	public Request<GetListRequest> getDryRunRequest() {
//		Request<GetListRequest> request = new GetListRequestMarshaller()
//				.marshall(this);
//		request.addParameter("DryRun", Boolean.toString(true));
//		return null;
//	}


}
