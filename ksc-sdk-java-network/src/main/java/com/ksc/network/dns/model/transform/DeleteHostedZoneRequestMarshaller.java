package com.ksc.network.dns.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.dns.model.DeleteHostedZoneRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteHostedZoneRequestMarshaller implements
        Marshaller<Request<DeleteHostedZoneRequest>, DeleteHostedZoneRequest> {

    @Override
    public Request<DeleteHostedZoneRequest> marshall(DeleteHostedZoneRequest deleteHostedZoneRequest) {
        if (deleteHostedZoneRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteHostedZoneRequest> request = new DefaultRequest<DeleteHostedZoneRequest>(
                deleteHostedZoneRequest, "dns");
        request.addParameter("Action", "DeleteHostedZone");
        request.addParameter("Version", "2016-06-07");

        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteHostedZoneRequest.getHostedZoneId())) {
            request.addParameter("HostedZoneId", deleteHostedZoneRequest.getHostedZoneId());
        }

        return request;
    }
}