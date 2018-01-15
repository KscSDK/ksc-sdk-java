package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeInstanceVncRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeInstanceVncRequestMarshaller 
       implements Marshaller<Request<DescribeInstanceVncRequest>, DescribeInstanceVncRequest>{
	
	@Override
	public Request<DescribeInstanceVncRequest> marshall(DescribeInstanceVncRequest describeInstanceVncRequest){
		 if (describeInstanceVncRequest == null) {
	            throw new KscClientException(
	                    "Invalid argument passed to marshall(...)");
	        }

	        Request<DescribeInstanceVncRequest> request = new DefaultRequest<DescribeInstanceVncRequest>(
	        		describeInstanceVncRequest, "kec");
	        request.addParameter("Action", "DescribeInstanceVnc");
	        String version=describeInstanceVncRequest.getVersion();
	        if(org.apache.commons.lang.StringUtils.isBlank(version)){
	        	version="2016-03-04";
	        }
	        request.addParameter("Version", version);
	        request.setHttpMethod(HttpMethodName.GET);

	        if(describeInstanceVncRequest.getInstanceId() != null){
	        	request.addParameter("InstanceId", 
	        			StringUtils.fromString(describeInstanceVncRequest.getInstanceId()));
	        }
	        
	        return request;
	}

}
