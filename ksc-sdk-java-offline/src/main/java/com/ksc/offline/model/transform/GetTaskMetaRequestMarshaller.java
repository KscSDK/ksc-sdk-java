package com.ksc.offline.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.offline.model.GetTaskByTaskIDRequest;
import com.ksc.offline.model.GetTaskMetaRequest;
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
						getTaskMetaRequest, "offline");
				
		        request.addParameter("Action","GetTaskMetaInfo");
		        String version=getTaskMetaRequest.getVersion();
		        if(org.apache.commons.lang.StringUtils.isBlank(version)){
		        	version="2016-09-19";
		        }
		        request.addParameter("Version", version);
		        if(!getTaskMetaRequest.getTaskid().equals("")){
		        	request.addParameter("taskid", StringUtils.fromString(getTaskMetaRequest.getTaskid()));
		        }
		        
		        request.setHttpMethod(HttpMethodName.GET);
		        
		        if(getTaskMetaRequest.getStartdate()!=-1){
			        request.addParameter("startdate", StringUtils.fromInteger(getTaskMetaRequest.getStartdate()));
		        }
		        if(getTaskMetaRequest.getEnddate()!=-1){
			        request.addParameter("enddate", StringUtils.fromInteger(getTaskMetaRequest.getEnddate()));
		        }
		        if(getTaskMetaRequest.getMarker()!=-1){
			        request.addParameter("marker", StringUtils.fromInteger(getTaskMetaRequest.getMarker()));
		        }
		        if(getTaskMetaRequest.getLimit()!=-1){
			        request.addParameter("limit", StringUtils.fromInteger(getTaskMetaRequest.getLimit()));

		        }
		       
		        
				return request;
	}
	
}
