package com.ksc.network.vpc.transform.Nat;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Nat.AssociateNatRequest;
import com.ksc.network.vpc.model.subnet.AssociateNetworkAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class AssociateNatRequestMarshaller implements
        Marshaller<Request<AssociateNatRequest>, AssociateNatRequest> {

    public Request<AssociateNatRequest> marshall(
            AssociateNatRequest associateNatRequest) {

        if (associateNatRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AssociateNatRequest> request = new DefaultRequest<AssociateNatRequest>(
                associateNatRequest, "vpc");
        request.addParameter("Action", "AssociateNat");
        String version = associateNatRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((AssociateNatRequest) associateNatRequest).getNatId())) {
            request.addParameter("NatId", ((AssociateNatRequest) associateNatRequest).getNatId());
        }
        if (!StringUtils.isNullOrEmpty(((AssociateNatRequest) associateNatRequest).getSubnetId())) {
            request.addParameter("SubnetId", ((AssociateNatRequest) associateNatRequest).getSubnetId());
        }

        return request;
    }

}
