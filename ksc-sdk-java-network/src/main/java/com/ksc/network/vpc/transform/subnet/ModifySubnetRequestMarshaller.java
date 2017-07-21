package com.ksc.network.vpc.transform.subnet;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.subnet.ModifySubnetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifySubnetRequest Marshaller
 */

public class ModifySubnetRequestMarshaller implements
        Marshaller<Request<ModifySubnetRequest>, ModifySubnetRequest> {

    public Request<ModifySubnetRequest> marshall(
    		ModifySubnetRequest modifySubnetRequest) {

        if (modifySubnetRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifySubnetRequest> request = new DefaultRequest<ModifySubnetRequest>(
        		modifySubnetRequest, "vpc");
        request.addParameter("Action", "ModifySubnet");
        String version = modifySubnetRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifySubnetRequest.getSubnetId())) {
            request.addParameter("SubnetId", modifySubnetRequest.getSubnetId());
        }

        if (!StringUtils.isNullOrEmpty(modifySubnetRequest.getSubnetName())) {
            request.addParameter("SubnetName", modifySubnetRequest.getSubnetName());
        }

        if (!StringUtils.isNullOrEmpty(modifySubnetRequest.getDns1())) {
            request.addParameter("Dns1", modifySubnetRequest.getDns1());
        }

        if (!StringUtils.isNullOrEmpty(modifySubnetRequest.getDns2())) {
            request.addParameter("Dns2", modifySubnetRequest.getDns2());
        }

        return request;
    }

}
