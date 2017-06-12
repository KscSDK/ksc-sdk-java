package com.ksc.ket.model;

public class GetLoopListResult {
	private Integer errNum;
	private String errMsg;
	private Integer total;
	private com.ksc.internal.SdkInternalList<GetLoopList> list;

	public void setList(java.util.Collection<GetLoopList> list) {
		if (list != null) {
			this.list = new com.ksc.internal.SdkInternalList<GetLoopList>(list);
		}
	}

	public void addList(GetLoopList... lists) {
		if (this.list == null) {
			this.list = new com.ksc.internal.SdkInternalList<GetLoopList>();
		}
		for (GetLoopList list : lists) {
			this.list.add(list);
		}
	}

	public Integer getErrNum() {
		return errNum;
	}

	public void setErrNum(Integer errNum) {
		this.errNum = errNum;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public com.ksc.internal.SdkInternalList<GetLoopList> getList() {
		return list;
	}

	public void setList(com.ksc.internal.SdkInternalList<GetLoopList> list) {
		this.list = list;
	}

}
