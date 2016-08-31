package com.ksc.kec.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.RebootInstancesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * Contains the parameters for RebootInstances.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class RebootInstancesRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<RebootInstancesRequest> {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7266378282467601062L;
	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your instances.
	 * </p>
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
	 * Default: Describes all your instances.
	 * </p>
	 * <p>
	 * <b>NOTE:</b> This method appends the values to the existing list (if
	 * any). Use {@link #setInstanceIds(java.util.Collection)} if you want to override
	 * the existing values.
	 * </p>
	 * 
	 * @param instanceIds
	 *            One or more instance IDs.</p>
	 *            <p>
	 *            Default: Describes all your instances.
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
	public Request<RebootInstancesRequest> getDryRunRequest() {
		Request<RebootInstancesRequest> request = new RebootInstancesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
