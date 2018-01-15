package com.ksc.network.vpc.transform.Nat;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Nat.CreateNatRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateNatRequest Marshaller
 */

public class CreateNatRequestMarshaller implements
        Marshaller<Request<CreateNatRequest>, CreateNatRequest> {

    public Request<CreateNatRequest> marshall(
            CreateNatRequest createNatRequest) {

        if (createNatRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateNatRequest> request = new DefaultRequest<CreateNatRequest>(
                createNatRequest, "vpc");
        request.addParameter("Action", "CreateNat");
        String version = createNatRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createNatRequest.getVpcId())) {
            request.addParameter("VpcId", createNatRequest.getVpcId());
        }
        if (!StringUtils.isNullOrEmpty(createNatRequest.getNatName())) {
            request.addParameter("NatName", createNatRequest.getNatName());
        }
        if (!StringUtils.isNullOrEmpty(createNatRequest.getNatMode())) {
            request.addParameter("NatMode", createNatRequest.getNatMode());
        }
        if (!StringUtils.isNullOrEmpty(createNatRequest.getNatType())) {
            request.addParameter("NatType", createNatRequest.getNatType());
        }
        if (createNatRequest.getNatIpNumber() != null) {
            request.addParameter("NatIpNumber", StringUtils
                    .fromInteger(createNatRequest.getNatIpNumber()));
        }
        if (createNatRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", StringUtils
                    .fromInteger(createNatRequest.getBandWidth()));
        }
        if (!StringUtils.isNullOrEmpty(createNatRequest.getChargeType())) {
            request.addParameter("ChargeType", createNatRequest.getChargeType());
        }
        if (createNatRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime", StringUtils
                    .fromInteger(createNatRequest.getPurchaseTime()));
        }

        return request;
    }

}
