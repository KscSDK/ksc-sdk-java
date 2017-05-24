package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeInstancesWithListenerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeInstancesWithListenerRequest Marshaller
 */
public class DescribeInstancesWithListenerRequestMarshaller
		implements Marshaller<Request<DescribeInstancesWithListenerRequest>, DescribeInstancesWithListenerRequest> {

	@Override
	public Request<DescribeInstancesWithListenerRequest> marshall(DescribeInstancesWithListenerRequest describeInstancesWithListenerRequest) {
		if (describeInstancesWithListenerRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DescribeInstancesWithListenerRequest> request = new DefaultRequest<DescribeInstancesWithListenerRequest>(
				describeInstancesWithListenerRequest, "slb");
		request.addParameter("Action", "DescribeInstancesWithListener");
		String version = describeInstancesWithListenerRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeInstancesWithListenerRequest
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
		com.ksc.internal.SdkInternalList<String> registerIdsList = (com.ksc.internal.SdkInternalList<String>) describeInstancesWithListenerRequest
				.getRegisterIds();
		if (!registerIdsList.isEmpty() || !registerIdsList.isAutoConstruct()) {
			int registerIdsListIndex = 1;

			for (String lbIdsListValue : registerIdsList) {
				if (lbIdsListValue != null) {
					request.addParameter("RegisterId." + registerIdsListIndex, StringUtils.fromString(lbIdsListValue));
				}
				registerIdsListIndex++;
			}
		}

		return request;
	}

}
