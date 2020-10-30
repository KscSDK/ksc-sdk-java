package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyEpcRequestMarshaller implements
        Marshaller<Request<ModifyEpcRequest>, ModifyEpcRequest> {

    @Override
    public Request<ModifyEpcRequest> marshall(ModifyEpcRequest modifyEpcRequest) {
        if (modifyEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyEpcRequest> request = new DefaultRequest<ModifyEpcRequest>(
                modifyEpcRequest, "epc");
        request.addParameter("Action", "ModifyEpc");
        String version = modifyEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyEpcRequest.getHostName())) {
            request.addParameter("HostName", modifyEpcRequest.getHostName());
        }
        if (!StringUtils.isNullOrEmpty(modifyEpcRequest.getHostId())) {
            request.addParameter("HostId", modifyEpcRequest.getHostId());
        }

        return request;
    }
}