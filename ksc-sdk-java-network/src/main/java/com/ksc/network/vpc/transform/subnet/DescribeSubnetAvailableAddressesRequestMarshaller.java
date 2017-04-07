package com.ksc.network.vpc.transform.subnet;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.subnet.DescribeSubnetAvailableAddressesRequest;
import com.ksc.network.vpc.model.subnet.DescribeSubnetsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeSubnetsRequest Marshaller
 */

public class DescribeSubnetAvailableAddressesRequestMarshaller
		implements Marshaller<Request<DescribeSubnetAvailableAddressesRequest>, DescribeSubnetAvailableAddressesRequest> {

	public Request<DescribeSubnetAvailableAddressesRequest> marshall(DescribeSubnetAvailableAddressesRequest describeSubnetAvailableAddressesRequest) {

		if (describeSubnetAvailableAddressesRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DescribeSubnetAvailableAddressesRequest> request = new DefaultRequest<DescribeSubnetAvailableAddressesRequest>(describeSubnetAvailableAddressesRequest,
				"vpc");
		request.addParameter("Action", "DescribeSubnetAvailableAddresses");
		String version = describeSubnetAvailableAddressesRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeSubnetAvailableAddressesRequest
				.getFilters();
		if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
			int filtersListIndex = 1;

			for (Filter filtersListValue : filtersList) {

				if (filtersListValue.getName() != null) {
					request.addParameter("Filter." + filtersListIndex + ".Name",
							StringUtils.fromString(filtersListValue.getName()));
				}

				com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue
						.getValues();
				if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
					int valuesListIndex = 1;

					for (String valuesListValue : valuesList) {
						if (valuesListValue != null) {
							request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex,
									StringUtils.fromString(valuesListValue));
						}
						valuesListIndex++;
					}
				}
				filtersListIndex++;
			}
		}
		if (!StringUtils.isNullOrEmpty(describeSubnetAvailableAddressesRequest.getNextToken())) {
			request.addParameter("NextToken", describeSubnetAvailableAddressesRequest.getNextToken());
		}
		if (describeSubnetAvailableAddressesRequest.getMaxResults() != null) {
			request.addParameter("MaxResults", StringUtils
					.fromInteger(describeSubnetAvailableAddressesRequest.getMaxResults()));
		}

		return request;
	}

}
