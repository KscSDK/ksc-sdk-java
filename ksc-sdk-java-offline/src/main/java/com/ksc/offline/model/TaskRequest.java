package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.PresetRequestMarshaller;
import com.ksc.offline.model.transform.TaskRequestMarshaller;

public class TaskRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<TaskRequest>{
	
	private String taskid;

	
	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}



	public Request<TaskRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<TaskRequest> request = new TaskRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
