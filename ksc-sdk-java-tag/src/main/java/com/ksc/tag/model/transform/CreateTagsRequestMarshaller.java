package com.ksc.tag.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.tag.model.CreateTagsRequest;
import com.ksc.tag.model.Resource;
import com.ksc.tag.model.Tag;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateTagsRequestMarshaller
		implements Marshaller<Request<CreateTagsRequest>, CreateTagsRequest> {

	@Override
	public Request<CreateTagsRequest> marshall(
			CreateTagsRequest createTagsRequest) {
		if (createTagsRequest == null) {
			throw new KscClientException(
					"Invalid argument passed to marshall(...)");
		}

		Request<CreateTagsRequest> request = new DefaultRequest<CreateTagsRequest>(
				createTagsRequest, "tag");
		request.addParameter("Action", "CreateTags");
		String version = createTagsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);

		com.ksc.internal.SdkInternalList<Tag> tags = (com.ksc.internal.SdkInternalList<Tag>) createTagsRequest
				.getTags();
		if (!tags.isEmpty() || !tags.isAutoConstruct()) {
			int filtersListIndex = 1;
			for (Tag tag : tags) {
				if (tag.getKey() != null) {
					request.addParameter("Tag." + filtersListIndex + ".Key",
							StringUtils.fromString(tag.getKey()));
				}
				if (tag.getValue() != null) {
					request.addParameter("Tag." + filtersListIndex + ".Value",
							StringUtils.fromString(tag.getValue()));
				}
				filtersListIndex++;
			}
		}

		com.ksc.internal.SdkInternalList<Resource> resources = (com.ksc.internal.SdkInternalList<Resource>) createTagsRequest
				.getResources();
		if (!tags.isEmpty() || !tags.isAutoConstruct()) {
			int filtersListIndex = 1;
			for (Resource resource : resources) {
				if (resource.getId() != null) {
					request.addParameter("Resource." + filtersListIndex + ".Id",
							StringUtils.fromString(resource.getId()));
				}
				if (resource.getType() != null) {
					request.addParameter(
							"Resource." + filtersListIndex + ".Type",
							StringUtils.fromString(resource.getType()));
				}
				filtersListIndex++;
			}
		}

		return request;
	}

}
