package com.ksc.kvs.model;

public class TaskStatus {
	private int Total;
	private int Running;
	private int Pending;
	private int Success;
	private int Failed;

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public int getRunning() {
		return Running;
	}

	public void setRunning(int running) {
		Running = running;
	}

	public int getPending() {
		return Pending;
	}

	public void setPending(int pending) {
		Pending = pending;
	}

	public int getSuccess() {
		return Success;
	}

	public void setSuccess(int success) {
		Success = success;
	}

	public int getFailed() {
		return Failed;
	}

	public void setFailed(int failed) {
		Failed = failed;
	}

}
