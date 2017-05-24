package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.ModifyInstanceTypeRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyInstanceTypeRequestMarshaller implements
       Marshaller<Request<ModifyInstanceTypeRequest>, ModifyInstanceTypeRequest>{
	
	public Request<ModifyInstanceTypeRequest> marshall(
			ModifyInstanceTypeRequest modifyInstanceTypeRequest) {

        if (modifyInstanceTypeRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstanceTypeRequest> request = new DefaultRequest<ModifyInstanceTypeRequest>(
        		modifyInstanceTypeRequest, "kec");
        request.addParameter("Action", "ModifyInstanceType");
        String version=modifyInstanceTypeRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if(modifyInstanceTypeRequest.getInstanceId() != null){
        	request.addParameter("InstanceId", 
                    StringUtils.fromString(modifyInstanceTypeRequest.getInstanceId()));
        }
        
        if(modifyInstanceTypeRequest.getInstanceId() != null){
        	request.addParameter("InstanceType", 
                    StringUtils.fromString(modifyInstanceTypeRequest.getInstanceType()));
        }
        
        if(modifyInstanceTypeRequest.getDataDiskGb() != null){
        	request.addParameter("DataDiskGb", 
                    StringUtils.fromInteger(modifyInstanceTypeRequest.getDataDiskGb()));
        }
        
        return request;
    }

}
