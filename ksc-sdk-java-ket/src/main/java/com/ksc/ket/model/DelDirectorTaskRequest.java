package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.DelDirectorTaskRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class DelDirectorTaskRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<DelDirectorTaskRequest> {
	private String app = "";
	private String uniqName = "";
	private String taskID = "";

	public Request<DelDirectorTaskRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<DelDirectorTaskRequest> request = new DelDirectorTaskRequestMarshaller().marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return null;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getUniqName() {
		return uniqName;
	}

	public void setUniqName(String uniqName) {
		this.uniqName = uniqName;
	}

	public String getTaskID() {
		return taskID;
	}

	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
}
