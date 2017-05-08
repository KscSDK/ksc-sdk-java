package com.ksc.network.vpc.transform.VpcPeeringConnection;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.VpcPeeringConnection.DeleteVpcPeeringConnectionRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcPeeringConnectionRequest Marshaller
 */

public class DeleteVpcPeeringConnectionRequestMarshaller implements
        Marshaller<Request<DeleteVpcPeeringConnectionRequest>, DeleteVpcPeeringConnectionRequest> {

    public Request<DeleteVpcPeeringConnectionRequest> marshall(
    		DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest) {

        if (deleteVpcPeeringConnectionRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteVpcPeeringConnectionRequest> request = new DefaultRequest<DeleteVpcPeeringConnectionRequest>(
        		deleteVpcPeeringConnectionRequest, "vpc");
        request.addParameter("Action", "DeleteVpcPeeringConnection");
        String version = deleteVpcPeeringConnectionRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteVpcPeeringConnectionRequest) deleteVpcPeeringConnectionRequest).getVpcPeeringConnectionId())) {
            request.addParameter("VpcPeeringConnectionId", ((DeleteVpcPeeringConnectionRequest) deleteVpcPeeringConnectionRequest).getVpcPeeringConnectionId());
        }

        return request;
    }

}
