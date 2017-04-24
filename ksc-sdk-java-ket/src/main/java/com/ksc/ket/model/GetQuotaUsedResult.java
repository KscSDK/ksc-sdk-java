package com.ksc.ket.model;

public class GetQuotaUsedResult {
	private Integer ErrNum;
	private String ErrMsg;
	private QuotaDetail quotaDetail;

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

	public QuotaDetail getQuotaDetail() {
		return quotaDetail;
	}

	public void setQuotaDetail(QuotaDetail quotaDetail) {
		this.quotaDetail = quotaDetail;
	}
}
