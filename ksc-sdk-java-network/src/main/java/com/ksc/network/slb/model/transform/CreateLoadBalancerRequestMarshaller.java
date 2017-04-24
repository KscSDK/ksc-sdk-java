package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.CreateLoadBalancerRequest;
import com.ksc.transform.Marshaller;
import org.apache.commons.lang.StringUtils;

/**
 * Created by LIUHONGMING on 2017/4/21.
 */
public class CreateLoadBalancerRequestMarshaller implements
        Marshaller<Request<CreateLoadBalancerRequest>, CreateLoadBalancerRequest> {

    @Override
    public Request<CreateLoadBalancerRequest> marshall(
            CreateLoadBalancerRequest createLoadBalancerRequest) {

        if (createLoadBalancerRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateLoadBalancerRequest> request = new DefaultRequest<CreateLoadBalancerRequest>(
                createLoadBalancerRequest, "slb");
        request.addParameter("Action", "CreatLoadBalancer");
        String version = createLoadBalancerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isEmpty(createLoadBalancerRequest.getVpcId())) {
            request.addParameter("VpcId", createLoadBalancerRequest.getVpcId());
        }

        if (!StringUtils.isEmpty(createLoadBalancerRequest.getLoadBalancerName())) {
            request.addParameter("LoadBalancerName", createLoadBalancerRequest.getLoadBalancerName());
        }

        if (!StringUtils.isEmpty(createLoadBalancerRequest.getType())) {
            request.addParameter("Type", createLoadBalancerRequest.getType());
        }

        if (!StringUtils.isEmpty(createLoadBalancerRequest.getSubnetId())) {
            request.addParameter("SubnetId", createLoadBalancerRequest.getSubnetId());
        }

        return request;
    }
}
