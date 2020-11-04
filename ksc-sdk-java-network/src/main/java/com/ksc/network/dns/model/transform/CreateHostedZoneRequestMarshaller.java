package com.ksc.network.dns.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.dns.model.CreateHostedZoneRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateHostedZoneRequestMarshaller implements
        Marshaller<Request<CreateHostedZoneRequest>, CreateHostedZoneRequest> {

    @Override
    public Request<CreateHostedZoneRequest> marshall(CreateHostedZoneRequest createHostedZoneRequest) {
        if (createHostedZoneRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateHostedZoneRequest> request = new DefaultRequest<CreateHostedZoneRequest>(
                createHostedZoneRequest, "dns");
        request.addParameter("Action", "CreateHostedZone");
        request.addParameter("Version", "2016-06-07");

        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createHostedZoneRequest.getHostedZoneName())) {
            request.addParameter("HostedZoneName", createHostedZoneRequest.getHostedZoneName());
        }

        return request;
    }
}