package com.ksc.network.dns.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.dns.model.ModifyResourceRecordRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyResourceRecordRequestMarshaller implements
        Marshaller<Request<ModifyResourceRecordRequest>, ModifyResourceRecordRequest> {

    @Override
    public Request<ModifyResourceRecordRequest> marshall(ModifyResourceRecordRequest modifyResourceRecordRequest) {
        if (modifyResourceRecordRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyResourceRecordRequest> request = new DefaultRequest<ModifyResourceRecordRequest>(
                modifyResourceRecordRequest, "dns");
        request.addParameter("Action", "ModifyResourceRecord");
        request.addParameter("Version", "2016-06-07");

        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyResourceRecordRequest.getResourceRecordId())) {
            request.addParameter("ResourceRecordId", modifyResourceRecordRequest.getResourceRecordId());
        }
        if (!StringUtils.isNullOrEmpty(modifyResourceRecordRequest.getHostedZoneId())) {
            request.addParameter("HostedZoneId", modifyResourceRecordRequest.getHostedZoneId());
        }
        if (!StringUtils.isNullOrEmpty(modifyResourceRecordRequest.getResourceRecordName())) {
            request.addParameter("ResourceRecordName", modifyResourceRecordRequest.getResourceRecordName());
        }
        if (!StringUtils.isNullOrEmpty(modifyResourceRecordRequest.getResourceRecordType())) {
            request.addParameter("ResourceRecordType", modifyResourceRecordRequest.getResourceRecordType());
        }
        if (!StringUtils.isNullOrEmpty(modifyResourceRecordRequest.getGeoLocationId())) {
            request.addParameter("GeoLocationId", modifyResourceRecordRequest.getGeoLocationId());
        }
        if (modifyResourceRecordRequest.getTTL() != null) {
            request.addParameter("TTL", String.valueOf(modifyResourceRecordRequest.getTTL()));
        }
        if (!StringUtils.isNullOrEmpty(modifyResourceRecordRequest.getValue())) {
            request.addParameter("Value", modifyResourceRecordRequest.getValue());
        }
        if (!StringUtils.isNullOrEmpty(modifyResourceRecordRequest.getWeight())) {
            request.addParameter("Weight", modifyResourceRecordRequest.getWeight());
        }

        return request;
    }
}