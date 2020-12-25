package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeHostHeadersRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeHostHeadersRequestMarshaller implements
        Marshaller<Request<DescribeHostHeadersRequest>, DescribeHostHeadersRequest> {

    @Override
    public Request<DescribeHostHeadersRequest> marshall(DescribeHostHeadersRequest describeHostHeadersRequest) {
        if (describeHostHeadersRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeHostHeadersRequest> request = new DefaultRequest<DescribeHostHeadersRequest>(
                describeHostHeadersRequest, "slb");
        request.addParameter("Action", "DescribeHostHeaders");
        String version = describeHostHeadersRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> hostHeaderIds = (com.ksc.internal.SdkInternalList<String>) describeHostHeadersRequest
                .getHostHeaderIds();
        if (hostHeaderIds != null && (!hostHeaderIds.isEmpty() || !hostHeaderIds.isAutoConstruct())) {
            int index = 1;

            for (String value : hostHeaderIds) {
                if (value != null) {
                    request.addParameter("HostHeaderId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeHostHeadersRequest.getFilters();
        if (filtersList != null && (!filtersList.isEmpty() || !filtersList.isAutoConstruct())) {
            int filtersListIndex = 1;
            for (Filter filtersListValue : filtersList) {
                if (filtersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                }

                com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue.getValues();
                if (valuesList != null || (!valuesList.isEmpty() || !valuesList.isAutoConstruct())) {
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

        return request;
    }
}