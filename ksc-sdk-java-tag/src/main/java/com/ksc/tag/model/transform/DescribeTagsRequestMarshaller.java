package com.ksc.tag.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.model.Filter;
import com.ksc.tag.model.DescribeTagsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeTagsRequestMarshaller implements
		Marshaller<Request<DescribeTagsRequest>, DescribeTagsRequest> {

	@Override
	public Request<DescribeTagsRequest> marshall(
			DescribeTagsRequest describeTagsRequest) {
		if (describeTagsRequest == null) {
			throw new KscClientException(
					"Invalid argument passed to marshall(...)");
		}

		Request<DescribeTagsRequest> request = new DefaultRequest<DescribeTagsRequest>(
				describeTagsRequest, "tag");
		request.addParameter("Action", "DescribeTags");
		String version = describeTagsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<Filter> filtersList = (com.ksc.internal.SdkInternalList<Filter>) describeTagsRequest
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
							request.addParameter(
									"Filter." + filtersListIndex + ".Value."
											+ valuesListIndex,
									StringUtils.fromString(valuesListValue));
						}
						valuesListIndex++;
					}
				}
				filtersListIndex++;
			}
		}

		if (describeTagsRequest.getNextToken() != null) {
			request.addParameter("NextToken",
					StringUtils.fromString(describeTagsRequest.getNextToken()));
		}

		if (describeTagsRequest.getMaxResults() != null) {
			request.addParameter("MaxResults", StringUtils
					.fromInteger(describeTagsRequest.getMaxResults()));
		}

		return request;
	}

}
