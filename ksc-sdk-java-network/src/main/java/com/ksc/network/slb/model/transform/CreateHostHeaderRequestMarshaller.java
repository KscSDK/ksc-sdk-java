package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.CreateHostHeaderRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateHostHeaderRequestMarshaller implements
        Marshaller<Request<CreateHostHeaderRequest>, CreateHostHeaderRequest> {

    @Override
    public Request<CreateHostHeaderRequest> marshall(CreateHostHeaderRequest CreateHostHeaderRequest) {
        if (CreateHostHeaderRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateHostHeaderRequest> request = new DefaultRequest<CreateHostHeaderRequest>(
                CreateHostHeaderRequest, "slb");
        request.addParameter("Action", "CreateHostHeader");
        String version = CreateHostHeaderRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(CreateHostHeaderRequest.getListenerId())) {
            request.addParameter("ListenerId", CreateHostHeaderRequest.getListenerId());
        }
        if (!StringUtils.isNullOrEmpty(CreateHostHeaderRequest.getHostHeader())) {
            request.addParameter("HostHeader", CreateHostHeaderRequest.getHostHeader());
        }
        if (!StringUtils.isNullOrEmpty(CreateHostHeaderRequest.getCertificateId())) {
            request.addParameter("CertificateId", CreateHostHeaderRequest.getCertificateId());
        }

        return request;
    }
}