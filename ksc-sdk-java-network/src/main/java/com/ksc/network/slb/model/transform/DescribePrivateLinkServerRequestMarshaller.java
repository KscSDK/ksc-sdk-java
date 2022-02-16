package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DescribePrivateLinkServerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author: hueason
 * @date: 2021/6/7 17:17
 * @description:
 */
public class DescribePrivateLinkServerRequestMarshaller implements
        Marshaller<Request<DescribePrivateLinkServerRequest>, DescribePrivateLinkServerRequest> {

    @Override
    public Request<DescribePrivateLinkServerRequest> marshall(DescribePrivateLinkServerRequest describePrivateLinkServerRequest) {
        if (describePrivateLinkServerRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePrivateLinkServerRequest> request = new DefaultRequest<DescribePrivateLinkServerRequest>(
                describePrivateLinkServerRequest, "slb");
        request.addParameter("Action", "DescribePrivateLinkServer");
        String version = describePrivateLinkServerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> privateLinkServerIdList = (com.ksc.internal.SdkInternalList<String>) describePrivateLinkServerRequest
                .getPrivateLinkServerIdList();
        if (privateLinkServerIdList != null && (!privateLinkServerIdList.isEmpty() || !privateLinkServerIdList.isAutoConstruct())) {
            int index = 1;

            for (String value : privateLinkServerIdList) {
                if (value != null) {
                    request.addParameter("PrivateLinkServerId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        if (!StringUtils.isNullOrEmpty(describePrivateLinkServerRequest.getMaxResults())) {
            request.addParameter("MaxResults", describePrivateLinkServerRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describePrivateLinkServerRequest.getNextToken())) {
            request.addParameter("NextToken", describePrivateLinkServerRequest.getNextToken());
        }

        return request;
    }
}
