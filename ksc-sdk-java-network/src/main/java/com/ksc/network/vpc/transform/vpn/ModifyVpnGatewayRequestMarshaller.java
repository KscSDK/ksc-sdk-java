package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.ModifyVpnGatewayRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyVpnGatewayRequestMarshaller implements
        Marshaller<Request<ModifyVpnGatewayRequest>, ModifyVpnGatewayRequest> {

    @Override
    public Request<ModifyVpnGatewayRequest> marshall(ModifyVpnGatewayRequest modifyVpnGatewayRequest) {
        if (modifyVpnGatewayRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpnGatewayRequest> request = new DefaultRequest<ModifyVpnGatewayRequest>(
                modifyVpnGatewayRequest, "vpc");
        request.addParameter("Action", "ModifyVpnGateway");
        String version = modifyVpnGatewayRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyVpnGatewayRequest.getVpnGatewayId())) {
            request.addParameter("VpnGatewayId", modifyVpnGatewayRequest.getVpnGatewayId());
        }
        if (modifyVpnGatewayRequest.getBandWidth() != null) {
            request.addParameter("BandWidth", String.valueOf(modifyVpnGatewayRequest.getBandWidth()));
        }
        if (!StringUtils.isNullOrEmpty(modifyVpnGatewayRequest.getVpnGatewayName())) {
            request.addParameter("VpnGatewayName", modifyVpnGatewayRequest.getVpnGatewayName());
        }

        return request;
    }
}