package com.ksc.network.vpc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.network.vpc.model.DescribeVpcsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DescribeVpcsRequest Marshaller
 */

public class DescribeVpcsRequestMarshaller implements
		Marshaller<Request<DescribeVpcsRequest>, DescribeVpcsRequest> {

	public Request<DescribeVpcsRequest> marshall(
			DescribeVpcsRequest describeVpcsRequest) {

		if (describeVpcsRequest == null) {
			throw new KscClientException(
					"Invalid argument passed to marshall(...)");
		}

		Request<DescribeVpcsRequest> request = new DefaultRequest<DescribeVpcsRequest>(
				describeVpcsRequest, "vpc");
		request.addParameter("Action", "DescribeVpcs");
		String version=describeVpcsRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<String> vpcIdsList = (com.ksc.internal.SdkInternalList<String>) describeVpcsRequest
				.getVpcIds();
		if (!vpcIdsList.isEmpty() || !vpcIdsList.isAutoConstruct()) {
			int vpcIdsListIndex = 1;

			for (String vpcIdsListValue : vpcIdsList) {
				if (vpcIdsListValue != null) {
					request.addParameter("VpcId." + vpcIdsListIndex,
							StringUtils.fromString(vpcIdsListValue));
				}
				vpcIdsListIndex++;
			}
		}

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeVpcsRequest
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
