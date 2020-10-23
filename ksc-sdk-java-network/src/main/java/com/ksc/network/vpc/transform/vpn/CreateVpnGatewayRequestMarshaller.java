package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.CreateVpnGatewayRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateVpnGatewayRequestMarshaller implements
        Marshaller<Request<CreateVpnGatewayRequest>, CreateVpnGatewayRequest> {

    @Override
    public Request<CreateVpnGatewayRequest> marshall(CreateVpnGatewayRequest createVpnGatewayRequest) {
        if (createVpnGatewayRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpnGatewayRequest> request = new DefaultRequest<CreateVpnGatewayRequest>(
                createVpnGatewayRequest, "vpc");
        request.addParameter("Action", "CreateVpnGateway");
        String version = createVpnGatewayRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createVpnGatewayRequest.getVpcId())) {
            request.addParameter("VpcId", createVpnGatewayRequest.getVpcId());
        }
        if (!StringUtils.isNullOrEmpty(createVpnGatewayRequest.getVpnGatewayName())) {
            request.addParameter("VpnGatewayName", createVpnGatewayRequest.getVpnGatewayName());
        }
        if (createVpnGatewayRequest.getPurchaseTime() != null) {
            request.addParameter("PurchaseTime", String.valueOf(createVpnGatewayRequest.getPurchaseTime()));
        }
        if (createVpnGatewayRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", String.valueOf(createVpnGatewayRequest.getBandWidth()));
        }
        if (!StringUtils.isNullOrEmpty(createVpnGatewayRequest.getChargeType())) {
            request.addParameter("ChargeType", createVpnGatewayRequest.getChargeType());
        }
        if (!StringUtils.isNullOrEmpty(createVpnGatewayRequest.getProjectId())) {
            request.addParameter("ProjectId", createVpnGatewayRequest.getProjectId());
        }

        return request;
    }
}