package com.ksc.network.vpc.transform.peering;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.peering.DescribeVpcPeeringConnectionsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeVpcPeeringConnectionsRequestMarshaller implements
        Marshaller<Request<DescribeVpcPeeringConnectionsRequest>, DescribeVpcPeeringConnectionsRequest> {

    @Override
    public Request<DescribeVpcPeeringConnectionsRequest> marshall(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest) {
        if (describeVpcPeeringConnectionsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcPeeringConnectionsRequest> request = new DefaultRequest<DescribeVpcPeeringConnectionsRequest>(
                describeVpcPeeringConnectionsRequest, "vpc");
        request.addParameter("Action", "DescribeVpcPeeringConnections");
        String version = describeVpcPeeringConnectionsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

            com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeVpcPeeringConnectionsRequest.getFilters();
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
            com.ksc.internal.SdkInternalList<String> vpcPeeringConnectionIds = (com.ksc.internal.SdkInternalList<String>) describeVpcPeeringConnectionsRequest
				.getVpcPeeringConnectionIds();
		    if (vpcPeeringConnectionIds != null && (!vpcPeeringConnectionIds.isEmpty() || !vpcPeeringConnectionIds.isAutoConstruct())) {
			    int index = 1;

			    for (String value : vpcPeeringConnectionIds) {
				if (value != null) {
					request.addParameter("VpcPeeringConnectionId." + index, StringUtils.fromString(value));
				}
				index ++;
			    }
		    }
            com.ksc.internal.SdkInternalList<String> projectIds = (com.ksc.internal.SdkInternalList<String>) describeVpcPeeringConnectionsRequest
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
        if (!StringUtils.isNullOrEmpty(describeVpcPeeringConnectionsRequest.getMaxResults())) {
            request.addParameter("MaxResults", describeVpcPeeringConnectionsRequest.getMaxResults());
        }
        if (!StringUtils.isNullOrEmpty(describeVpcPeeringConnectionsRequest.getNextToken())) {
            request.addParameter("NextToken", describeVpcPeeringConnectionsRequest.getNextToken());
        }

        return request;
    }
}