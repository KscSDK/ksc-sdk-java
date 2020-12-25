package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyNetworkInterfaceAttributeRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyNetworkInterfaceAttributeRequestMarshaller implements
        Marshaller<Request<ModifyNetworkInterfaceAttributeRequest>, ModifyNetworkInterfaceAttributeRequest> {

    @Override
    public Request<ModifyNetworkInterfaceAttributeRequest> marshall(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) {
        if (modifyNetworkInterfaceAttributeRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyNetworkInterfaceAttributeRequest> request = new DefaultRequest<ModifyNetworkInterfaceAttributeRequest>(
                modifyNetworkInterfaceAttributeRequest, "epc");
        request.addParameter("Action", "ModifyNetworkInterfaceAttribute");
        String version = modifyNetworkInterfaceAttributeRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<String> securityGroupIds = (com.ksc.internal.SdkInternalList<String>) modifyNetworkInterfaceAttributeRequest
				.getSecurityGroupIds();
		    if (securityGroupIds != null && (!securityGroupIds.isEmpty() || !securityGroupIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : securityGroupIds) {
				if (value != null) {
					request.addParameter("SecurityGroupId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(modifyNetworkInterfaceAttributeRequest.getNetworkInterfaceId())) {
            request.addParameter("NetworkInterfaceId", modifyNetworkInterfaceAttributeRequest.getNetworkInterfaceId());
        }
        if (!StringUtils.isNullOrEmpty(modifyNetworkInterfaceAttributeRequest.getSubnetId())) {
            request.addParameter("SubnetId", modifyNetworkInterfaceAttributeRequest.getSubnetId());
        }
        if (!StringUtils.isNullOrEmpty(modifyNetworkInterfaceAttributeRequest.getIpAddress())) {
            request.addParameter("IpAddress", modifyNetworkInterfaceAttributeRequest.getIpAddress());
        }
        if (!StringUtils.isNullOrEmpty(modifyNetworkInterfaceAttributeRequest.getHostId())) {
            request.addParameter("HostId", modifyNetworkInterfaceAttributeRequest.getHostId());
        }

        return request;
    }
}