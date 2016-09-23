package com.ksc.offline.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.GetTaskByTaskIDRequest;
import com.ksc.offline.model.TaskRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetTaskByTaskIDRequestMarshaller implements Marshaller<Request<GetTaskByTaskIDRequest>, GetTaskByTaskIDRequest>{
	
	public Request<GetTaskByTaskIDRequest> marshall(GetTaskByTaskIDRequest getTaskByTaskIDRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if (getTaskByTaskIDRequest == null) {
		            throw new KscClientException(
		                    "Invalid argument passed to marshall(...)");
		        }
				
				Request<GetTaskByTaskIDRequest> request = new DefaultRequest<GetTaskByTaskIDRequest>(
						getTaskByTaskIDRequest, "offline");
				
		        request.addParameter("Action","GetTaskByTaskID");
		        String version=getTaskByTaskIDRequest.getVersion();
		        if(org.apache.commons.lang.StringUtils.isBlank(version)){
		        	version="2016-09-19";
		        }
		        request.addParameter("Version", version);
		        if(!getTaskByTaskIDRequest.getTaskid().isEmpty()){
		        	request.addParameter("taskid", StringUtils.fromString(getTaskByTaskIDRequest.getTaskid()));
		        }
		        request.setHttpMethod(HttpMethodName.GET);
				return request;
	}
}
