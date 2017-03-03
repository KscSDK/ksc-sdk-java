package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.GetTaskByTaskIDRequestMarshaller;
import com.ksc.kvs.model.transform.GetTaskMetaRequestMarshaller;

public class GetTaskMetaRequest  extends KscWebServiceRequest
implements DryRunSupportedRequest<GetTaskMetaRequest>{
	private String TaskID = "";
	
	private int StartDate;
	
	private int EndDate;
	
	private int Marker;
	
	private int Limit;
	
	public GetTaskMetaRequest(){
		Marker = -1;
		Limit = -1;
		StartDate = -1;
		EndDate = -1;
	}

	@Override
	public Request<GetTaskMetaRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetTaskMetaRequest> request = new GetTaskMetaRequestMarshaller()
						.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}

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
	
	
}
