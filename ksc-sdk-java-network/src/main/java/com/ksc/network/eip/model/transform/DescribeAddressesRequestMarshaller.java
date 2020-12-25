package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.eip.model.DescribeAddressesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeAddressesRequest Marshaller
 */

public class DescribeAddressesRequestMarshaller implements
        Marshaller<Request<DescribeAddressesRequest>, DescribeAddressesRequest> {

    public Request<DescribeAddressesRequest> marshall(
            DescribeAddressesRequest describeAddressesRequest) {

        if (describeAddressesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeAddressesRequest> request = new DefaultRequest<DescribeAddressesRequest>(
                describeAddressesRequest, "eip");
        request.addParameter("Action", "DescribeAddresses");
        String version=describeAddressesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeAddressesRequest
                .getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter(
                            "Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        com.ksc.internal.SdkInternalList<String> allocationIdsList = (com.ksc.internal.SdkInternalList<String>) describeAddressesRequest
                .getAllocationIds();
        if (!allocationIdsList.isEmpty()
                || !allocationIdsList.isAutoConstruct()) {
            int allocationIdsListIndex = 1;

            for (String allocationIdsListValue : allocationIdsList) {
                if (allocationIdsListValue != null) {
                    request.addParameter("AllocationId."
                            + allocationIdsListIndex,
                            StringUtils.fromString(allocationIdsListValue));
                }
                allocationIdsListIndex++;
            }
        }
        com.ksc.internal.SdkInternalList<String> projectIds = (com.ksc.internal.SdkInternalList<String>) describeAddressesRequest
                .getProjectIds();
        if (projectIds != null && (!projectIds.isEmpty() || !projectIds.isAutoConstruct())) {
            int index = 1;

            for (String value : projectIds) {
                if (value != null) {
                    request.addParameter("ProjectId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        if (describeAddressesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeAddressesRequest.getNextToken()));
        }

        if (describeAddressesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeAddressesRequest.getMaxResults()));
        }
        return request;
    }

}
