package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateSecurityGroupRequest Marshaller
 */

public class CreateSecurityGroupRequestMarshaller implements
        Marshaller<Request<CreateSecurityGroupRequest>, CreateSecurityGroupRequest> {

    public Request<CreateSecurityGroupRequest> marshall(
            CreateSecurityGroupRequest createSecurityGroupRequest) {

        if (createSecurityGroupRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateSecurityGroupRequest> request = new DefaultRequest<CreateSecurityGroupRequest>(
                createSecurityGroupRequest, "vpc");
        request.addParameter("Action", "CreateSecurityGroup");
        String version = createSecurityGroupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createSecurityGroupRequest.getVpcId())) {
            request.addParameter("VpcId", createSecurityGroupRequest.getVpcId());
        }

        if (!StringUtils.isNullOrEmpty(createSecurityGroupRequest.getSecurityGroupName())) {
            request.addParameter("SecurityGroupName", createSecurityGroupRequest.getSecurityGroupName());
        }

        if (!StringUtils.isNullOrEmpty(createSecurityGroupRequest.getDescription())) {
            request.addParameter("Description", createSecurityGroupRequest.getDescription());
        }

        return request;
    }

}
