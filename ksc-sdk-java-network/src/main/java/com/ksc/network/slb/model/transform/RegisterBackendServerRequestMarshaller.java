package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.RegisterBackendServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class RegisterBackendServerRequestMarshaller implements
        Marshaller<Request<RegisterBackendServerRequest>, RegisterBackendServerRequest> {

    @Override
    public Request<RegisterBackendServerRequest> marshall(RegisterBackendServerRequest registerBackendServerRequest) {
        if (registerBackendServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterBackendServerRequest> request = new DefaultRequest<RegisterBackendServerRequest>(
                registerBackendServerRequest, "slb");
        request.addParameter("Action", "RegisterBackendServer");
        String version = registerBackendServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(registerBackendServerRequest.getBackendServerGroupId())) {
            request.addParameter("BackendServerGroupId", registerBackendServerRequest.getBackendServerGroupId());
        }
        if (!StringUtils.isNullOrEmpty(registerBackendServerRequest.getBackendServerIp())) {
            request.addParameter("BackendServerIp", registerBackendServerRequest.getBackendServerIp());
        }
        if (!StringUtils.isNullOrEmpty(registerBackendServerRequest.getBackendServerPort())) {
            request.addParameter("BackendServerPort", registerBackendServerRequest.getBackendServerPort());
        }
        if (registerBackendServerRequest.getWeight() != null) {
            request.addParameter("Weight", String.valueOf(registerBackendServerRequest.getWeight()));
        }

        return request;
    }
}