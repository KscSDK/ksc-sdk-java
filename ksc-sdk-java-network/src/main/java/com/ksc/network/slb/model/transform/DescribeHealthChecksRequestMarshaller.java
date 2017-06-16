package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeHealthChecksRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeHealthChecksRequest Marshaller
 */
public class DescribeHealthChecksRequestMarshaller
		implements Marshaller<Request<DescribeHealthChecksRequest>, DescribeHealthChecksRequest> {

	@Override
	public Request<DescribeHealthChecksRequest> marshall(DescribeHealthChecksRequest describeHealthChecksRequest) {
		if (describeHealthChecksRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DescribeHealthChecksRequest> request = new DefaultRequest<DescribeHealthChecksRequest>(
				describeHealthChecksRequest, "slb");
		request.addParameter("Action", "DescribeHealthChecks");
		String version = describeHealthChecksRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeHealthChecksRequest
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
		com.ksc.internal.SdkInternalList<String> list = (com.ksc.internal.SdkInternalList<String>) describeHealthChecksRequest
				.getHealthCheckIds();
		if (!list.isEmpty() || !list.isAutoConstruct()) {
			int index = 1;

			for (String value : list) {
				if (value != null) {
					request.addParameter("HealthCheckId." + index, StringUtils.fromString(value));
				}
				index++;
			}
		}

		return request;
	}

}
