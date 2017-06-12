package com.ksc.ket.model;

public class GetStreamTranListResult {
	private Integer ErrNum;
	private String ErrMsg;
	private Integer ListCount;
	private com.ksc.internal.SdkInternalList<TranList> tranList;

	public void setTranList(java.util.Collection<TranList> tranList) {
		if (tranList != null) {
			this.tranList = new com.ksc.internal.SdkInternalList<TranList>(tranList);
		}
	}

	public void addTranList(TranList... tranLists) {
		if (this.tranList == null) {
			this.tranList = new com.ksc.internal.SdkInternalList<TranList>();
		}
		for (TranList tranList : tranLists) {
			this.tranList.add(tranList);
		}
	}

	public Integer getErrNum() {
		return ErrNum;
	}

	public void setErrNum(Integer errNum) {
		ErrNum = errNum;
	}

	public String getErrMsg() {
		return ErrMsg;
	}

	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}

	public Integer getListCount() {
		return ListCount;
	}

	public void setListCount(Integer listCount) {
		ListCount = listCount;
	}

	public com.ksc.internal.SdkInternalList<TranList> getTranList() {
		return tranList;
	}

	public void setTranList(com.ksc.internal.SdkInternalList<TranList> tranList) {
		this.tranList = tranList;
	}

}
