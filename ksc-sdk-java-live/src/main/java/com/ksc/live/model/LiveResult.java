package com.ksc.live.model;


import com.ksc.internal.SdkInternalList;

import java.util.List;

public class 	LiveResult {

	private int errno;
	private String errmsg;
	private int count;
	private int total;
	private List<Detail> result;


	public int getErrno() {
		return errno;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public int getCount() {
		return count;
	}

	public int getTotal() {
		return total;
	}

	public List<Detail> getResult() {
		return result;
	}

	public void setErrno(int errno) {
		this.errno = errno;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setResult(List<Detail> result) {
		this.result = result;
	}
}
