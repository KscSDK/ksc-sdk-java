package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DetachNetworkInterfaceRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class DetachNetworkInterfaceRequestMarshaller implements
        Marshaller<Request<DetachNetworkInterfaceRequest>, DetachNetworkInterfaceRequest> {

    public Request<DetachNetworkInterfaceRequest> marshall(
    		DetachNetworkInterfaceRequest detachNetworkInterfaceRequest) {

        if (detachNetworkInterfaceRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DetachNetworkInterfaceRequest> request = new DefaultRequest<DetachNetworkInterfaceRequest>(
        		detachNetworkInterfaceRequest, "kec");
        request.addParameter("Action", "DetachNetworkInterface");
        String version=detachNetworkInterfaceRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if(detachNetworkInterfaceRequest.getInstanceId() != null){
        	request.addParameter("InstanceId", 
        			StringUtils.fromString(detachNetworkInterfaceRequest.getInstanceId()));
        }
        
        if(detachNetworkInterfaceRequest.getNetworkInterfaceId()!= null){
        	request.addParameter("NetworkInterfaceId", 
                    StringUtils.fromString(detachNetworkInterfaceRequest.getNetworkInterfaceId()));
        }

        return request;
    }

}
