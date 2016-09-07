package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeInstancesRequest;
import com.ksc.model.Filter;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeInstancesRequest Marshaller
 */

public class DescribeInstancesRequestMarshaller implements
        Marshaller<Request<DescribeInstancesRequest>, DescribeInstancesRequest> {

    public Request<DescribeInstancesRequest> marshall(
            DescribeInstancesRequest describeInstancesRequest) {

        if (describeInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstancesRequest> request = new DefaultRequest<DescribeInstancesRequest>(
                describeInstancesRequest, "kec");
        request.addParameter("Action", "DescribeInstances");
        String version=describeInstancesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) describeInstancesRequest
                .getInstanceIds();
        if (!instanceIdsList.isEmpty() || !instanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String instanceIdsListValue : instanceIdsList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex,
                            StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeInstancesRequest
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

        if (describeInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeInstancesRequest.getNextToken()));
        }

        if (describeInstancesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeInstancesRequest.getMaxResults()));
        }
        
        if (describeInstancesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils
                    .fromInteger(describeInstancesRequest.getMarker()));
        }
        
        if (describeInstancesRequest.getSearch() != null) {
            request.addParameter("Search", StringUtils
                    .fromString(describeInstancesRequest.getSearch()));
        }
        
        return request;
    }

}
