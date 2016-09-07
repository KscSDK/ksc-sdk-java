package com.ksc.epc.model;

import java.io.Serializable;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.epc.model.transform.ListEpcsRequestMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import lombok.ToString;

/**
 * <p>
 * Contains the parameters for ListEpcs.
 * </p>
 */
@ToString
public class ListEpcsRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<ListEpcsRequest> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -330843795956233041L;
	private String VpcId;
	private String SubnetId;
	private Integer Offset;
	private Integer Limit;

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getSubnetId() {
		return SubnetId;
	}

	public void setSubnetId(String subnetId) {
		SubnetId = subnetId;
	}

	public Integer getOffset() {
		return Offset;
	}

	public void setOffset(Integer offset) {
		Offset = offset;
	}

	public Integer getLimit() {
		return Limit;
	}

	public void setLimit(Integer limit) {
		Limit = limit;
	}

	@Override
	public Request<ListEpcsRequest> getDryRunRequest() {
		Request<ListEpcsRequest> request = new ListEpcsRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
