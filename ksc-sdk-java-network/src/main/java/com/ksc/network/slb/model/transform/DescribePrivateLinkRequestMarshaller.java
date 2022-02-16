package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DescribePrivateLinkRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author: hueason
 * @date: 2021/6/7 17:53
 * @description:
 */
public class DescribePrivateLinkRequestMarshaller implements
        Marshaller<Request<DescribePrivateLinkRequest>, DescribePrivateLinkRequest> {

    @Override
    public Request<DescribePrivateLinkRequest> marshall(DescribePrivateLinkRequest describePrivateLinkRequest) {
        if (describePrivateLinkRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePrivateLinkRequest> request = new DefaultRequest<DescribePrivateLinkRequest>(
                describePrivateLinkRequest, "slb");
        request.addParameter("Action", "DescribePrivateLink");
        String version = describePrivateLinkRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> privateLinkIdList = (com.ksc.internal.SdkInternalList<String>) describePrivateLinkRequest
                .getPrivateLinkIdList();
        if (privateLinkIdList != null && (!privateLinkIdList.isEmpty() || !privateLinkIdList.isAutoConstruct())) {
            int index = 1;

            for (String value : privateLinkIdList) {
                if (value != null) {
                    request.addParameter("PrivateLinkId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        if (!StringUtils.isNullOrEmpty(describePrivateLinkRequest.getMaxResults())) {
            request.addParameter("MaxResults", describePrivateLinkRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describePrivateLinkRequest.getNextToken())) {
            request.addParameter("NextToken", describePrivateLinkRequest.getNextToken());
        }

        return request;
    }
}
