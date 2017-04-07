package com.ksc.tag.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.tag.model.transform.CreateTagsRequestMarshaller;

import lombok.ToString;

@ToString
public class CreateTagsRequest extends KscWebServiceRequest implements
		Serializable, Cloneable, DryRunSupportedRequest<CreateTagsRequest> {

	private static final long serialVersionUID = 426912225469293352L;

	/**
	 * 标签对象数组（列表），其中每个标签的分类和名称必须被设置，如果暂未确定标签名称，可将标签名称设置为“空字符串”
	 */
	private com.ksc.internal.SdkInternalList<Tag> tags;
	
	/**
	 * 资源对象数组（列表）
	 */
	private com.ksc.internal.SdkInternalList<Resource> resources;

	public java.util.List<Tag> getTags() {
		if (tags == null) {
			tags = new com.ksc.internal.SdkInternalList<Tag>();
		}
		return tags;
	}

	public void setTags(java.util.Collection<Tag> tags) {
		if (tags == null) {
			this.tags = null;
			return;
		}

		this.tags = new com.ksc.internal.SdkInternalList<Tag>(tags);
	}

	public java.util.List<Resource> getResources() {
		if (resources == null) {
			resources = new com.ksc.internal.SdkInternalList<Resource>();
		}
		return resources;
	}

	public void setResources(java.util.Collection<Resource> resources) {
		if (resources == null) {
			this.resources = null;
			return;
		}

		this.resources = new com.ksc.internal.SdkInternalList<Resource>(
				resources);
	}

	@Override
	public Request<CreateTagsRequest> getDryRunRequest() {
		Request<CreateTagsRequest> request = new CreateTagsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
