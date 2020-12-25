package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DescribePriceRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribePriceRequestMarshaller implements
        Marshaller<Request<DescribePriceRequest>, DescribePriceRequest> {

    @Override
    public Request<DescribePriceRequest> marshall(DescribePriceRequest describePriceRequest) {
        if (describePriceRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePriceRequest> request = new DefaultRequest<DescribePriceRequest>(
                describePriceRequest, "epc");
        request.addParameter("Action", "DescribePrice");
        String version = describePriceRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(describePriceRequest.getAvailabilityZone())) {
            request.addParameter("AvailabilityZone", describePriceRequest.getAvailabilityZone());
        }
        if (!StringUtils.isNullOrEmpty(describePriceRequest.getHostType())) {
            request.addParameter("HostType", describePriceRequest.getHostType());
        }
        if (!StringUtils.isNullOrEmpty(describePriceRequest.getChargeType())) {
            request.addParameter("ChargeType", describePriceRequest.getChargeType());
        }
        if (!StringUtils.isNullOrEmpty(describePriceRequest.getPurchaseTime())) {
            request.addParameter("PurchaseTime", describePriceRequest.getPurchaseTime());
        }
        if (describePriceRequest.getAmount() != null) {
            request.addParameter("Amount", String.valueOf(describePriceRequest.getAmount()));
        }

        return request;
    }
}