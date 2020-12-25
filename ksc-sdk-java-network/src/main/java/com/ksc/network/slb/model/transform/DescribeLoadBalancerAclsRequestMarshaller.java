package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeLoadBalancerAclsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeLoadBalancerAclsRequestMarshaller implements
        Marshaller<Request<DescribeLoadBalancerAclsRequest>, DescribeLoadBalancerAclsRequest> {

    @Override
    public Request<DescribeLoadBalancerAclsRequest> marshall(DescribeLoadBalancerAclsRequest describeLoadBalancerAclsRequest) {
        if (describeLoadBalancerAclsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLoadBalancerAclsRequest> request = new DefaultRequest<DescribeLoadBalancerAclsRequest>(
                describeLoadBalancerAclsRequest, "slb");
        request.addParameter("Action", "DescribeLoadBalancerAcls");
        String version = describeLoadBalancerAclsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeLoadBalancerAclsRequest.getFilters();
        if (filtersList != null && (!filtersList.isEmpty() || !filtersList.isAutoConstruct())) {
            int filtersListIndex = 1;
            for (Filter filtersListValue : filtersList) {
                if (filtersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                }

                com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue.getValues();
                if (valuesList != null && (!valuesList.isEmpty() || !valuesList.isAutoConstruct())) {
                    int valuesListIndex = 1;
                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }
        com.ksc.internal.SdkInternalList<String> loadBalancerAclIds = (com.ksc.internal.SdkInternalList<String>) describeLoadBalancerAclsRequest
                .getLoadBalancerAclIds();
        if (loadBalancerAclIds != null && (!loadBalancerAclIds.isEmpty() || !loadBalancerAclIds.isAutoConstruct())) {
            int index = 1;

            for (String value : loadBalancerAclIds) {
                if (value != null) {
                    request.addParameter("LoadBalancerAclId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        if (!StringUtils.isNullOrEmpty(describeLoadBalancerAclsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeLoadBalancerAclsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeLoadBalancerAclsRequest.getNextToken())) {
            request.addParameter("NextToken", describeLoadBalancerAclsRequest.getNextToken());
        }

        return request;
    }
}