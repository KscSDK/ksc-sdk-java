package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Tunnels.DisassociateRemoteCidrRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DisassociateRemoteCidrRequest Marshaller
 */

public class DisassociateRemoteCidrRequestMarshaller implements
        Marshaller<Request<DisassociateRemoteCidrRequest>, DisassociateRemoteCidrRequest> {

    public Request<DisassociateRemoteCidrRequest> marshall(
            DisassociateRemoteCidrRequest disassociateRemoteCidrRequest) {

        if (disassociateRemoteCidrRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DisassociateRemoteCidrRequest> request = new DefaultRequest<DisassociateRemoteCidrRequest>(
                disassociateRemoteCidrRequest, "vpc");
        request.addParameter("Action", "DisassociateRemoteCidr");
        String version = disassociateRemoteCidrRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DisassociateRemoteCidrRequest) disassociateRemoteCidrRequest).getTunnelId())) {
            request.addParameter("TunnelId", ((DisassociateRemoteCidrRequest) disassociateRemoteCidrRequest).getTunnelId());
        }
        if (!StringUtils.isNullOrEmpty(((DisassociateRemoteCidrRequest) disassociateRemoteCidrRequest).getCidrBlock())) {
            request.addParameter("CidrBlock", ((DisassociateRemoteCidrRequest) disassociateRemoteCidrRequest).getCidrBlock());
        }

        return request;
    }

}
