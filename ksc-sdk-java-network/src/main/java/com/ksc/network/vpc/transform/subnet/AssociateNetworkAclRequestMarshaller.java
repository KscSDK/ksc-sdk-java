package com.ksc.network.vpc.transform.subnet;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.subnet.AssociateNetworkAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * AssociateNetworkAclRequest Marshaller
 */

public class AssociateNetworkAclRequestMarshaller implements
        Marshaller<Request<AssociateNetworkAclRequest>, AssociateNetworkAclRequest> {

    public Request<AssociateNetworkAclRequest> marshall(
            AssociateNetworkAclRequest associateNetworkAclRequest) {

        if (associateNetworkAclRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AssociateNetworkAclRequest> request = new DefaultRequest<AssociateNetworkAclRequest>(
                associateNetworkAclRequest, "vpc");
        request.addParameter("Action", "AssociateNetworkAcl");
        String version = associateNetworkAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((AssociateNetworkAclRequest) associateNetworkAclRequest).getNetworkAclId())) {
            request.addParameter("NetworkAclId", ((AssociateNetworkAclRequest) associateNetworkAclRequest).getNetworkAclId());
        }
        if (!StringUtils.isNullOrEmpty(((AssociateNetworkAclRequest) associateNetworkAclRequest).getSubnetId())) {
            request.addParameter("SubnetId", ((AssociateNetworkAclRequest) associateNetworkAclRequest).getSubnetId());
        }

        return request;
    }

}
