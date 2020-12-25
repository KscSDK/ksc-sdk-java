package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeResourceRequirementsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeResourceRequirementsRequestMarshaller implements
        Marshaller<Request<DescribeResourceRequirementsRequest>, DescribeResourceRequirementsRequest> {

    @Override
    public Request<DescribeResourceRequirementsRequest> marshall(DescribeResourceRequirementsRequest describeResourceRequirementsRequest) {
        if (describeResourceRequirementsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeResourceRequirementsRequest> request = new DefaultRequest<DescribeResourceRequirementsRequest>(
                describeResourceRequirementsRequest, "epc");
        request.addParameter("Action", "DescribeResourceRequirements");
        String version = describeResourceRequirementsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeResourceRequirementsRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> resourceRequirementIds = (com.ksc.internal.SdkInternalList<String>) describeResourceRequirementsRequest
				.getResourceRequirementIds();
		    if (resourceRequirementIds != null && (!resourceRequirementIds.isEmpty() || !resourceRequirementIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : resourceRequirementIds) {
				if (value != null) {
					request.addParameter("ResourceRequirementId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }

        return request;
    }
}