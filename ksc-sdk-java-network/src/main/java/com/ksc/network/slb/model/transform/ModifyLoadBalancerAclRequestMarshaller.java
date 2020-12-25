package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifyLoadBalancerAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyLoadBalancerAclRequestMarshaller implements
        Marshaller<Request<ModifyLoadBalancerAclRequest>, ModifyLoadBalancerAclRequest> {

    @Override
    public Request<ModifyLoadBalancerAclRequest> marshall(ModifyLoadBalancerAclRequest modifyLoadBalancerAclRequest) {
        if (modifyLoadBalancerAclRequest == null) {
        throw new KscClientException("Invalid argument passed to marshall(...)");
    }

    Request<ModifyLoadBalancerAclRequest> request = new DefaultRequest<ModifyLoadBalancerAclRequest>(
            modifyLoadBalancerAclRequest, "slb");
        request.addParameter("Action", "ModifyLoadBalancerAcl");
        String version = modifyLoadBalancerAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            if (!StringUtils.isNullOrEmpty(modifyLoadBalancerAclRequest.getLoadBalancerAclId())) {
                request.addParameter("LoadBalancerAclId", modifyLoadBalancerAclRequest.getLoadBalancerAclId());
            }
            if (!StringUtils.isNullOrEmpty(modifyLoadBalancerAclRequest.getLoadBalancerAclName())) {
                request.addParameter("LoadBalancerAclName", modifyLoadBalancerAclRequest.getLoadBalancerAclName());
            }

        return request;
    }
}