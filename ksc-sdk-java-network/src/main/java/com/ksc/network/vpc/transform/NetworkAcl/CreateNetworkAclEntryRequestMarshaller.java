package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkAcl.CreateNetworkAclEntryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateNetworkAclEntryRequest Marshaller
 */

public class CreateNetworkAclEntryRequestMarshaller implements
        Marshaller<Request<CreateNetworkAclEntryRequest>, CreateNetworkAclEntryRequest> {

    public Request<CreateNetworkAclEntryRequest> marshall(
            CreateNetworkAclEntryRequest createNetworkAclEntryRequest) {

        if (createNetworkAclEntryRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateNetworkAclEntryRequest> request = new DefaultRequest<CreateNetworkAclEntryRequest>(
                createNetworkAclEntryRequest, "vpc");
        request.addParameter("Action", "CreateNetworkAclEntry");
        String version = createNetworkAclEntryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createNetworkAclEntryRequest.getDescription())) {
            request.addParameter("Description", createNetworkAclEntryRequest.getDescription());
        }
        if (!StringUtils.isNullOrEmpty(createNetworkAclEntryRequest.getNetworkAclId())) {
            request.addParameter("NetworkAclId", createNetworkAclEntryRequest.getNetworkAclId());
        }
        if (!StringUtils.isNullOrEmpty(createNetworkAclEntryRequest.getCidrBlock())) {
            request.addParameter("CidrBlock", createNetworkAclEntryRequest.getCidrBlock());
        }
        if (createNetworkAclEntryRequest.getRuleNumber() != null) {
            request.addParameter("RuleNumber", StringUtils
                    .fromInteger(createNetworkAclEntryRequest.getRuleNumber()));
        }
        if (!StringUtils.isNullOrEmpty(createNetworkAclEntryRequest.getDirection())) {
            request.addParameter("Direction", createNetworkAclEntryRequest.getDirection());
        }
        if (!StringUtils.isNullOrEmpty(createNetworkAclEntryRequest.getRuleAction())) {
            request.addParameter("RuleAction", createNetworkAclEntryRequest.getRuleAction());
        }
        if (!StringUtils.isNullOrEmpty(createNetworkAclEntryRequest.getProtocol())) {
            request.addParameter("Protocol", createNetworkAclEntryRequest.getProtocol());
        }
        if (createNetworkAclEntryRequest.getIcmpType() != null) {
            request.addParameter("IcmpType", StringUtils
                    .fromInteger(createNetworkAclEntryRequest.getIcmpType()));
        }
        if (createNetworkAclEntryRequest.getIcmpCode() != null) {
            request.addParameter("IcmpCode", StringUtils
                    .fromInteger(createNetworkAclEntryRequest.getIcmpCode()));
        }
        if (createNetworkAclEntryRequest.getPortRangeFrom() != null) {
            request.addParameter("PortRangeFrom", StringUtils
                    .fromInteger(createNetworkAclEntryRequest.getPortRangeFrom()));
        }
        if (createNetworkAclEntryRequest.getPortRangeTo() != null) {
            request.addParameter("PortRangeTo", StringUtils
                    .fromInteger(createNetworkAclEntryRequest.getPortRangeTo()));
        }
        return request;
    }

}
