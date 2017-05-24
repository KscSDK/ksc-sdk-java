package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.ModifyInstanceImageRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyInstanceImageRequestMarshaller 
       implements Marshaller<Request<ModifyInstanceImageRequest>, ModifyInstanceImageRequest>{
	
	@Override
	public Request<ModifyInstanceImageRequest> marshall(ModifyInstanceImageRequest modifyInstanceImageRequest){
		 if (modifyInstanceImageRequest == null) {
	            throw new KscClientException(
	                    "Invalid argument passed to marshall(...)");
	        }

	        Request<ModifyInstanceImageRequest> request = new DefaultRequest<ModifyInstanceImageRequest>(
	        		modifyInstanceImageRequest, "kec");
	        request.addParameter("Action", "ModifyInstanceImage");
	        String version=modifyInstanceImageRequest.getVersion();
	        if(org.apache.commons.lang.StringUtils.isBlank(version)){
	        	version="2016-03-04";
	        }
	        request.addParameter("Version", version);
	        request.setHttpMethod(HttpMethodName.GET);

	        if(modifyInstanceImageRequest.getInstanceId() != null){
	        	request.addParameter("InstanceId", 
	        			StringUtils.fromString(modifyInstanceImageRequest.getInstanceId()));
	        }
	        
	        if(modifyInstanceImageRequest.getImageId() != null){
	        	request.addParameter("ImageId", 
                        StringUtils.fromString(modifyInstanceImageRequest.getImageId()));
	        }
	        
	        if(modifyInstanceImageRequest.getInstancePassword() != null){
	        	request.addParameter("InstancePassword", 
                        StringUtils.fromString(modifyInstanceImageRequest.getInstancePassword()));
	        }

	        return request;
	}

}
