package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.vpn.DescribeVpnTunnelsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeVpnTunnelsRequestMarshaller implements
        Marshaller<Request<DescribeVpnTunnelsRequest>, DescribeVpnTunnelsRequest> {

    @Override
    public Request<DescribeVpnTunnelsRequest> marshall(DescribeVpnTunnelsRequest describeVpnTunnelsRequest) {
        if (describeVpnTunnelsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpnTunnelsRequest> request = new DefaultRequest<DescribeVpnTunnelsRequest>(
                describeVpnTunnelsRequest, "vpc");
        request.addParameter("Action", "DescribeVpnTunnels");
        String version = describeVpnTunnelsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeVpnTunnelsRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> vpnTunnelIds = (com.ksc.internal.SdkInternalList<String>) describeVpnTunnelsRequest
				.getVpnTunnelIds();
		    if (vpnTunnelIds != null && (!vpnTunnelIds.isEmpty() || !vpnTunnelIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : vpnTunnelIds) {
				if (value != null) {
					request.addParameter("VpnTunnelId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeVpnTunnelsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeVpnTunnelsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeVpnTunnelsRequest.getNextToken())) {
            request.addParameter("NextToken", describeVpnTunnelsRequest.getNextToken());
        }

        return request;
    }
}