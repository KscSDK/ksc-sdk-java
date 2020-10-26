package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeLoadBalancersRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeLoadBalancersRequest Marshaller
 */
public class DescribeLoadBalancersRequestMarshaller
		implements Marshaller<Request<DescribeLoadBalancersRequest>, DescribeLoadBalancersRequest> {

	@Override
	public Request<DescribeLoadBalancersRequest> marshall(DescribeLoadBalancersRequest describeLoadBalancersRequest) {
		if (describeLoadBalancersRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DescribeLoadBalancersRequest> request = new DefaultRequest<DescribeLoadBalancersRequest>(
				describeLoadBalancersRequest, "slb");
		request.addParameter("Action", "DescribeLoadBalancers");
		String version = describeLoadBalancersRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeLoadBalancersRequest
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
		com.ksc.internal.SdkInternalList<String> lbIdsList = (com.ksc.internal.SdkInternalList<String>) describeLoadBalancersRequest
				.getLoadBalancerIds();
		if (!lbIdsList.isEmpty() || !lbIdsList.isAutoConstruct()) {
			int lbIdsListIndex = 1;

			for (String lbIdsListValue : lbIdsList) {
				if (lbIdsListValue != null) {
					request.addParameter("LoadBalancerId." + lbIdsListIndex, StringUtils.fromString(lbIdsListValue));
				}
				lbIdsListIndex++;
			}
		}
		if (describeLoadBalancersRequest.getState() != null) {
			request.addParameter("State", StringUtils.fromString(describeLoadBalancersRequest.getState()));
		}
		com.ksc.internal.SdkInternalList<String> projectIds = (com.ksc.internal.SdkInternalList<String>) describeLoadBalancersRequest
				.getProjectIds();
		if (projectIds != null && (!projectIds.isEmpty() || !projectIds.isAutoConstruct())) {
			int index = 1;

			for (String value : projectIds) {
				if (value != null) {
					request.addParameter("ProjectId." + index, StringUtils.fromString(value));
				}
				index++;
			}
		}
		return request;
	}

}
