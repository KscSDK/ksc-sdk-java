package com.ksc.offline.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.TaskRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class TaskRequestMarshaller implements Marshaller<Request<TaskRequest>, TaskRequest> {

	public Request<TaskRequest> marshall(TaskRequest taskRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (taskRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<TaskRequest> request = new DefaultRequest<TaskRequest>(taskRequest, "offline");

		request.addParameter("Action", "DelTaskByTaskID");
		String version = taskRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-09-19";
		}
		request.addParameter("Version", version);
		if (!taskRequest.getTaskid().isEmpty()) {
			request.addParameter("taskid", StringUtils.fromString(taskRequest.getTaskid()));
		}
		request.setHttpMethod(HttpMethodName.GET);
		return request;
	}

}
