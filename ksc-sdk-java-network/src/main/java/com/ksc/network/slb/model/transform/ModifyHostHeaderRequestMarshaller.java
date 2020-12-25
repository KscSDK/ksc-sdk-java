package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifyHostHeaderRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyHostHeaderRequestMarshaller implements
        Marshaller<Request<ModifyHostHeaderRequest>, ModifyHostHeaderRequest> {

    @Override
    public Request<ModifyHostHeaderRequest> marshall(ModifyHostHeaderRequest ModifyHostHeaderRequest) {
        if (ModifyHostHeaderRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyHostHeaderRequest> request = new DefaultRequest<ModifyHostHeaderRequest>(
                ModifyHostHeaderRequest, "slb");
        request.addParameter("Action", "ModifyHostHeader");
        String version = ModifyHostHeaderRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(ModifyHostHeaderRequest.getHostHeaderId())) {
            request.addParameter("HostHeaderId", ModifyHostHeaderRequest.getHostHeaderId());
        }
        if (!StringUtils.isNullOrEmpty(ModifyHostHeaderRequest.getCertificateId())) {
            request.addParameter("CertificateId", ModifyHostHeaderRequest.getCertificateId());
        }

        return request;
    }
}