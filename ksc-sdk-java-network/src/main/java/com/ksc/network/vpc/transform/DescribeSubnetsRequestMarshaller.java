package com.ksc.network.vpc.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.DescribeSubnetsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeSubnetsRequest Marshaller
 */

public class DescribeSubnetsRequestMarshaller
		implements Marshaller<Request<DescribeSubnetsRequest>, DescribeSubnetsRequest> {

	public Request<DescribeSubnetsRequest> marshall(DescribeSubnetsRequest describeSubnetsRequest) {

		if (describeSubnetsRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DescribeSubnetsRequest> request = new DefaultRequest<DescribeSubnetsRequest>(describeSubnetsRequest,
				"vpc");
		request.addParameter("Action", "DescribeSubnets");
		String version = describeSubnetsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<String> list = (com.ksc.internal.SdkInternalList<String>) describeSubnetsRequest
				.getSubnetIds();
		if (!list.isEmpty() || !list.isAutoConstruct()) {
			int index = 1;

			for (String value : list) {
				if (value != null) {
					request.addParameter("SubnetId." + index, StringUtils.fromString(value));
				}
				index++;
			}
		}

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeSubnetsRequest
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

		return request;
	}

}
