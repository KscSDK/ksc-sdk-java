package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.TerminateInstancesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for TerminateInstances.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class TerminateInstancesRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<TerminateInstancesRequest> {

	private static final long serialVersionUID = -1184140854587989261L;

	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * 待销毁实例ID列表
	 * 是否可缺省: 否
	 */
	private com.ksc.internal.SdkInternalList<String> instanceIds;
	
	public com.ksc.internal.SdkInternalList<String> getInstanceIds() {
		return instanceIds;
	}
	public void setInstanceIds(com.ksc.internal.SdkInternalList<String> instanceIds) {
		this.instanceIds = instanceIds;
	}
	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * <p>
	 * <b>NOTE:</b> This method appends the values to the existing list (if
	 * any). Use {@link #setInstanceIds(java.util.Collection)} if you want to override
	 * the existing values.
	 * </p>
	 * @param instanceIds
	 *            One or more instance IDs.</p>
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public void withInstanceIds(String... instanceIds) {
		if (this.instanceIds == null) {
			setInstanceIds(new com.ksc.internal.SdkInternalList<String>());
		}
		for (String ele : instanceIds) {
			this.instanceIds.add(ele);
		}
	}
	@Override
	public Request<TerminateInstancesRequest> getDryRunRequest() {
		Request<TerminateInstancesRequest> request = new TerminateInstancesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
