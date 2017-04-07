package com.ksc.tag.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.tag.model.DescribeTagValuesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeTagValuesRequestMarshaller implements
		Marshaller<Request<DescribeTagValuesRequest>, DescribeTagValuesRequest> {

	@Override
	public Request<DescribeTagValuesRequest> marshall(
			DescribeTagValuesRequest describeTagValuesRequest) {
		if (describeTagValuesRequest == null) {
			throw new KscClientException(
					"Invalid argument passed to marshall(...)");
		}

		Request<DescribeTagValuesRequest> request = new DefaultRequest<DescribeTagValuesRequest>(
				describeTagValuesRequest, "tag");

		request.setHttpMethod(HttpMethodName.GET);

		request.addParameter("Action", "DescribeTagValues");
		String version = describeTagValuesRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);

		if (describeTagValuesRequest.getTagKey() != null) {
			request.addParameter("TagKey", StringUtils
					.fromString(describeTagValuesRequest.getTagKey()));
		}

		if (describeTagValuesRequest.getNextToken() != null) {
			request.addParameter("NextToken", StringUtils
					.fromString(describeTagValuesRequest.getNextToken()));
		}

		if (describeTagValuesRequest.getMaxResults() != null) {
			request.addParameter("MaxResults", StringUtils
					.fromInteger(describeTagValuesRequest.getMaxResults()));
		}

		return request;
	}

}
