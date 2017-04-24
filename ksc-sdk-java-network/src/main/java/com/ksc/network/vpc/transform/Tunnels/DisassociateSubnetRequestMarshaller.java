package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Nat.DisassociateNatRequest;
import com.ksc.network.vpc.model.Tunnels.DisassociateSubnetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class DisassociateSubnetRequestMarshaller implements
        Marshaller<Request<DisassociateSubnetRequest>, DisassociateSubnetRequest> {

    public Request<DisassociateSubnetRequest> marshall(
            DisassociateSubnetRequest disassociateSubnetRequest) {

        if (disassociateSubnetRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DisassociateSubnetRequest> request = new DefaultRequest<DisassociateSubnetRequest>(
                disassociateSubnetRequest, "vpc");
        request.addParameter("Action", "DisassociateSubnet");
        String version = disassociateSubnetRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DisassociateSubnetRequest) disassociateSubnetRequest).getTunnelId())) {
            request.addParameter("TunnelId", ((DisassociateSubnetRequest) disassociateSubnetRequest).getTunnelId());
        }
        if (!StringUtils.isNullOrEmpty(((DisassociateSubnetRequest) disassociateSubnetRequest).getSubnetId())) {
            request.addParameter("SubnetId", ((DisassociateSubnetRequest) disassociateSubnetRequest).getSubnetId());
        }

        return request;
    }

}
