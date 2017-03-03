package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.GetTaskListRequest;
import com.ksc.kvs.model.TopTaskByTaskIDRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetTaskListRequestMarshaller implements Marshaller<Request<GetTaskListRequest>, GetTaskListRequest>{
	
	public Request<GetTaskListRequest> marshall(GetTaskListRequest getTaskListRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if (getTaskListRequest == null) {
		            throw new KscClientException(
		                    "Invalid argument passed to marshall(...)");
		        }

				Request<GetTaskListRequest> request = new DefaultRequest<GetTaskListRequest>(
						getTaskListRequest, "kvs");
				
		        request.addParameter("Action","GetTaskList");
		        String version=getTaskListRequest.getVersion();
		        if(org.apache.commons.lang.StringUtils.isBlank(version)){
		        	version="2017-01-01";
		        }
		        request.addParameter("Version", version);
		        request.setHttpMethod(HttpMethodName.GET);
		        
		        if(getTaskListRequest.getStartDate()!=-1){
			        request.addParameter("StartDate", StringUtils.fromInteger(getTaskListRequest.getStartDate()));
		        }
		        if(getTaskListRequest.getEndDate()!=-1){
			        request.addParameter("EndDate", StringUtils.fromInteger(getTaskListRequest.getEndDate()));
		        }
		        if(getTaskListRequest.getMarker()!=-1){
			        request.addParameter("Marker", StringUtils.fromInteger(getTaskListRequest.getMarker()));
		        }
		        if(getTaskListRequest.getLimit()!=-1){
			        request.addParameter("Limit", StringUtils.fromInteger(getTaskListRequest.getLimit()));
		        }
		        
				return request;
	}

}
