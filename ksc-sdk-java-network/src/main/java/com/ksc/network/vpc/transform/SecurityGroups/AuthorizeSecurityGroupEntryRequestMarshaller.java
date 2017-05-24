package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * AuthorizeSecurityGroupEntryRequest Marshaller
 */

public class AuthorizeSecurityGroupEntryRequestMarshaller implements
        Marshaller<Request<AuthorizeSecurityGroupEntryRequest>, AuthorizeSecurityGroupEntryRequest> {

    public Request<AuthorizeSecurityGroupEntryRequest> marshall(
    		AuthorizeSecurityGroupEntryRequest authorizeSecurityGroupEntryRequest) {

        if (authorizeSecurityGroupEntryRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AuthorizeSecurityGroupEntryRequest> request = new DefaultRequest<AuthorizeSecurityGroupEntryRequest>(
        		authorizeSecurityGroupEntryRequest, "vpc");
        request.addParameter("Action", "AuthorizeSecurityGroupEntry");
        String version = authorizeSecurityGroupEntryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(authorizeSecurityGroupEntryRequest.getDescription())) {
            request.addParameter("Description", authorizeSecurityGroupEntryRequest.getDescription());
        }
        if (!StringUtils.isNullOrEmpty(authorizeSecurityGroupEntryRequest.getSecurityGroupId())) {
            request.addParameter("SecurityGroupId", authorizeSecurityGroupEntryRequest.getSecurityGroupId());
        }
        if (!StringUtils.isNullOrEmpty(authorizeSecurityGroupEntryRequest.getCidrBlock())) {
            request.addParameter("CidrBlock", authorizeSecurityGroupEntryRequest.getCidrBlock());
        }
        if (!StringUtils.isNullOrEmpty(authorizeSecurityGroupEntryRequest.getDirection())) {
            request.addParameter("Direction", authorizeSecurityGroupEntryRequest.getDirection());
        }
        if (!StringUtils.isNullOrEmpty(authorizeSecurityGroupEntryRequest.getProtocol())) {
            request.addParameter("Protocol", authorizeSecurityGroupEntryRequest.getProtocol());
        }
        if (authorizeSecurityGroupEntryRequest.getIcmpType() != null) {
            request.addParameter("IcmpType", StringUtils
                    .fromInteger(authorizeSecurityGroupEntryRequest.getIcmpType()));
        }
        if (authorizeSecurityGroupEntryRequest.getIcmpCode() != null) {
            request.addParameter("IcmpCode", StringUtils
                    .fromInteger(authorizeSecurityGroupEntryRequest.getIcmpCode()));
        }
        if (authorizeSecurityGroupEntryRequest.getPortRangeFrom() != null) {
            request.addParameter("PortRangeFrom", StringUtils
                    .fromInteger(authorizeSecurityGroupEntryRequest.getPortRangeFrom()));
        }
        if (authorizeSecurityGroupEntryRequest.getPortRangeTo() != null) {
            request.addParameter("PortRangeTo", StringUtils
                    .fromInteger(authorizeSecurityGroupEntryRequest.getPortRangeTo()));
        }

        return request;
    }

}
