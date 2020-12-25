package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeEpcManagementsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeEpcManagementsRequestMarshaller implements
        Marshaller<Request<DescribeEpcManagementsRequest>, DescribeEpcManagementsRequest> {

    @Override
    public Request<DescribeEpcManagementsRequest> marshall(DescribeEpcManagementsRequest describeEpcManagementsRequest) {
        if (describeEpcManagementsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEpcManagementsRequest> request = new DefaultRequest<DescribeEpcManagementsRequest>(
                describeEpcManagementsRequest, "epc");
        request.addParameter("Action", "DescribeEpcManagements");
        String version = describeEpcManagementsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeEpcManagementsRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> epcManagementIds = (com.ksc.internal.SdkInternalList<String>) describeEpcManagementsRequest
				.getEpcManagementIds();
		    if (epcManagementIds != null && (!epcManagementIds.isEmpty() || !epcManagementIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : epcManagementIds) {
				if (value != null) {
					request.addParameter("EpcManagementId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeEpcManagementsRequest.getDynamicCode())) {
            request.addParameter("DynamicCode", describeEpcManagementsRequest.getDynamicCode());
        }
        if (!StringUtils.isNullOrEmpty(describeEpcManagementsRequest.getPin())) {
            request.addParameter("Pin", describeEpcManagementsRequest.getPin());
        }
        if (!StringUtils.isNullOrEmpty(describeEpcManagementsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeEpcManagementsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeEpcManagementsRequest.getNextToken())) {
            request.addParameter("NextToken", describeEpcManagementsRequest.getNextToken());
        }

        return request;
    }
}