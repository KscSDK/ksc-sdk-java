package com.ksc.ket.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.ket.model.transform.QueryDirectorTaskRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

public class QueryDirectorTaskRequest extends KscWebServiceRequest
		implements DryRunSupportedRequest<QueryDirectorTaskRequest> {
	private String app = "";
	private String uniqName = "";
	private String taskID = "";

	public Request<QueryDirectorTaskRequest> getDryRunRequest() {
		// TODO Auto-generated method stub
		Request<QueryDirectorTaskRequest> request = new QueryDirectorTaskRequestMarshaller().marshall(this);
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
