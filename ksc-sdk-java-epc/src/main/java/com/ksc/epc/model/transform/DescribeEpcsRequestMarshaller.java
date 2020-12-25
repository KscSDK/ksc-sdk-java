package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeEpcsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeEpcsRequestMarshaller implements
        Marshaller<Request<DescribeEpcsRequest>, DescribeEpcsRequest> {

    @Override
    public Request<DescribeEpcsRequest> marshall(DescribeEpcsRequest describeEpcsRequest) {
        if (describeEpcsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEpcsRequest> request = new DefaultRequest<DescribeEpcsRequest>(
                describeEpcsRequest, "epc");
        request.addParameter("Action", "DescribeEpcs");
        String version = describeEpcsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeEpcsRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> hostIds = (com.ksc.internal.SdkInternalList<String>) describeEpcsRequest
				.getHostIds();
		    if (hostIds != null && (!hostIds.isEmpty() || !hostIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : hostIds) {
				if (value != null) {
					request.addParameter("HostId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeEpcsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeEpcsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeEpcsRequest.getNextToken())) {
            request.addParameter("NextToken", describeEpcsRequest.getNextToken());
        }

        return request;
    }
}