package com.ksc.network.vpc.transform.vpn;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.vpn.DescribeVpnGatewaysRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeVpnGatewaysRequestMarshaller implements
        Marshaller<Request<DescribeVpnGatewaysRequest>, DescribeVpnGatewaysRequest> {

    @Override
    public Request<DescribeVpnGatewaysRequest> marshall(DescribeVpnGatewaysRequest describeVpnGatewaysRequest) {
        if (describeVpnGatewaysRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpnGatewaysRequest> request = new DefaultRequest<DescribeVpnGatewaysRequest>(
                describeVpnGatewaysRequest, "vpc");
        request.addParameter("Action", "DescribeVpnGateways");
        String version = describeVpnGatewaysRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeVpnGatewaysRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> vpnGatewayIds = (com.ksc.internal.SdkInternalList<String>) describeVpnGatewaysRequest
				.getVpnGatewayIds();
		    if (vpnGatewayIds != null && (!vpnGatewayIds.isEmpty() || !vpnGatewayIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : vpnGatewayIds) {
				if (value != null) {
					request.addParameter("VpnGatewayId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
            com.ksc.internal.SdkInternalList<String> projectIds = (com.ksc.internal.SdkInternalList<String>) describeVpnGatewaysRequest
				.getProjectIds();
		    if (projectIds != null && (!projectIds.isEmpty() || !projectIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : projectIds) {
				if (value != null) {
					request.addParameter("ProjectId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
        if (!StringUtils.isNullOrEmpty(describeVpnGatewaysRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeVpnGatewaysRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeVpnGatewaysRequest.getNextToken())) {
            request.addParameter("NextToken", describeVpnGatewaysRequest.getNextToken());
        }

        return request;
    }
}