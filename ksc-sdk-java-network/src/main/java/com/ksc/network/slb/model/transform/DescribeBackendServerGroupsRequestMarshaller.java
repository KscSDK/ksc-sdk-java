package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeBackendServerGroupsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeBackendServerGroupsRequestMarshaller implements
        Marshaller<Request<DescribeBackendServerGroupsRequest>, DescribeBackendServerGroupsRequest> {

    @Override
    public Request<DescribeBackendServerGroupsRequest> marshall(DescribeBackendServerGroupsRequest describeBackendServerGroupsRequest) {
        if (describeBackendServerGroupsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeBackendServerGroupsRequest> request = new DefaultRequest<DescribeBackendServerGroupsRequest>(
                describeBackendServerGroupsRequest, "slb");
        request.addParameter("Action", "DescribeBackendServerGroups");
        String version = describeBackendServerGroupsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeBackendServerGroupsRequest.getFilters();
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
        com.ksc.internal.SdkInternalList<String> backendServerGroupIds = (com.ksc.internal.SdkInternalList<String>) describeBackendServerGroupsRequest
                .getBackendServerGroupIds();
        if (backendServerGroupIds != null && (!backendServerGroupIds.isEmpty() || !backendServerGroupIds.isAutoConstruct())) {
            int index = 1;

            for (String value : backendServerGroupIds) {
                if (value != null) {
                    request.addParameter("BackendServerGroupId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        if (!StringUtils.isNullOrEmpty(describeBackendServerGroupsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeBackendServerGroupsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeBackendServerGroupsRequest.getNextToken())) {
            request.addParameter("NextToken", describeBackendServerGroupsRequest.getNextToken());
        }

        return request;
    }
}