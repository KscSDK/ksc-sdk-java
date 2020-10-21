package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeBackendServersRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeBackendServersRequestMarshaller implements
        Marshaller<Request<DescribeBackendServersRequest>, DescribeBackendServersRequest> {

    @Override
    public Request<DescribeBackendServersRequest> marshall(DescribeBackendServersRequest describeBackendServersRequest) {
        if (describeBackendServersRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeBackendServersRequest> request = new DefaultRequest<DescribeBackendServersRequest>(
                describeBackendServersRequest, "slb");
        request.addParameter("Action", "DescribeBackendServers");
        String version = describeBackendServersRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeBackendServersRequest.getFilters();
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
        com.ksc.internal.SdkInternalList<String> registerIds = (com.ksc.internal.SdkInternalList<String>) describeBackendServersRequest
                .getRegisterIds();
        if (registerIds != null && (!registerIds.isEmpty() || !registerIds.isAutoConstruct())) {
            int index = 1;

            for (String value : registerIds) {
                if (value != null) {
                    request.addParameter("RegisterId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }
        if (!StringUtils.isNullOrEmpty(describeBackendServersRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeBackendServersRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeBackendServersRequest.getNextToken())) {
            request.addParameter("NextToken", describeBackendServersRequest.getNextToken());
        }

        return request;
    }
}