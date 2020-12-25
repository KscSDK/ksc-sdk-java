package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifyBackendServerGroupRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyBackendServerGroupRequestMarshaller implements
        Marshaller<Request<ModifyBackendServerGroupRequest>, ModifyBackendServerGroupRequest> {

    @Override
    public Request<ModifyBackendServerGroupRequest> marshall(ModifyBackendServerGroupRequest modifyBackendServerGroupRequest) {
        if (modifyBackendServerGroupRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyBackendServerGroupRequest> request = new DefaultRequest<ModifyBackendServerGroupRequest>(
                modifyBackendServerGroupRequest, "slb");
        request.addParameter("Action", "ModifyBackendServerGroup");
        String version = modifyBackendServerGroupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyBackendServerGroupRequest.getBackendServerGroupId())) {
            request.addParameter("BackendServerGroupId", modifyBackendServerGroupRequest.getBackendServerGroupId());
        }
        if (!StringUtils.isNullOrEmpty(modifyBackendServerGroupRequest.getBackendServerGroupName())) {
            request.addParameter("BackendServerGroupName", modifyBackendServerGroupRequest.getBackendServerGroupName());
        }

        return request;
    }
}