package com.ksc.network.vpc.transform.Nat;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Nat.DisassociateNatRequest;
import com.ksc.network.vpc.model.subnet.DisassociateNetworkAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class DisassociateNatRequestMarshaller implements
        Marshaller<Request<DisassociateNatRequest>, DisassociateNatRequest> {

    public Request<DisassociateNatRequest> marshall(
            DisassociateNatRequest disassociateNatRequest) {

        if (disassociateNatRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DisassociateNatRequest> request = new DefaultRequest<DisassociateNatRequest>(
                disassociateNatRequest, "vpc");
        request.addParameter("Action", "DisassociateNat");
        String version = disassociateNatRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DisassociateNatRequest) disassociateNatRequest).getNatId())) {
            request.addParameter("NatId", ((DisassociateNatRequest) disassociateNatRequest).getNatId());
        }
        if (!StringUtils.isNullOrEmpty(((DisassociateNatRequest) disassociateNatRequest).getSubnetId())) {
            request.addParameter("SubnetId", ((DisassociateNatRequest) disassociateNatRequest).getSubnetId());
        }

        return request;
    }

}
