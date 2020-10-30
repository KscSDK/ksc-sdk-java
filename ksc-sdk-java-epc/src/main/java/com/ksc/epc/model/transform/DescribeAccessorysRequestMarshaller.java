package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeAccessorysRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeAccessorysRequestMarshaller implements
        Marshaller<Request<DescribeAccessorysRequest>, DescribeAccessorysRequest> {

    @Override
    public Request<DescribeAccessorysRequest> marshall(DescribeAccessorysRequest describeAccessorysRequest) {
        if (describeAccessorysRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAccessorysRequest> request = new DefaultRequest<DescribeAccessorysRequest>(
                describeAccessorysRequest, "epc");
        request.addParameter("Action", "DescribeAccessorys");
        String version = describeAccessorysRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeAccessorysRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> accessoryIds = (com.ksc.internal.SdkInternalList<String>) describeAccessorysRequest
				.getAccessoryIds();
		    if (accessoryIds != null && (!accessoryIds.isEmpty() || !accessoryIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : accessoryIds) {
				if (value != null) {
					request.addParameter("AccessoryId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeAccessorysRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeAccessorysRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeAccessorysRequest.getNextToken())) {
            request.addParameter("NextToken", describeAccessorysRequest.getNextToken());
        }

        return request;
    }
}