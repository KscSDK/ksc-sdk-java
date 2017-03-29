package com.ksc.network.vpc.transform.vpc;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
import com.ksc.network.vpc.model.vpc.ModifyVpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateVpcRequest Marshaller
 */

public class ModifyVpcRequestMarshaller implements
        Marshaller<Request<ModifyVpcRequest>, ModifyVpcRequest> {

    public Request<ModifyVpcRequest> marshall(
    		ModifyVpcRequest modifyVpcRequest) {

        if (modifyVpcRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyVpcRequest> request = new DefaultRequest<ModifyVpcRequest>(
        		modifyVpcRequest, "vpc");
        request.addParameter("Action", "ModifyVpc");
        String version = modifyVpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyVpcRequest.getVpcId())) {
            request.addParameter("VpcId", modifyVpcRequest.getVpcId());
        }

        if (!StringUtils.isNullOrEmpty(modifyVpcRequest.getVpcName())) {
            request.addParameter("VpcName", modifyVpcRequest.getVpcName());
        }

        return request;
    }

}
