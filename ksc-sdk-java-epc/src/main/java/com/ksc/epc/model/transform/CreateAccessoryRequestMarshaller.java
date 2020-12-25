package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.CreateAccessoryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateAccessoryRequestMarshaller implements
        Marshaller<Request<CreateAccessoryRequest>, CreateAccessoryRequest> {

    @Override
    public Request<CreateAccessoryRequest> marshall(CreateAccessoryRequest createAccessoryRequest) {
        if (createAccessoryRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAccessoryRequest> request = new DefaultRequest<CreateAccessoryRequest>(
                createAccessoryRequest, "epc");
        request.addParameter("Action", "CreateAccessory");
        String version = createAccessoryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createAccessoryRequest.getAccessoryType())) {
            request.addParameter("AccessoryType", createAccessoryRequest.getAccessoryType());
        }
        if (!StringUtils.isNullOrEmpty(createAccessoryRequest.getAccessorySuit())) {
            request.addParameter("AccessorySuit", createAccessoryRequest.getAccessorySuit());
        }
        if (!StringUtils.isNullOrEmpty(createAccessoryRequest.getAccessoryName())) {
            request.addParameter("AccessoryName", createAccessoryRequest.getAccessoryName());
        }
        if (!StringUtils.isNullOrEmpty(createAccessoryRequest.getChargeType())) {
            request.addParameter("ChargeType", createAccessoryRequest.getChargeType());
        }
        if (!StringUtils.isNullOrEmpty(createAccessoryRequest.getAvailabilityZone())) {
            request.addParameter("AvailabilityZone", createAccessoryRequest.getAvailabilityZone());
        }
        if (createAccessoryRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime", String.valueOf(createAccessoryRequest.getPurchaseTime()));
        }
        if (!StringUtils.isNullOrEmpty(createAccessoryRequest.getProjectId())) {
            request.addParameter("ProjectId", createAccessoryRequest.getProjectId());
        }

        return request;
    }
}