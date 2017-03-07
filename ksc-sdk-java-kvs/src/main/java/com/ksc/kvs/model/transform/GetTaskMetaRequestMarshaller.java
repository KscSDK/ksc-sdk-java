package com.ksc.kvs.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kvs.model.GetTaskByTaskIDRequest;
import com.ksc.kvs.model.GetTaskMetaRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetTaskMetaRequestMarshaller implements Marshaller<Request<GetTaskMetaRequest>, GetTaskMetaRequest>{
	public Request<GetTaskMetaRequest> marshall(GetTaskMetaRequest getTaskMetaRequest) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if (getTaskMetaRequest == null) {
		            throw new KscClientException(
		                    "Invalid argument passed to marshall(...)");
		        }
				
				Request<GetTaskMetaRequest> request = new DefaultRequest<GetTaskMetaRequest>(
						getTaskMetaRequest, "kvs");
				
		        request.addParameter("Action","GetTaskMetaInfo");
		        String version=getTaskMetaRequest.getVersion();
		        if(org.apache.commons.lang.StringUtils.isBlank(version)){
		        	version="2017-01-01";
		        }
		        request.addParameter("Version", version);
		        if(!getTaskMetaRequest.getTaskID().equals("")){
		        	request.addParameter("TaskID", StringUtils.fromString(getTaskMetaRequest.getTaskID()));
		        }
		        
		        request.setHttpMethod(HttpMethodName.GET);
		        
		        if(getTaskMetaRequest.getStartDate()!=-1){
			        request.addParameter("StartDate", StringUtils.fromInteger(getTaskMetaRequest.getStartDate()));
		        }
		        if(getTaskMetaRequest.getEndDate()!=-1){
			        request.addParameter("EndDate", StringUtils.fromInteger(getTaskMetaRequest.getEndDate()));
		        }
		        if(getTaskMetaRequest.getMarker()!=-1){
			        request.addParameter("Marker", StringUtils.fromInteger(getTaskMetaRequest.getMarker()));
		        }
		        if(getTaskMetaRequest.getLimit()!=-1){
			        request.addParameter("Limit", StringUtils.fromInteger(getTaskMetaRequest.getLimit()));

		        }
		       
		        
				return request;
	}
	
}
