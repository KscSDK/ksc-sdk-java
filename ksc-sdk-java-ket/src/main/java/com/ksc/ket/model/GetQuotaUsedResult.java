package com.ksc.ket.model;

public class GetQuotaUsedResult {
	private int ErrNum;
	private String ErrMsg;
	private QuotaDetail quotaDetail;

	public int getErrNum() {
		return ErrNum;
	}

	public void setErrNum(int errNum) {
		ErrNum = errNum;
	}

	public String getErrMsg() {
		return ErrMsg;
	}

	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}

	public QuotaDetail getQuotaDetail() {
		return quotaDetail;
	}

	public void setQuotaDetail(QuotaDetail quotaDetail) {
		this.quotaDetail = quotaDetail;
	}
}
