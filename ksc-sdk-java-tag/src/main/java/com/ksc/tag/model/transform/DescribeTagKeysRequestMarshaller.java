package com.ksc.tag.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.tag.model.DescribeTagKeysRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeTagKeysRequestMarshaller implements
		Marshaller<Request<DescribeTagKeysRequest>, DescribeTagKeysRequest> {

	@Override
	public Request<DescribeTagKeysRequest> marshall(
			DescribeTagKeysRequest describeTagKeysRequest) {
		if (describeTagKeysRequest == null) {
			throw new KscClientException(
					"Invalid argument passed to marshall(...)");
		}

		Request<DescribeTagKeysRequest> request = new DefaultRequest<DescribeTagKeysRequest>(
				describeTagKeysRequest, "tag");
		request.addParameter("Action", "DescribeTagKeys");
		String version = describeTagKeysRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		if (describeTagKeysRequest.getResourceType() != null) {
			request.addParameter("ResourceType", StringUtils
					.fromString(describeTagKeysRequest.getResourceType()));
		}

		if (describeTagKeysRequest.getNextToken() != null) {
			request.addParameter("NextToken", StringUtils
					.fromString(describeTagKeysRequest.getNextToken()));
		}

		if (describeTagKeysRequest.getMaxResults() != null) {
			request.addParameter("MaxResults", StringUtils
					.fromInteger(describeTagKeysRequest.getMaxResults()));
		}

		return request;
	}

}
