package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifyBackendServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyBackendServerRequestMarshaller implements
        Marshaller<Request<ModifyBackendServerRequest>, ModifyBackendServerRequest> {

    @Override
    public Request<ModifyBackendServerRequest> marshall(ModifyBackendServerRequest modifyBackendServerRequest) {
        if (modifyBackendServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyBackendServerRequest> request = new DefaultRequest<ModifyBackendServerRequest>(
                modifyBackendServerRequest, "slb");
        request.addParameter("Action", "ModifyBackendServer");
        String version = modifyBackendServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyBackendServerRequest.getRegisterId())) {
            request.addParameter("RegisterId", modifyBackendServerRequest.getRegisterId());
        }
        if (modifyBackendServerRequest.getWeight() != null) {
            request.addParameter("Weight", String.valueOf(modifyBackendServerRequest.getWeight()));
        }

        return request;
    }
}