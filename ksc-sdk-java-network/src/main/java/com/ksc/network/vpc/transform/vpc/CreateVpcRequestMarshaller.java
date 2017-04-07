package com.ksc.network.vpc.transform.vpc;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateVpcRequest Marshaller
 */

public class CreateVpcRequestMarshaller implements
        Marshaller<Request<CreateVpcRequest>, CreateVpcRequest> {

    public Request<CreateVpcRequest> marshall(
            CreateVpcRequest createVpcRequest) {

        if (createVpcRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateVpcRequest> request = new DefaultRequest<CreateVpcRequest>(
                createVpcRequest, "vpc");
        request.addParameter("Action", "CreateVpc");
        String version = createVpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createVpcRequest.getVpcName())) {
            request.addParameter("VpcName", createVpcRequest.getVpcName());
        }

        if (!StringUtils.isNullOrEmpty(createVpcRequest.getCidrBlock())) {
            request.addParameter("CidrBlock", createVpcRequest.getCidrBlock());
        }

        request.addParameter("IsDefault", createVpcRequest.getDefault().toString());

        return request;
    }

}
