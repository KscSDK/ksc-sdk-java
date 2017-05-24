package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.GetTaskListRequestMarshaller;

public class GetTaskListRequest extends KscWebServiceRequest implements DryRunSupportedRequest<GetTaskListRequest> {

	private int startdate;

	private int enddate;

	private int marker;

	private int limit;

	public GetTaskListRequest() {
		marker = -1;
		limit = -1;
		startdate = -1;
		enddate = -1;
	}

	public int getStartdate() {
		return startdate;
	}

	public void setStartdate(int startdate) {
		this.startdate = startdate;
	}

	public int getEnddate() {
		return enddate;
	}

	public void setEnddate(int enddate) {
		this.enddate = enddate;
	}

	public int getMarker() {
		return marker;
	}

	public void setMarker(int marker) {
		this.marker = marker;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public Request<GetTaskListRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetTaskListRequest> request = new GetTaskListRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
