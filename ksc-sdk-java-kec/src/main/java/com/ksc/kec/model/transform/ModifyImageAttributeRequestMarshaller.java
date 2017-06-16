package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.ModifyImageAttributeRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyImageAttributeRequestMarshaller 
             implements Marshaller<Request<ModifyImageAttributeRequest>, ModifyImageAttributeRequest>{
	
	@Override
	public Request<ModifyImageAttributeRequest> marshall(ModifyImageAttributeRequest modifyImageAttributeRequest){
		 if (modifyImageAttributeRequest == null) {
	            throw new KscClientException(
	                    "Invalid argument passed to marshall(...)");
	        }

	        Request<ModifyImageAttributeRequest> request = new DefaultRequest<ModifyImageAttributeRequest>(
	        		modifyImageAttributeRequest, "kec");
	        request.addParameter("Action", "ModifyImageAttribute");
	        String version=modifyImageAttributeRequest.getVersion();
	        if(org.apache.commons.lang.StringUtils.isBlank(version)){
	        	version="2016-03-04";
	        }
	        request.addParameter("Version", version);
	        request.setHttpMethod(HttpMethodName.GET);

	        if(modifyImageAttributeRequest.getImageId() != null){
	        	request.addParameter("ImageId", 
	        			StringUtils.fromString(modifyImageAttributeRequest.getImageId()));
	        }
	        
	        if(modifyImageAttributeRequest.getName() != null){
	        	request.addParameter("Name", 
                        StringUtils.fromString(modifyImageAttributeRequest.getName()));
	        }

	        return request;
	}
}
