package com.ksc.network.dns.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.dns.model.DescribeHostedZonesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeHostedZonesRequestMarshaller implements
        Marshaller<Request<DescribeHostedZonesRequest>, DescribeHostedZonesRequest> {

    @Override
    public Request<DescribeHostedZonesRequest> marshall(DescribeHostedZonesRequest describeHostedZonesRequest) {
        if (describeHostedZonesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeHostedZonesRequest> request = new DefaultRequest<DescribeHostedZonesRequest>(
                describeHostedZonesRequest, "dns");
        request.addParameter("Action", "DescribeHostedZones");
        request.addParameter("Version", "2016-06-07");

        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeHostedZonesRequest.getFilters();
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
        if (!StringUtils.isNullOrEmpty(describeHostedZonesRequest.getHostedZoneId())) {
            request.addParameter("HostedZoneId", describeHostedZonesRequest.getHostedZoneId());
        }

        return request;
    }
}