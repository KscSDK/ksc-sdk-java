package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.Tunnels.DescribeTunnelsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeTunnelsRequest Marshaller
 */

public class DescribeTunnelsRequestMarshaller
		implements Marshaller<Request<DescribeTunnelsRequest>, DescribeTunnelsRequest> {

	public Request<DescribeTunnelsRequest> marshall(DescribeTunnelsRequest describeTunnelsRequest) {

		if (describeTunnelsRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<DescribeTunnelsRequest> request = new DefaultRequest<DescribeTunnelsRequest>(describeTunnelsRequest,
				"vpc");
		request.addParameter("Action", "DescribeTunnels");
		String version = describeTunnelsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<String> list = (com.ksc.internal.SdkInternalList<String>) describeTunnelsRequest
				.getTunnelIds();
		if (!list.isEmpty() || !list.isAutoConstruct()) {
			int index = 1;

			for (String value : list) {
				if (value != null) {
					request.addParameter("TunnelId." + index, StringUtils.fromString(value));
				}
				index++;
			}
		}

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeTunnelsRequest
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
