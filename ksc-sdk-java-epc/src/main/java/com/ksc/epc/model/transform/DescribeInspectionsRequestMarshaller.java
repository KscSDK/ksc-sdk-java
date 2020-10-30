package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeInspectionsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeInspectionsRequestMarshaller implements
        Marshaller<Request<DescribeInspectionsRequest>, DescribeInspectionsRequest> {

    @Override
    public Request<DescribeInspectionsRequest> marshall(DescribeInspectionsRequest describeInspectionsRequest) {
        if (describeInspectionsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInspectionsRequest> request = new DefaultRequest<DescribeInspectionsRequest>(
                describeInspectionsRequest, "epc");
        request.addParameter("Action", "DescribeInspections");
        String version = describeInspectionsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeInspectionsRequest.getFilters();
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
        if (!StringUtils.isNullOrEmpty(describeInspectionsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeInspectionsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeInspectionsRequest.getNextToken())) {
            request.addParameter("NextToken", describeInspectionsRequest.getNextToken());
        }

        return request;
    }
}