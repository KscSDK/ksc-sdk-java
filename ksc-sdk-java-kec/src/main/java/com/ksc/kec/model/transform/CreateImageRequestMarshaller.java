package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.CreateImageRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * 创建镜像
 *
 */
public class CreateImageRequestMarshaller 
       implements Marshaller<Request<CreateImageRequest>, CreateImageRequest>{

	@Override
	public Request<CreateImageRequest> marshall(CreateImageRequest createImageRequest){
		 if (createImageRequest == null) {
	            throw new KscClientException(
	                    "Invalid argument passed to marshall(...)");
	        }

	        Request<CreateImageRequest> request = new DefaultRequest<CreateImageRequest>(
	        		createImageRequest, "kec");
	        request.addParameter("Action", "CreateImage");
	        String version=createImageRequest.getVersion();
	        if(org.apache.commons.lang.StringUtils.isBlank(version)){
	        	version="2016-03-04";
	        }
	        request.addParameter("Version", version);
	        request.setHttpMethod(HttpMethodName.GET);

	        if(createImageRequest.getInstanceId() != null){
	        	request.addParameter("InstanceId", 
	        			StringUtils.fromString(createImageRequest.getInstanceId()));
	        }
	        
	        if(createImageRequest.getName() != null){
	        	request.addParameter("Name", 
                        StringUtils.fromString(createImageRequest.getName()));
	        }

	        return request;
	}

}
