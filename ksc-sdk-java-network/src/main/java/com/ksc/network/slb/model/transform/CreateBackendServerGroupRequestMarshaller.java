package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.CreateBackendServerGroupRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateBackendServerGroupRequestMarshaller implements
        Marshaller<Request<CreateBackendServerGroupRequest>, CreateBackendServerGroupRequest> {

    @Override
    public Request<CreateBackendServerGroupRequest> marshall(CreateBackendServerGroupRequest createBackendServerGroupRequest) {
        if (createBackendServerGroupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateBackendServerGroupRequest> request = new DefaultRequest<CreateBackendServerGroupRequest>(
                createBackendServerGroupRequest, "slb");
        request.addParameter("Action", "CreateBackendServerGroup");
        String version = createBackendServerGroupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createBackendServerGroupRequest.getBackendServerGroupName())) {
            request.addParameter("BackendServerGroupName", createBackendServerGroupRequest.getBackendServerGroupName());
        }
        if (!StringUtils.isNullOrEmpty(createBackendServerGroupRequest.getVpcId())) {
            request.addParameter("VpcId", createBackendServerGroupRequest.getVpcId());
        }
        if (!StringUtils.isNullOrEmpty(createBackendServerGroupRequest.getBackendServerGroupType())) {
            request.addParameter("BackendServerGroupType", createBackendServerGroupRequest.getBackendServerGroupType());
        }
        if (createBackendServerGroupRequest.getTimeout() != null) {
            request.addParameter("Timeout", String.valueOf(createBackendServerGroupRequest.getTimeout()));
        }
        if (createBackendServerGroupRequest.getInterval() != null) {
            request.addParameter("Interval", String.valueOf(createBackendServerGroupRequest.getInterval()));
        }
        if (createBackendServerGroupRequest.getHealthyThreshold() != null) {
            request.addParameter("HealthyThreshold", String.valueOf(createBackendServerGroupRequest.getHealthyThreshold()));
        }
        if (createBackendServerGroupRequest.getUnhealthyThreshold() != null) {
            request.addParameter("UnhealthyThreshold", String.valueOf(createBackendServerGroupRequest.getUnhealthyThreshold()));
        }
        if (!StringUtils.isNullOrEmpty(createBackendServerGroupRequest.getUrlPath())) {
            request.addParameter("UrlPath", createBackendServerGroupRequest.getUrlPath());
        }
        if (!StringUtils.isNullOrEmpty(createBackendServerGroupRequest.getHostName())) {
            request.addParameter("HostName", createBackendServerGroupRequest.getHostName());
        }
        if (!StringUtils.isNullOrEmpty(createBackendServerGroupRequest.getHealthCheckState())) {
            request.addParameter("HealthCheckState", createBackendServerGroupRequest.getHealthCheckState());
        }

        return request;
    }
}