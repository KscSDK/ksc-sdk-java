package com.ksc.network.vpc.transform.AvailabilityZone;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.AvailabilityZone.DescribeAvailabilityZonesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeAvailabilityZonesRequest Marshaller
 */

public class DescribeAvailabilityZonesRequestMarshaller implements
		Marshaller<Request<DescribeAvailabilityZonesRequest>, DescribeAvailabilityZonesRequest> {

	public Request<DescribeAvailabilityZonesRequest> marshall(
			DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) {

		if (describeAvailabilityZonesRequest == null) {
			throw new KscClientException(
					"Invalid argument passed to marshall(...)");
		}

		Request<DescribeAvailabilityZonesRequest> request = new DefaultRequest<DescribeAvailabilityZonesRequest>(
				describeAvailabilityZonesRequest, "vpc");
		request.addParameter("Action", "DescribeAvailabilityZones");
		String version=describeAvailabilityZonesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<String> zoneNamesList = (com.ksc.internal.SdkInternalList<String>) describeAvailabilityZonesRequest
				.getZoneNames();
		if (!zoneNamesList.isEmpty() || !zoneNamesList.isAutoConstruct()) {
			int zoneNamesListIndex = 1;

			for (String zoneNamesListValue : zoneNamesList) {
				if (zoneNamesListValue != null) {
					request.addParameter("ZoneName." + zoneNamesListIndex,
							StringUtils.fromString(zoneNamesListValue));
				}
				zoneNamesListIndex++;
			}
		}

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeAvailabilityZonesRequest
				.getFilters();
		if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
			int filtersListIndex = 1;

			for (Filter filtersListValue : filtersList) {

				if (filtersListValue.getName() != null) {
					request.addParameter(
							"Filter." + filtersListIndex + ".Name",
							StringUtils.fromString(filtersListValue.getName()));
				}

				com.ksc.internal.SdkInternalList<String> valuesList = (com.ksc.internal.SdkInternalList<String>) filtersListValue
						.getValues();
				if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
					int valuesListIndex = 1;

					for (String valuesListValue : valuesList) {
						if (valuesListValue != null) {
							request.addParameter("Filter." + filtersListIndex
									+ ".Value." + valuesListIndex,
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
