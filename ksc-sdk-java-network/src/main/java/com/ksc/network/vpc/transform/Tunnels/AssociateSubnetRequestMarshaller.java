package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Nat.AssociateNatRequest;
import com.ksc.network.vpc.model.Tunnels.AssociateSubnetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class AssociateSubnetRequestMarshaller implements
        Marshaller<Request<AssociateSubnetRequest>, AssociateSubnetRequest> {

    public Request<AssociateSubnetRequest> marshall(
            AssociateSubnetRequest associateSubnetRequest) {

        if (associateSubnetRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AssociateSubnetRequest> request = new DefaultRequest<AssociateSubnetRequest>(
                associateSubnetRequest, "vpc");
        request.addParameter("Action", "AssociateSubnet");
        String version = associateSubnetRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((AssociateSubnetRequest) associateSubnetRequest).getTunnelId())) {
            request.addParameter("TunnelId", ((AssociateSubnetRequest) associateSubnetRequest).getTunnelId());
        }
        if (!StringUtils.isNullOrEmpty(((AssociateSubnetRequest) associateSubnetRequest).getSubnetId())) {
            request.addParameter("SubnetId", ((AssociateSubnetRequest) associateSubnetRequest).getSubnetId());
        }

        return request;
    }

}
