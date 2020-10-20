package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.CreateLoadBalancerAclEntryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateLoadBalancerAclEntryRequestMarshaller implements
        Marshaller<Request<CreateLoadBalancerAclEntryRequest>, CreateLoadBalancerAclEntryRequest> {

    @Override
    public Request<CreateLoadBalancerAclEntryRequest> marshall(CreateLoadBalancerAclEntryRequest createLoadBalancerAclEntryRequest) {
        if (createLoadBalancerAclEntryRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLoadBalancerAclEntryRequest> request = new DefaultRequest<CreateLoadBalancerAclEntryRequest>(
                createLoadBalancerAclEntryRequest, "slb");
        request.addParameter("Action", "CreateLoadBalancerAclEntry");
        String version = createLoadBalancerAclEntryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createLoadBalancerAclEntryRequest.getLoadBalancerAclId())) {
            request.addParameter("LoadBalancerAclId", createLoadBalancerAclEntryRequest.getLoadBalancerAclId());
        }
        if (!StringUtils.isNullOrEmpty(createLoadBalancerAclEntryRequest.getCidrBlock())) {
            request.addParameter("CidrBlock", createLoadBalancerAclEntryRequest.getCidrBlock());
        }
        if (createLoadBalancerAclEntryRequest.getRuleNumber() != null) {
            request.addParameter("RuleNumber", String.valueOf(createLoadBalancerAclEntryRequest.getRuleNumber()));
        }
        if (!StringUtils.isNullOrEmpty(createLoadBalancerAclEntryRequest.getRuleAction())) {
            request.addParameter("RuleAction", createLoadBalancerAclEntryRequest.getRuleAction());
        }
        if (!StringUtils.isNullOrEmpty(createLoadBalancerAclEntryRequest.getProtocol())) {
            request.addParameter("Protocol", createLoadBalancerAclEntryRequest.getProtocol());
        }

        return request;
    }
}