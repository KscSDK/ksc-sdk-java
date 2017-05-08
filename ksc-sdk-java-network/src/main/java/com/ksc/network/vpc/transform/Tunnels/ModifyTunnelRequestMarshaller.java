package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Tunnels.ModifyTunnelRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifyTunnelRequest Marshaller
 */

public class ModifyTunnelRequestMarshaller implements
        Marshaller<Request<ModifyTunnelRequest>, ModifyTunnelRequest> {

    public Request<ModifyTunnelRequest> marshall(
    		ModifyTunnelRequest modifyTunnelRequest) {

        if (modifyTunnelRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyTunnelRequest> request = new DefaultRequest<ModifyTunnelRequest>(
        		modifyTunnelRequest, "vpc");
        request.addParameter("Action", "ModifyTunnel");
        String version = modifyTunnelRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyTunnelRequest.getTunnelId())) {
            request.addParameter("TunnelId", modifyTunnelRequest.getTunnelId());
        }

        if (!StringUtils.isNullOrEmpty(modifyTunnelRequest.getTunnelName())) {
            request.addParameter("TunnelName", modifyTunnelRequest.getTunnelName());
        }

        return request;
    }

}
