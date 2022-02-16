package com.ksc.network.vpc.transform.vpc;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpc.DeleteSecondaryCidrBlockRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteSecondaryCidrBlockRequest Marshaller
 */

public class DeleteSecondaryCidrBlockRequestMarshaller implements
        Marshaller<Request<DeleteSecondaryCidrBlockRequest>, DeleteSecondaryCidrBlockRequest> {

    @Override
    public Request<DeleteSecondaryCidrBlockRequest> marshall(
            DeleteSecondaryCidrBlockRequest deleteSecondaryCidrBlockRequest) {

        if (deleteSecondaryCidrBlockRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteSecondaryCidrBlockRequest> request = new DefaultRequest<DeleteSecondaryCidrBlockRequest>(
                deleteSecondaryCidrBlockRequest, "vpc");
        request.addParameter("Action", "DeleteSecondaryCidrBlock");
        String version = deleteSecondaryCidrBlockRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteSecondaryCidrBlockRequest.getVpcId())) {
            request.addParameter("VpcId", deleteSecondaryCidrBlockRequest.getVpcId());
        }

        if (!StringUtils.isNullOrEmpty(deleteSecondaryCidrBlockRequest.getSecondaryCidrId())) {
            request.addParameter("SecondaryCidrId", deleteSecondaryCidrBlockRequest.getSecondaryCidrId());
        }

        return request;
    }

}
