package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Tunnels.AssociateRemoteCidrRequest;
import com.ksc.network.vpc.model.Tunnels.AssociateSubnetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class AssociateRemoteCidrRequestMarshaller implements
        Marshaller<Request<AssociateRemoteCidrRequest>, AssociateRemoteCidrRequest> {

    public Request<AssociateRemoteCidrRequest> marshall(
            AssociateRemoteCidrRequest associateRemoteCidrRequest) {

        if (associateRemoteCidrRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AssociateRemoteCidrRequest> request = new DefaultRequest<AssociateRemoteCidrRequest>(
                associateRemoteCidrRequest, "vpc");
        request.addParameter("Action", "AssociateRemoteCidr");
        String version = associateRemoteCidrRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((AssociateRemoteCidrRequest) associateRemoteCidrRequest).getTunnelId())) {
            request.addParameter("TunnelId", ((AssociateRemoteCidrRequest) associateRemoteCidrRequest).getTunnelId());
        }

        if (!StringUtils.isNullOrEmpty(((AssociateRemoteCidrRequest) associateRemoteCidrRequest).getCidrBlock())) {
            request.addParameter("CidrBlock", ((AssociateRemoteCidrRequest) associateRemoteCidrRequest).getCidrBlock());
        }

        return request;
    }

}
