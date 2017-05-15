package com.ksc.network.vpc.transform.subnet;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.subnet.DisassociateNetworkAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DisassociateNetworkAclRequest Marshaller
 */

public class DisassociateNetworkAclRequestMarshaller implements
        Marshaller<Request<DisassociateNetworkAclRequest>, DisassociateNetworkAclRequest> {

    public Request<DisassociateNetworkAclRequest> marshall(
            DisassociateNetworkAclRequest disassociateNetworkAclRequest) {

        if (disassociateNetworkAclRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DisassociateNetworkAclRequest> request = new DefaultRequest<DisassociateNetworkAclRequest>(
                disassociateNetworkAclRequest, "vpc");
        request.addParameter("Action", "DisassociateNetworkAcl");
        String version = disassociateNetworkAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DisassociateNetworkAclRequest) disassociateNetworkAclRequest).getNetworkAclId())) {
            request.addParameter("NetworkAclId", ((DisassociateNetworkAclRequest) disassociateNetworkAclRequest).getNetworkAclId());
        }
        if (!StringUtils.isNullOrEmpty(((DisassociateNetworkAclRequest) disassociateNetworkAclRequest).getSubnetId())) {
            request.addParameter("SubnetId", ((DisassociateNetworkAclRequest) disassociateNetworkAclRequest).getSubnetId());
        }

        return request;
    }

}
