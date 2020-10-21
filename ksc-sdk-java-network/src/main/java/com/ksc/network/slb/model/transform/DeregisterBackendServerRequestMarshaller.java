package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeregisterBackendServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeregisterBackendServerRequestMarshaller implements
        Marshaller<Request<DeregisterBackendServerRequest>, DeregisterBackendServerRequest> {

    @Override
    public Request<DeregisterBackendServerRequest> marshall(DeregisterBackendServerRequest deregisterBackendServerRequest) {
        if (deregisterBackendServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeregisterBackendServerRequest> request = new DefaultRequest<DeregisterBackendServerRequest>(
                deregisterBackendServerRequest, "slb");
        request.addParameter("Action", "DeregisterBackendServer");
        String version = deregisterBackendServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deregisterBackendServerRequest.getRegisterId())) {
            request.addParameter("RegisterId", deregisterBackendServerRequest.getRegisterId());
        }

        return request;
    }
}