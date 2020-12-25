package com.ksc.network.dns.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.dns.model.DescribeResourceRecordsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeResourceRecordsRequestMarshaller implements
        Marshaller<Request<DescribeResourceRecordsRequest>, DescribeResourceRecordsRequest> {

    @Override
    public Request<DescribeResourceRecordsRequest> marshall(DescribeResourceRecordsRequest describeResourceRecordsRequest) {
        if (describeResourceRecordsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeResourceRecordsRequest> request = new DefaultRequest<DescribeResourceRecordsRequest>(
                describeResourceRecordsRequest, "dns");
        request.addParameter("Action", "DescribeResourceRecords");
        request.addParameter("Version", "2016-06-07");

        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeResourceRecordsRequest.getFilters();
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
        if (!StringUtils.isNullOrEmpty(describeResourceRecordsRequest.getHostedZoneId())) {
            request.addParameter("HostedZoneId", describeResourceRecordsRequest.getHostedZoneId());
        }
        if (!StringUtils.isNullOrEmpty(describeResourceRecordsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeResourceRecordsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeResourceRecordsRequest.getNextToken())) {
            request.addParameter("NextToken", describeResourceRecordsRequest.getNextToken());
        }

        return request;
    }
}