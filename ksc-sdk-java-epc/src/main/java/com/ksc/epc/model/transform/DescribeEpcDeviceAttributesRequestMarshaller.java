package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.epc.model.DescribeEpcDeviceAttributesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeEpcDeviceAttributesRequestMarshaller implements
        Marshaller<Request<DescribeEpcDeviceAttributesRequest>, DescribeEpcDeviceAttributesRequest> {

    @Override
    public Request<DescribeEpcDeviceAttributesRequest> marshall(DescribeEpcDeviceAttributesRequest describeEpcDeviceAttributesRequest) {
        if (describeEpcDeviceAttributesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEpcDeviceAttributesRequest> request = new DefaultRequest<DescribeEpcDeviceAttributesRequest>(
                describeEpcDeviceAttributesRequest, "epc");
        request.addParameter("Action", "DescribeEpcDeviceAttributes");
        String version = describeEpcDeviceAttributesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeEpcDeviceAttributesRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> deviceAttributeIds = (com.ksc.internal.SdkInternalList<String>) describeEpcDeviceAttributesRequest
				.getDeviceAttributeIds();
		    if (deviceAttributeIds != null && (!deviceAttributeIds.isEmpty() || !deviceAttributeIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : deviceAttributeIds) {
				if (value != null) {
					request.addParameter("DeviceAttributeId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeEpcDeviceAttributesRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeEpcDeviceAttributesRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeEpcDeviceAttributesRequest.getNextToken())) {
            request.addParameter("NextToken", describeEpcDeviceAttributesRequest.getNextToken());
        }

        return request;
    }
}