package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.AttachNetworkInterfaceRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class AttachNetworkInterfaceRequestMarshaller implements
        Marshaller<Request<AttachNetworkInterfaceRequest>, AttachNetworkInterfaceRequest> {

    public Request<AttachNetworkInterfaceRequest> marshall(
    		AttachNetworkInterfaceRequest attachNetworkInterfaceRequest) {

        if (attachNetworkInterfaceRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AttachNetworkInterfaceRequest> request = new DefaultRequest<AttachNetworkInterfaceRequest>(
        		attachNetworkInterfaceRequest, "kec");
        request.addParameter("Action", "AttachNetworkInterface");
        String version=attachNetworkInterfaceRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> securityGroupIdsList = (com.ksc.internal.SdkInternalList<String>) attachNetworkInterfaceRequest
                .getSecurityGroupIds();
        if (!securityGroupIdsList.isEmpty() || !securityGroupIdsList.isAutoConstruct()) {
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupId." + securityGroupIdsListIndex,
                            StringUtils.fromString(securityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }
        
        if(attachNetworkInterfaceRequest.getInstanceId() != null){
        	request.addParameter("InstanceId", 
        			StringUtils.fromString(attachNetworkInterfaceRequest.getInstanceId()));
        }
        
        if(attachNetworkInterfaceRequest.getSubnetId()!= null){
        	request.addParameter("SubnetId", 
                    StringUtils.fromString(attachNetworkInterfaceRequest.getSubnetId()));
        }
        
        if(attachNetworkInterfaceRequest.getPrivateIpAddress()!= null){
        	request.addParameter("PrivateIpAddress", 
                    StringUtils.fromString(attachNetworkInterfaceRequest.getPrivateIpAddress()));
        }

        return request;
    }

}
