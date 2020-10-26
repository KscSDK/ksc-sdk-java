package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.ModifyVpnTunnelRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyVpnTunnelRequestMarshaller implements
        Marshaller<Request<ModifyVpnTunnelRequest>, ModifyVpnTunnelRequest> {

    @Override
    public Request<ModifyVpnTunnelRequest> marshall(ModifyVpnTunnelRequest modifyVpnTunnelRequest) {
        if (modifyVpnTunnelRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpnTunnelRequest> request = new DefaultRequest<ModifyVpnTunnelRequest>(
                modifyVpnTunnelRequest, "vpc");
        request.addParameter("Action", "ModifyVpnTunnel");
        String version = modifyVpnTunnelRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyVpnTunnelRequest.getVpnTunnelId())) {
            request.addParameter("VpnTunnelId", modifyVpnTunnelRequest.getVpnTunnelId());
        }
        if (!StringUtils.isNullOrEmpty(modifyVpnTunnelRequest.getVpnTunnelName())) {
            request.addParameter("VpnTunnelName", modifyVpnTunnelRequest.getVpnTunnelName());
        }

        return request;
    }
}