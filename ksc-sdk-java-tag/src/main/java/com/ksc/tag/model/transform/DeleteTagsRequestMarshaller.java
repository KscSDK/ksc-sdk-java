package com.ksc.tag.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.tag.model.DeleteTagsRequest;
import com.ksc.tag.model.Resource;
import com.ksc.tag.model.Tag;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteTagsRequestMarshaller
		implements Marshaller<Request<DeleteTagsRequest>, DeleteTagsRequest> {

	@Override
	public Request<DeleteTagsRequest> marshall(
			DeleteTagsRequest deleteTagsRequest) {
		if (deleteTagsRequest == null) {
			throw new KscClientException(
					"Invalid argument passed to marshall(...)");
		}

		Request<DeleteTagsRequest> request = new DefaultRequest<DeleteTagsRequest>(
				deleteTagsRequest, "tag");
		request.setHttpMethod(HttpMethodName.GET);

		request.addParameter("Action", "DeleteTags");
		String version = deleteTagsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2016-03-04";
		}
		request.addParameter("Version", version);

		com.ksc.internal.SdkInternalList<Tag> tags = (com.ksc.internal.SdkInternalList<Tag>) deleteTagsRequest
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

		com.ksc.internal.SdkInternalList<Resource> resources = (com.ksc.internal.SdkInternalList<Resource>) deleteTagsRequest
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
