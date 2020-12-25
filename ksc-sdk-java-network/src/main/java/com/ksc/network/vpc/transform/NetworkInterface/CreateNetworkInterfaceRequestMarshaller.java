package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkInterface.CreateNetworkInterfaceRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateNetworkInterfaceRequestMarshaller implements
        Marshaller<Request<CreateNetworkInterfaceRequest>, CreateNetworkInterfaceRequest> {

    @Override
    public Request<CreateNetworkInterfaceRequest> marshall(CreateNetworkInterfaceRequest createNetworkInterfaceRequest) {
        if (createNetworkInterfaceRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNetworkInterfaceRequest> request = new DefaultRequest<CreateNetworkInterfaceRequest>(
                createNetworkInterfaceRequest, "vpc");
        request.addParameter("Action", "CreateNetworkInterface");
        String version = createNetworkInterfaceRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createNetworkInterfaceRequest.getSubnetId())) {
            request.addParameter("SubnetId", createNetworkInterfaceRequest.getSubnetId());
        }
        if (!StringUtils.isNullOrEmpty(createNetworkInterfaceRequest.getPrivateIpAddress())) {
            request.addParameter("PrivateIpAddress", createNetworkInterfaceRequest.getPrivateIpAddress());
        }
        com.ksc.internal.SdkInternalList<String> securityGroupIds = (com.ksc.internal.SdkInternalList<String>) createNetworkInterfaceRequest
                .getSecurityGroupIds();
        if (securityGroupIds != null && (!securityGroupIds.isEmpty() || !securityGroupIds.isAutoConstruct())) {
            int index = 1;

            for (String value : securityGroupIds) {
                if (value != null) {
                    request.addParameter("SecurityGroupId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }

        return request;
    }
}