package com.ksc.network.vpc.transform.subnet;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateSubnetRequest Marshaller
 */

public class CreateSubnetRequestMarshaller implements
        Marshaller<Request<CreateSubnetRequest>, CreateSubnetRequest> {

    public Request<CreateSubnetRequest> marshall(
            CreateSubnetRequest createSubnetRequest) {

        if (createSubnetRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateSubnetRequest> request = new DefaultRequest<CreateSubnetRequest>(
        		createSubnetRequest, "subnet");
        request.addParameter("Action", "CreateSubnet");
        String version = createSubnetRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getAvailabilityZone())) {
            request.addParameter("AvailabilityZone", createSubnetRequest.getAvailabilityZone());
        }

        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getSubnetName())) {
            request.addParameter("SubnetName", createSubnetRequest.getSubnetName());
        }
        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getCidrBlock())) {
            request.addParameter("CidrBlock", createSubnetRequest.getCidrBlock());
        }
        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getSubnetType())) {
            request.addParameter("SubnetType", createSubnetRequest.getSubnetType());
        }
        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getDhcpIpFrom())) {
            request.addParameter("DhcpIpFrom", createSubnetRequest.getDhcpIpFrom());
        }
        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getDhcpIpTo())) {
            request.addParameter("DhcpIpTo", createSubnetRequest.getDhcpIpTo());
        }
        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getGatewayIp())) {
            request.addParameter("GatewayIp", createSubnetRequest.getGatewayIp());
        }
        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getVpcId())) {
            request.addParameter("VpcId", createSubnetRequest.getVpcId());
        }
        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getDns1())) {
            request.addParameter("Dns1", createSubnetRequest.getDns1());
        }
        if (!StringUtils.isNullOrEmpty(createSubnetRequest.getDns2())) {
            request.addParameter("Dns2", createSubnetRequest.getDns2());
        }
        return request;
    }

}
