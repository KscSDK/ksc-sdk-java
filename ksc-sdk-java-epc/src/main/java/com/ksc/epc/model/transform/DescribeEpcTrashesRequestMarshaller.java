package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeEpcTrashesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeEpcTrashesRequestMarshaller implements
        Marshaller<Request<DescribeEpcTrashesRequest>, DescribeEpcTrashesRequest> {

    @Override
    public Request<DescribeEpcTrashesRequest> marshall(DescribeEpcTrashesRequest describeEpcTrashesRequest) {
        if (describeEpcTrashesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEpcTrashesRequest> request = new DefaultRequest<DescribeEpcTrashesRequest>(
                describeEpcTrashesRequest, "epc");
        request.addParameter("Action", "DescribeEpcTrashes");
        String version = describeEpcTrashesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeEpcTrashesRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> hostIds = (com.ksc.internal.SdkInternalList<String>) describeEpcTrashesRequest
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
        if (!StringUtils.isNullOrEmpty(describeEpcTrashesRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeEpcTrashesRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeEpcTrashesRequest.getNextToken())) {
            request.addParameter("NextToken", describeEpcTrashesRequest.getNextToken());
        }

        return request;
    }
}