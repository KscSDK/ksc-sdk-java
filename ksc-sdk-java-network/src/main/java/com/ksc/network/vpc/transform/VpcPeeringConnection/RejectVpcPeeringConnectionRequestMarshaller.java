package com.ksc.network.vpc.transform.VpcPeeringConnection;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.VpcPeeringConnection.RejectVpcPeeringConnectionRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * RejectVpcPeeringConnectionRequest Marshaller
 */

public class RejectVpcPeeringConnectionRequestMarshaller implements
        Marshaller<Request<RejectVpcPeeringConnectionRequest>, RejectVpcPeeringConnectionRequest> {

    public Request<RejectVpcPeeringConnectionRequest> marshall(
            RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest) {

        if (rejectVpcPeeringConnectionRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RejectVpcPeeringConnectionRequest> request = new DefaultRequest<RejectVpcPeeringConnectionRequest>(
                rejectVpcPeeringConnectionRequest, "vpc");
        request.addParameter("Action", "RejectVpcPeeringConnection");
        String version = rejectVpcPeeringConnectionRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(rejectVpcPeeringConnectionRequest.getVpcPeeringConnectionId())) {
            request.addParameter("VpcPeeringConnectionId", rejectVpcPeeringConnectionRequest.getVpcPeeringConnectionId());
        }

        return request;
    }

}
