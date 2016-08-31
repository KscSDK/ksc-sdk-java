package com.ksc.epc.model;

import lombok.ToString;

/**
 * <p>
 * Contains the output of ListEpcs.
 * </p>
 */
@ToString
public class ListEpcsResult {
	
	private String RequestId;
	private com.ksc.internal.SdkInternalList<EpcHost> EpcHostSet;
	private Integer TotalCount;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public com.ksc.internal.SdkInternalList<EpcHost> getEpcHostSet() {
		return EpcHostSet;
	}

	
	public void setEpcHostSet(java.util.Collection<EpcHost> epcHostSet) {
		if(epcHostSet==null){
			EpcHostSet=null;
		}
		EpcHostSet = new com.ksc.internal.SdkInternalList<EpcHost>(epcHostSet);
	}

	public Integer getTotalCount() {
		return TotalCount;
	}

	public void setTotalCount(Integer totalCount) {
		TotalCount = totalCount;
	}

	public void addEpcHostSet(EpcHost epcHost) {
		if (this.EpcHostSet == null) {
			this.EpcHostSet = new com.ksc.internal.SdkInternalList<EpcHost>();
		}
		this.EpcHostSet.add(epcHost);
	}
}
