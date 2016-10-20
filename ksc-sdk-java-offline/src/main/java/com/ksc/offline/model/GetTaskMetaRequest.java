package com.ksc.offline.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.offline.model.transform.GetTaskByTaskIDRequestMarshaller;
import com.ksc.offline.model.transform.GetTaskMetaRequestMarshaller;

public class GetTaskMetaRequest  extends KscWebServiceRequest
implements DryRunSupportedRequest<GetTaskMetaRequest>{
	private String taskid;

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
