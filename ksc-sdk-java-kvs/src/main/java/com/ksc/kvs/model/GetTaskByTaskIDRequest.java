package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.GetTaskByTaskIDRequestMarshaller;
import com.ksc.kvs.model.transform.DelTaskByTaskIDRequestMarshaller;

public class GetTaskByTaskIDRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<GetTaskByTaskIDRequest>{
	
	private String TaskID;

	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}




	public Request<GetTaskByTaskIDRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<GetTaskByTaskIDRequest> request = new GetTaskByTaskIDRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
