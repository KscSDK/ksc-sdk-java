package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyHyperThreadingRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyHyperThreadingRequestMarshaller implements
        Marshaller<Request<ModifyHyperThreadingRequest>, ModifyHyperThreadingRequest> {

    @Override
    public Request<ModifyHyperThreadingRequest> marshall(ModifyHyperThreadingRequest modifyHyperThreadingRequest) {
        if (modifyHyperThreadingRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyHyperThreadingRequest> request = new DefaultRequest<ModifyHyperThreadingRequest>(
                modifyHyperThreadingRequest, "epc");
        request.addParameter("Action", "ModifyHyperThreading");
        String version = modifyHyperThreadingRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyHyperThreadingRequest.getHyperThreadingStatus())) {
            request.addParameter("HyperThreadingStatus", modifyHyperThreadingRequest.getHyperThreadingStatus());
        }
        if (!StringUtils.isNullOrEmpty(modifyHyperThreadingRequest.getHostId())) {
            request.addParameter("HostId", modifyHyperThreadingRequest.getHostId());
        }

        return request;
    }
}