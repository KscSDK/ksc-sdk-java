package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.RemoveImagesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class RemoveImagesRequestMarshaller 
       implements Marshaller<Request<RemoveImagesRequest>, RemoveImagesRequest>{

	@Override
	public Request<RemoveImagesRequest> marshall(RemoveImagesRequest removeImagesRequest){
		 if (removeImagesRequest == null) {
	            throw new KscClientException(
	                    "Invalid argument passed to marshall(...)");
	        }

	        Request<RemoveImagesRequest> request = new DefaultRequest<RemoveImagesRequest>(
	        		removeImagesRequest, "kec");
	        request.addParameter("Action", "RemoveImages");
	        String version=removeImagesRequest.getVersion();
	        if(org.apache.commons.lang.StringUtils.isBlank(version)){
	        	version="2016-03-04";
	        }
	        request.addParameter("Version", version);
	        request.setHttpMethod(HttpMethodName.GET);

	        if(removeImagesRequest.getImageId() != null){
	        	request.addParameter("ImageId", 
	        			StringUtils.fromString(removeImagesRequest.getImageId()));
	        }
	        
	        return request;
	}

}
