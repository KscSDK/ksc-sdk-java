package com.ksc.network.vpc.transform.vpc;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpc.DeleteVpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class DeleteVpcRequestMarshaller implements
        Marshaller<Request<DeleteVpcRequest>, DeleteVpcRequest> {

    public Request<DeleteVpcRequest> marshall(
    		DeleteVpcRequest deleteVpcRequest) {

        if (deleteVpcRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteVpcRequest> request = new DefaultRequest<DeleteVpcRequest>(
        		deleteVpcRequest, "vpc");
        request.addParameter("Action", "DeleteVpc");
        String version = deleteVpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteVpcRequest) deleteVpcRequest).getVpcId())) {
            request.addParameter("VpcId", ((DeleteVpcRequest) deleteVpcRequest).getVpcId());
        }

        return request;
    }

}
