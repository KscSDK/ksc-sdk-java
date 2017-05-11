package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.DescribeListenersRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeListenersRequest Marshaller
 */
public class DescribeListenersRequestMarshaller
		implements Marshaller<Request<DescribeListenersRequest>, DescribeListenersRequest> {

	@Override
	public Request<DescribeListenersRequest> marshall(DescribeListenersRequest describeListenersRequest) {
		if (describeListenersRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DescribeListenersRequest> request = new DefaultRequest<DescribeListenersRequest>(
				describeListenersRequest, "slb");
		request.addParameter("Action", "DescribeListeners");
		String version = describeListenersRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeListenersRequest
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
		com.ksc.internal.SdkInternalList<String> listenerIdsList = (com.ksc.internal.SdkInternalList<String>) describeListenersRequest
				.getListenerIds();
		if (!listenerIdsList.isEmpty() || !listenerIdsList.isAutoConstruct()) {
			int listenerIdsListIndex = 1;

			for (String lbIdsListValue : listenerIdsList) {
				if (lbIdsListValue != null) {
					request.addParameter("ListenerId." + listenerIdsListIndex, StringUtils.fromString(lbIdsListValue));
				}
				listenerIdsListIndex++;
			}
		}

		return request;
	}

}
