package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.GetStreamTranListRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class GetStreamTranListRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<GetStreamTranListRequest> {
	private String app = "";
	private String uniqName = "";
	private String streamID = "";
	private int OutPull;

	public Request<GetStreamTranListRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetStreamTranListRequest> request = new GetStreamTranListRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
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

	public String getStreamID() {
		return streamID;
	}

	public void setStreamID(String streamID) {
		this.streamID = streamID;
	}

	public int getOutPull() {
		return OutPull;
	}

	public void setOutPull(int outPull) {
		OutPull = outPull;
	}

}
