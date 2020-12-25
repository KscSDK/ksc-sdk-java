package com.ksc.network.dns.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.dns.model.DeleteResourceRecordRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteResourceRecordRequestMarshaller implements
        Marshaller<Request<DeleteResourceRecordRequest>, DeleteResourceRecordRequest> {

    @Override
    public Request<DeleteResourceRecordRequest> marshall(DeleteResourceRecordRequest deleteResourceRecordRequest) {
        if (deleteResourceRecordRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteResourceRecordRequest> request = new DefaultRequest<DeleteResourceRecordRequest>(
                deleteResourceRecordRequest, "dns");
        request.addParameter("Action", "DeleteResourceRecord");
        request.addParameter("Version", "2016-06-07");

        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteResourceRecordRequest.getResourceRecordId())) {
            request.addParameter("ResourceRecordId", deleteResourceRecordRequest.getResourceRecordId());
        }
        if (!StringUtils.isNullOrEmpty(deleteResourceRecordRequest.getHostedZoneId())) {
            request.addParameter("HostedZoneId", deleteResourceRecordRequest.getHostedZoneId());
        }

        return request;
    }
}