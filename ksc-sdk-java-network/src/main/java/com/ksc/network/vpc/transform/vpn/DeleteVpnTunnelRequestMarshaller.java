package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpn.DeleteVpnTunnelRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteVpnTunnelRequestMarshaller implements
        Marshaller<Request<DeleteVpnTunnelRequest>, DeleteVpnTunnelRequest> {

    @Override
    public Request<DeleteVpnTunnelRequest> marshall(DeleteVpnTunnelRequest deleteVpnTunnelRequest) {
        if (deleteVpnTunnelRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteVpnTunnelRequest> request = new DefaultRequest<DeleteVpnTunnelRequest>(
                deleteVpnTunnelRequest, "vpc");
        request.addParameter("Action", "DeleteVpnTunnel");
        String version = deleteVpnTunnelRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteVpnTunnelRequest.getVpnTunnelId())) {
            request.addParameter("VpnTunnelId", deleteVpnTunnelRequest.getVpnTunnelId());
        }

        return request;
    }
}