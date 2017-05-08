package com.ksc.network.vpc.transform.Routes;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.Route.CreateRouteRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateRouteRequest Marshaller
 */

public class CreateRouteRequestMarshaller implements
        Marshaller<Request<CreateRouteRequest>, CreateRouteRequest> {

    public Request<CreateRouteRequest> marshall(
    		CreateRouteRequest createRouteRequest) {

        if (createRouteRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateRouteRequest> request = new DefaultRequest<CreateRouteRequest>(
        		createRouteRequest, "subnet");
        request.addParameter("Action", "CreateRoute");
        String version = createRouteRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createRouteRequest.getVpcId())) {
            request.addParameter("VpcId", createRouteRequest.getVpcId());
        }

        if (!StringUtils.isNullOrEmpty(createRouteRequest.getDestinationCidrBlock())) {
            request.addParameter("DestinationCidrBlock", createRouteRequest.getDestinationCidrBlock());
        }
        if (!StringUtils.isNullOrEmpty(createRouteRequest.getRouteType())) {
            request.addParameter("RouteType", createRouteRequest.getRouteType());
        }
        if (!StringUtils.isNullOrEmpty(createRouteRequest.getTunnelId())) {
            request.addParameter("TunnelId", createRouteRequest.getTunnelId());
        }
        if (!StringUtils.isNullOrEmpty(createRouteRequest.getInstanceId())) {
            request.addParameter("InstanceId", createRouteRequest.getInstanceId());
        }
        return request;
    }

}
