package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.DeleteVpnGatewayRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteVpnGatewayRequestMarshaller implements
        Marshaller<Request<DeleteVpnGatewayRequest>, DeleteVpnGatewayRequest> {

    @Override
    public Request<DeleteVpnGatewayRequest> marshall(DeleteVpnGatewayRequest deleteVpnGatewayRequest) {
        if (deleteVpnGatewayRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteVpnGatewayRequest> request = new DefaultRequest<DeleteVpnGatewayRequest>(
                deleteVpnGatewayRequest, "vpc");
        request.addParameter("Action", "DeleteVpnGateway");
        String version = deleteVpnGatewayRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteVpnGatewayRequest.getVpnGatewayId())) {
            request.addParameter("VpnGatewayId", deleteVpnGatewayRequest.getVpnGatewayId());
        }

        return request;
    }
}