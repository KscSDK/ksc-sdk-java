package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.GetTaskListRequestMarshaller;

public class GetTaskListRequest extends KscWebServiceRequest implements DryRunSupportedRequest<GetTaskListRequest> {

	private int StartDate;

	private int EndDate;

	private int Marker;

	private int Limit;

	public int getStartDate() {
		return StartDate;
	}

	public void setStartDate(int startDate) {
		StartDate = startDate;
	}

	public int getEndDate() {
		return EndDate;
	}

	public void setEndDate(int endDate) {
		EndDate = endDate;
	}

	public int getMarker() {
		return Marker;
	}

	public void setMarker(int marker) {
		Marker = marker;
	}

	public int getLimit() {
		return Limit;
	}

	public void setLimit(int limit) {
		Limit = limit;
	}

	public GetTaskListRequest() {
		Marker = -1;
		Limit = -1;
		StartDate = -1;
		EndDate = -1;
	}

	public Request<GetTaskListRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetTaskListRequest> request = new GetTaskListRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
