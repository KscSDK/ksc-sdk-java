package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.vpn.DescribeCustomerGatewaysRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeCustomerGatewaysRequestMarshaller implements
        Marshaller<Request<DescribeCustomerGatewaysRequest>, DescribeCustomerGatewaysRequest> {

    @Override
    public Request<DescribeCustomerGatewaysRequest> marshall(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) {
        if (describeCustomerGatewaysRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCustomerGatewaysRequest> request = new DefaultRequest<DescribeCustomerGatewaysRequest>(
                describeCustomerGatewaysRequest, "vpc");
        request.addParameter("Action", "DescribeCustomerGateways");
        String version = describeCustomerGatewaysRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeCustomerGatewaysRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> customerGatewayIds = (com.ksc.internal.SdkInternalList<String>) describeCustomerGatewaysRequest
				.getCustomerGatewayIds();
		    if (customerGatewayIds != null && (!customerGatewayIds.isEmpty() || !customerGatewayIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : customerGatewayIds) {
				if (value != null) {
					request.addParameter("CustomerGatewayId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeCustomerGatewaysRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeCustomerGatewaysRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeCustomerGatewaysRequest.getNextToken())) {
            request.addParameter("NextToken", describeCustomerGatewaysRequest.getNextToken());
        }

        return request;
    }
}