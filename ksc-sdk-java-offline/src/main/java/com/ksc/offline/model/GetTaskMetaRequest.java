package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.GetTaskByTaskIDRequestMarshaller;
import com.ksc.offline.model.transform.GetTaskMetaRequestMarshaller;

public class GetTaskMetaRequest  extends KscWebServiceRequest
implements DryRunSupportedRequest<GetTaskMetaRequest>{
	private String taskid = "";
	
	private int startdate;
	
	private int enddate;
	
	private int marker;
	
	private int limit;
	
	public GetTaskMetaRequest(){
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

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	@Override
	public Request<GetTaskMetaRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetTaskMetaRequest> request = new GetTaskMetaRequestMarshaller()
						.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}
	
	
}
