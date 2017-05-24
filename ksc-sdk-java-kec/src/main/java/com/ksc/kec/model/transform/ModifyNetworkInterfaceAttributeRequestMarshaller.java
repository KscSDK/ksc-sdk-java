package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.ModifyNetworkInterfaceAttributeRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class ModifyNetworkInterfaceAttributeRequestMarshaller implements
        Marshaller<Request<ModifyNetworkInterfaceAttributeRequest>, ModifyNetworkInterfaceAttributeRequest> {

    public Request<ModifyNetworkInterfaceAttributeRequest> marshall(
    		ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) {

        if (modifyNetworkInterfaceAttributeRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyNetworkInterfaceAttributeRequest> request = new DefaultRequest<ModifyNetworkInterfaceAttributeRequest>(
        		modifyNetworkInterfaceAttributeRequest, "kec");
        request.addParameter("Action", "ModifyNetworkInterfaceAttribute");
        String version=modifyNetworkInterfaceAttributeRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> securityGroupIdsList = (com.ksc.internal.SdkInternalList<String>) modifyNetworkInterfaceAttributeRequest
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
        
        if(modifyNetworkInterfaceAttributeRequest.getInstanceId() != null){
        	request.addParameter("InstanceId", 
        			StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getInstanceId()));
        }
        
        if(modifyNetworkInterfaceAttributeRequest.getSubnetId()!= null){
        	request.addParameter("SubnetId", 
                    StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getSubnetId()));
        }
        
        if(modifyNetworkInterfaceAttributeRequest.getPrivateIpAddress()!= null){
        	request.addParameter("PrivateIpAddress", 
                    StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getPrivateIpAddress()));
        }
        
        if(modifyNetworkInterfaceAttributeRequest.getNetworkInterfaceId() != null){
        	request.addParameter("NetworkInterfaceId", 
        			StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getNetworkInterfaceId()));
        }
        
        if(modifyNetworkInterfaceAttributeRequest.getDNS1()!= null){
        	request.addParameter("DNS1", 
                    StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getDNS1()));
        }
        
        if(modifyNetworkInterfaceAttributeRequest.getDNS2()!= null){
        	request.addParameter("DNS2", 
                    StringUtils.fromString(modifyNetworkInterfaceAttributeRequest.getDNS2()));
        }

        return request;
    }

}
