package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteSecurityGroupRequest Marshaller
 */

public class DeleteSecurityGroupRequestMarshaller implements
        Marshaller<Request<DeleteSecurityGroupRequest>, DeleteSecurityGroupRequest> {

    public Request<DeleteSecurityGroupRequest> marshall(
    		DeleteSecurityGroupRequest deleteSecurityGroupRequest) {

        if (deleteSecurityGroupRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteSecurityGroupRequest> request = new DefaultRequest<DeleteSecurityGroupRequest>(
        		deleteSecurityGroupRequest, "vpc");
        request.addParameter("Action", "DeleteSecurityGroup");
        String version = deleteSecurityGroupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteSecurityGroupRequest) deleteSecurityGroupRequest).getSecurityGroupId())) {
            request.addParameter("SecurityGroupId", ((DeleteSecurityGroupRequest) deleteSecurityGroupRequest).getSecurityGroupId());
        }

        return request;
    }

}
