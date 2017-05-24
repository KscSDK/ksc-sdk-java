package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.GetLoopListRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class GetLoopListRequest extends KscWebServiceRequest implements DryRunSupportedRequest<GetLoopListRequest> {
	private String app = "";
	private String uniqName = "";
	private String streamID = "";

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

	public Request<GetLoopListRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetLoopListRequest> request = new GetLoopListRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

	public String getStreamID() {
		return streamID;
	}

	public void setStreamID(String streamID) {
		this.streamID = streamID;
	}
}
