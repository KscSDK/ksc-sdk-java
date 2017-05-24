package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifyLoadBalancerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by LIUHONGMING on 2017/4/26.
 */
public class ModifyLoadBalancerRequestMarshaller implements
        Marshaller<Request<ModifyLoadBalancerRequest>, ModifyLoadBalancerRequest> {

    public Request<ModifyLoadBalancerRequest> marshall(
            ModifyLoadBalancerRequest modifyLoadBalancerRequest) {

        if (modifyLoadBalancerRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)" );
        }

        Request<ModifyLoadBalancerRequest> request = new DefaultRequest<ModifyLoadBalancerRequest>(
                modifyLoadBalancerRequest, "slb" );
        request.addParameter("Action", "ModifyLoadBalancer");
        String version = modifyLoadBalancerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyLoadBalancerRequest.getLoadBalancerId())) {
            request.addParameter("LoadBalancerId", modifyLoadBalancerRequest.getLoadBalancerId());
        }

        if (!StringUtils.isNullOrEmpty(modifyLoadBalancerRequest.getLoadBalancerName())) {
            request.addParameter("LoadBalancerName", modifyLoadBalancerRequest.getLoadBalancerName());
        }

        if (!StringUtils.isNullOrEmpty(modifyLoadBalancerRequest.getLoadBalancerState())) {
            request.addParameter("LoadBalancerState", modifyLoadBalancerRequest.getLoadBalancerState());
        }

        return request;
    }

}

