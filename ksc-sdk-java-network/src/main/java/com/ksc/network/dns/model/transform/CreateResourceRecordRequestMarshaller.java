package com.ksc.network.dns.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.dns.model.CreateResourceRecordRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateResourceRecordRequestMarshaller implements
        Marshaller<Request<CreateResourceRecordRequest>, CreateResourceRecordRequest> {

    @Override
    public Request<CreateResourceRecordRequest> marshall(CreateResourceRecordRequest createResourceRecordRequest) {
        if (createResourceRecordRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateResourceRecordRequest> request = new DefaultRequest<CreateResourceRecordRequest>(
                createResourceRecordRequest, "dns");
        request.addParameter("Action", "CreateResourceRecord");
        request.addParameter("Version", "2016-06-07");

        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createResourceRecordRequest.getHostedZoneId())) {
            request.addParameter("HostedZoneId", createResourceRecordRequest.getHostedZoneId());
        }
        if (!StringUtils.isNullOrEmpty(createResourceRecordRequest.getResourceRecordName())) {
            request.addParameter("ResourceRecordName", createResourceRecordRequest.getResourceRecordName());
        }
        if (!StringUtils.isNullOrEmpty(createResourceRecordRequest.getResourceRecordType())) {
            request.addParameter("ResourceRecordType", createResourceRecordRequest.getResourceRecordType());
        }
        if (!StringUtils.isNullOrEmpty(createResourceRecordRequest.getGeoLocationId())) {
            request.addParameter("GeoLocationId", createResourceRecordRequest.getGeoLocationId());
        }
        if (createResourceRecordRequest.getTTL() != null) {
            request.addParameter("TTL", String.valueOf(createResourceRecordRequest.getTTL()));
        }
        if (!StringUtils.isNullOrEmpty(createResourceRecordRequest.getValue())) {
            request.addParameter("Value", createResourceRecordRequest.getValue());
        }
        if (!StringUtils.isNullOrEmpty(createResourceRecordRequest.getWeight())) {
            request.addParameter("Weight", createResourceRecordRequest.getWeight());
        }

        return request;
    }
}