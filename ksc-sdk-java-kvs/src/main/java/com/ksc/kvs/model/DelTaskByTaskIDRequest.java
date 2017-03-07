package com.ksc.kvs.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.kvs.model.transform.PresetRequestMarshaller;
import com.ksc.kvs.model.transform.DelTaskByTaskIDRequestMarshaller;

public class DelTaskByTaskIDRequest extends KscWebServiceRequest
implements DryRunSupportedRequest<DelTaskByTaskIDRequest>{
	
	private String TaskID;


	public String getTaskID() {
		return TaskID;
	}

	public void setTaskID(String taskID) {
		TaskID = taskID;
	}


	public Request<DelTaskByTaskIDRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<DelTaskByTaskIDRequest> request = new DelTaskByTaskIDRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

}
