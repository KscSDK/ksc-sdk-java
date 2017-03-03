package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.TaskRequestMarshaller;
import com.ksc.offline.model.transform.TopTaskByTaskIDRequestMarshaller;

public class TopTaskByTaskIDRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<TopTaskByTaskIDRequest>{
	
	private String taskid;

	
	
	public String getTaskid() {
		return taskid;
	}



	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}



	public Request<TopTaskByTaskIDRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<TopTaskByTaskIDRequest> request = new TopTaskByTaskIDRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
