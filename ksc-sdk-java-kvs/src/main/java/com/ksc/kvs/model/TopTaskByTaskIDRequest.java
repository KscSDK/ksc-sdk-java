package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.DelTaskByTaskIDRequestMarshaller;
import com.ksc.kvs.model.transform.TopTaskByTaskIDRequestMarshaller;

public class TopTaskByTaskIDRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<TopTaskByTaskIDRequest>{
	
	private String TaskID;
	
	
	public String getTaskID() {
		return TaskID;
	}


	public void setTaskID(String taskID) {
		TaskID = taskID;
	}





	public Request<TopTaskByTaskIDRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<TopTaskByTaskIDRequest> request = new TopTaskByTaskIDRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
