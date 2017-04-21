package com.ksc.kec.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.kec.model.transform.ModifyInstanceAttributeRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for StartInstances.
 * </p>
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class ModifyInstanceAttributeRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<ModifyInstanceAttributeRequest> {


	private static final long serialVersionUID = 2968305292239661504L;

    private String InstanceId;
    private String InstanceName;
    private String InstancePassword;

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public String getInstancePassword() {
		return InstancePassword;
	}

	public void setInstancePassword(String instancePassword) {
		InstancePassword = instancePassword;
	}

	public String getInstanceName() {
		return InstanceName;
	}

	public void setInstanceName(String instanceName) {
		InstanceName = instanceName;
	}


    @Override
	public Request<ModifyInstanceAttributeRequest> getDryRunRequest() {
		Request<ModifyInstanceAttributeRequest> request = new ModifyInstanceAttributeRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
