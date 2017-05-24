package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.GetTaskByTaskIDRequestMarshaller;

public class GetTaskByTaskIDRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<GetTaskByTaskIDRequest> {

	private String taskid;

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public Request<GetTaskByTaskIDRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetTaskByTaskIDRequest> request = new GetTaskByTaskIDRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
