package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeProcessesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeProcessesRequestMarshaller implements
        Marshaller<Request<DescribeProcessesRequest>, DescribeProcessesRequest> {

    @Override
    public Request<DescribeProcessesRequest> marshall(DescribeProcessesRequest describeProcessesRequest) {
        if (describeProcessesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeProcessesRequest> request = new DefaultRequest<DescribeProcessesRequest>(
                describeProcessesRequest, "epc");
        request.addParameter("Action", "DescribeProcesses");
        String version = describeProcessesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeProcessesRequest.getFilters();
            if (filtersList != null && (!filtersList.isEmpty() || !filtersList.isAutoConstruct())) {
			    int filtersListIndex = 1;
			    for (Filter filtersListValue : filtersList) {
				    if (filtersListValue.getName() != null) {
					    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
				    }

				    com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue .getValues();
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
            com.ksc.internal.SdkInternalList<String> operationProcessIds = (com.ksc.internal.SdkInternalList<String>) describeProcessesRequest
				.getOperationProcessIds();
		    if (operationProcessIds != null && (!operationProcessIds.isEmpty() || !operationProcessIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : operationProcessIds) {
				if (value != null) {
					request.addParameter("OperationProcessId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeProcessesRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeProcessesRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeProcessesRequest.getNextToken())) {
            request.addParameter("NextToken", describeProcessesRequest.getNextToken());
        }

        return request;
    }
}