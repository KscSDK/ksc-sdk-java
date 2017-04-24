package com.ksc.network.vpc.transform.VpcPeeringConnection;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.VpcPeeringConnection.AcceptVpcPeeringConnectionRequest;
import com.ksc.network.vpc.model.VpcPeeringConnection.CreateVpcPeeringConnectionRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateVpcRequest Marshaller
 */

public class AcceptVpcPeeringConnectionRequestMarshaller implements
        Marshaller<Request<AcceptVpcPeeringConnectionRequest>, AcceptVpcPeeringConnectionRequest> {

    public Request<AcceptVpcPeeringConnectionRequest> marshall(
            AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest) {

        if (acceptVpcPeeringConnectionRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AcceptVpcPeeringConnectionRequest> request = new DefaultRequest<AcceptVpcPeeringConnectionRequest>(
                acceptVpcPeeringConnectionRequest, "vpc");
        request.addParameter("Action", "AcceptVpcPeeringConnection");
        String version = acceptVpcPeeringConnectionRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(acceptVpcPeeringConnectionRequest.getVpcPeeringConnectionId())) {
            request.addParameter("VpcPeeringConnectionId", acceptVpcPeeringConnectionRequest.getVpcPeeringConnectionId());
        }

        return request;
    }

}
