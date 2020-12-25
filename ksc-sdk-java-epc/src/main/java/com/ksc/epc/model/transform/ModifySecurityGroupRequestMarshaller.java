package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifySecurityGroupRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifySecurityGroupRequestMarshaller implements
        Marshaller<Request<ModifySecurityGroupRequest>, ModifySecurityGroupRequest> {

    @Override
    public Request<ModifySecurityGroupRequest> marshall(ModifySecurityGroupRequest modifySecurityGroupRequest) {
        if (modifySecurityGroupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySecurityGroupRequest> request = new DefaultRequest<ModifySecurityGroupRequest>(
                modifySecurityGroupRequest, "epc");
        request.addParameter("Action", "ModifySecurityGroup");
        String version = modifySecurityGroupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifySecurityGroupRequest.getNetworkInterfaceId())) {
            request.addParameter("NetworkInterfaceId", modifySecurityGroupRequest.getNetworkInterfaceId());
        }
            com.ksc.internal.SdkInternalList<String> securityGroupIds = (com.ksc.internal.SdkInternalList<String>) modifySecurityGroupRequest
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
        if (!StringUtils.isNullOrEmpty(modifySecurityGroupRequest.getHostId())) {
            request.addParameter("HostId", modifySecurityGroupRequest.getHostId());
        }

        return request;
    }
}