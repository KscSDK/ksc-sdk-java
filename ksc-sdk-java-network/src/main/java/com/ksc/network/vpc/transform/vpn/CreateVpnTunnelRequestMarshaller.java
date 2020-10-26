package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.CreateVpnTunnelRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateVpnTunnelRequestMarshaller implements
        Marshaller<Request<CreateVpnTunnelRequest>, CreateVpnTunnelRequest> {

    @Override
    public Request<CreateVpnTunnelRequest> marshall(CreateVpnTunnelRequest createVpnTunnelRequest) {
        if (createVpnTunnelRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpnTunnelRequest> request = new DefaultRequest<CreateVpnTunnelRequest>(
                createVpnTunnelRequest, "vpc");
        request.addParameter("Action", "CreateVpnTunnel");
        String version = createVpnTunnelRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.POST);

        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getType())) {
            request.addParameter("Type", createVpnTunnelRequest.getType());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getVpnTunnelName())) {
            request.addParameter("VpnTunnelName", createVpnTunnelRequest.getVpnTunnelName());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getVpnGreIp())) {
            request.addParameter("VpnGreIp", createVpnTunnelRequest.getVpnGreIp());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getCustomerGreIp())) {
            request.addParameter("CustomerGreIp", createVpnTunnelRequest.getCustomerGreIp());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getHaVpnGreIp())) {
            request.addParameter("HaVpnGreIp", createVpnTunnelRequest.getHaVpnGreIp());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getHaCustomerGreIp())) {
            request.addParameter("HaCustomerGreIp", createVpnTunnelRequest.getHaCustomerGreIp());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getVpnGatewayId())) {
            request.addParameter("VpnGatewayId", createVpnTunnelRequest.getVpnGatewayId());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getCustomerGatewayId())) {
            request.addParameter("CustomerGatewayId", createVpnTunnelRequest.getCustomerGatewayId());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getPreSharedKey())) {
            request.addParameter("PreSharedKey", createVpnTunnelRequest.getPreSharedKey());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getIkeAuthenAlgorithm())) {
            request.addParameter("IkeAuthenAlgorithm", createVpnTunnelRequest.getIkeAuthenAlgorithm());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getIkeDHGroup())) {
            request.addParameter("IkeDHGroup", createVpnTunnelRequest.getIkeDHGroup());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getIkeEncryAlgorithm())) {
            request.addParameter("IkeEncryAlgorithm", createVpnTunnelRequest.getIkeEncryAlgorithm());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getIpsecEncryAlgorithm())) {
            request.addParameter("IpsecEncryAlgorithm", createVpnTunnelRequest.getIpsecEncryAlgorithm());
        }
        if (!StringUtils.isNullOrEmpty(createVpnTunnelRequest.getIpsecAuthenAlgorithm())) {
            request.addParameter("IpsecAuthenAlgorithm", createVpnTunnelRequest.getIpsecAuthenAlgorithm());
        }
        if (createVpnTunnelRequest.getIpsecLifetimeTraffic() != null) {
            request.addParameter("IpsecLifetimeTraffic", String.valueOf(createVpnTunnelRequest.getIpsecLifetimeTraffic()));
        }
        if (createVpnTunnelRequest.getIpsecLifetimeSecond() != null) {
            request.addParameter("IpsecLifetimeSecond", String.valueOf(createVpnTunnelRequest.getIpsecLifetimeSecond()));
        }
        if (createVpnTunnelRequest.getEnableNatTraversal() != null) {
            request.addParameter("EnableNatTraversal", String.valueOf(createVpnTunnelRequest.getEnableNatTraversal()));
        }

        return request;
    }
}