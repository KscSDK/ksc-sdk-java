package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.BuyAccessoryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class BuyAccessoryRequestMarshaller implements
        Marshaller<Request<BuyAccessoryRequest>, BuyAccessoryRequest> {

    @Override
    public Request<BuyAccessoryRequest> marshall(BuyAccessoryRequest buyAccessoryRequest) {
        if (buyAccessoryRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<BuyAccessoryRequest> request = new DefaultRequest<BuyAccessoryRequest>(
                buyAccessoryRequest, "epc");
        request.addParameter("Action", "BuyAccessory");
        String version = buyAccessoryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(buyAccessoryRequest.getAccessoryType())) {
            request.addParameter("AccessoryType", buyAccessoryRequest.getAccessoryType());
        }
        if (!StringUtils.isNullOrEmpty(buyAccessoryRequest.getAccessorySuit())) {
            request.addParameter("AccessorySuit", buyAccessoryRequest.getAccessorySuit());
        }
        if (!StringUtils.isNullOrEmpty(buyAccessoryRequest.getAccessoryName())) {
            request.addParameter("AccessoryName", buyAccessoryRequest.getAccessoryName());
        }
        if (!StringUtils.isNullOrEmpty(buyAccessoryRequest.getChargeType())) {
            request.addParameter("ChargeType", buyAccessoryRequest.getChargeType());
        }
        if (!StringUtils.isNullOrEmpty(buyAccessoryRequest.getAvailabilityZone())) {
            request.addParameter("AvailabilityZone", buyAccessoryRequest.getAvailabilityZone());
        }
        if (buyAccessoryRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime", String.valueOf(buyAccessoryRequest.getPurchaseTime()));
        }
        if (!StringUtils.isNullOrEmpty(buyAccessoryRequest.getProjectId())) {
            request.addParameter("ProjectId", buyAccessoryRequest.getProjectId());
        }

        return request;
    }
}