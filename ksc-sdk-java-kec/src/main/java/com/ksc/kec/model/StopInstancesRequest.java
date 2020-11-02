package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.StopInstancesRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for StopInstances.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class StopInstancesRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<StopInstancesRequest> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1713517640265140188L;
	/**
	 * <p>
	 * One or more instance IDs.
	 * </p>
	 * <p>
	 * Default: Describes all your instances.
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> instanceIds;

	/**
	 * <p>
	 * 强制关闭。
	 * 是否可缺省: 是
	 * </p>
	 */
	private Boolean forceStop = Boolean.FALSE;

	/**
	 * <p>
	 * 关闭模式
	 * 有效值： KeepCharging （默认参数）  保留并收费     StopCharging    关机不收费
	 * 是否可缺省: 是
	 * </p>
	 */
	private String stoppedMode;
	
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

	public Boolean getForceStop() {
		return forceStop;
	}

	public void setForceStop(Boolean forceStop) {
		this.forceStop = forceStop;
	}

	public String getStoppedMode() {
		return stoppedMode;
	}

	public void setStoppedMode(String stoppedMode) {
		this.stoppedMode = stoppedMode;
	}

	@Override
	public Request<StopInstancesRequest> getDryRunRequest() {
		Request<StopInstancesRequest> request = new StopInstancesRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
