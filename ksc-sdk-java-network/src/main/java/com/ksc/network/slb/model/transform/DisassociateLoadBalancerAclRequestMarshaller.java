package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DisassociateLoadBalancerAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DisassociateLoadBalancerAclRequestMarshaller implements
        Marshaller<Request<DisassociateLoadBalancerAclRequest>, DisassociateLoadBalancerAclRequest> {

    @Override
    public Request<DisassociateLoadBalancerAclRequest> marshall(DisassociateLoadBalancerAclRequest disassociateLoadBalancerAclRequest) {
        if (disassociateLoadBalancerAclRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateLoadBalancerAclRequest> request = new DefaultRequest<DisassociateLoadBalancerAclRequest>(
                disassociateLoadBalancerAclRequest, "slb");
        request.addParameter("Action", "DisassociateLoadBalancerAcl");
        String version = disassociateLoadBalancerAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(disassociateLoadBalancerAclRequest.getListenerId())) {
            request.addParameter("ListenerId", disassociateLoadBalancerAclRequest.getListenerId());
        }

        return request;
    }
}