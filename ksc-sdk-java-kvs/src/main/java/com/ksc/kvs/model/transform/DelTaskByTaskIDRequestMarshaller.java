package com.ksc.kvs.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.DelTaskByTaskIDRequest;
import com.ksc.kvs.model.PresetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DelTaskByTaskIDRequestMarshaller implements Marshaller<Request<DelTaskByTaskIDRequest>, DelTaskByTaskIDRequest>{
	
	public Request<DelTaskByTaskIDRequest> marshall(DelTaskByTaskIDRequest taskRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if (taskRequest == null) {
		            throw new KscClientException(
		                    "Invalid argument passed to marshall(...)");
		        }
				
				Request<DelTaskByTaskIDRequest> request = new DefaultRequest<DelTaskByTaskIDRequest>(
						taskRequest, "kvs");
				
		        request.addParameter("Action","DelTaskByTaskID");
		        String version=taskRequest.getVersion();
		        if(org.apache.commons.lang.StringUtils.isBlank(version)){
		        	version="2017-01-01";
		        }
		        request.addParameter("Version", version);
		        if(!taskRequest.getTaskID().isEmpty()){
		        	request.addParameter("TaskID", StringUtils.fromString(taskRequest.getTaskID()));
		        }
		        request.setHttpMethod(HttpMethodName.GET);
				return request;
	}

}
