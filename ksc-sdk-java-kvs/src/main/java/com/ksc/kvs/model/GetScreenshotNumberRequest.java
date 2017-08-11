package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kvs.model.transform.GetScreenshotNumberRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class GetScreenshotNumberRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<GetScreenshotNumberRequest> {

	private int StartUnixTime;
	private int EndUnixTime;
	private int Granularity;
	private int ResultType;

	public Request<GetScreenshotNumberRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetScreenshotNumberRequest> request = new GetScreenshotNumberRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

	public int getStartUnixTime() {
		return StartUnixTime;
	}

	public void setStartUnixTime(int startUnixTime) {
		StartUnixTime = startUnixTime;
	}

	public int getEndUnixTime() {
		return EndUnixTime;
	}

	public void setEndUnixTime(int endUnixTime) {
		EndUnixTime = endUnixTime;
	}

	public int getGranularity() {
		return Granularity;
	}

	public void setGranularity(int granularity) {
		Granularity = granularity;
	}

	public int getResultType() {
		return ResultType;
	}

	public void setResultType(int resultType) {
		ResultType = resultType;
	}

}
