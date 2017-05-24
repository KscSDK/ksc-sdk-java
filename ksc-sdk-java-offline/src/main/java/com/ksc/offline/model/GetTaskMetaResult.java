package com.ksc.offline.model;

public class GetTaskMetaResult {

	private String errMsg;
	private int errNum;
	private com.ksc.internal.SdkInternalList<MetaInfo> metaInfoList;

	private String startdate;
	private String enddate;
	private int marker;
	private int count;
	private int total;

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public int getMarker() {
		return marker;
	}

	public void setMarker(int marker) {
		this.marker = marker;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public int getErrNum() {
		return errNum;
	}

	public void setErrNum(int errNum) {
		this.errNum = errNum;
	}

	public com.ksc.internal.SdkInternalList<MetaInfo> getMetaInfoList() {
		return metaInfoList;
	}

	public void setMetaInfo(java.util.Collection<MetaInfo> metainfoList) {
		if (metainfoList != null) {
			metaInfoList = new com.ksc.internal.SdkInternalList<MetaInfo>(metainfoList);
		}
	}

	public void addMeta(MetaInfo... metaInfos) {
		if (metaInfoList == null) {
			metaInfoList = new com.ksc.internal.SdkInternalList<MetaInfo>();
		}
		for (MetaInfo metainfo : metaInfos) {
			metaInfoList.add(metainfo);
		}
	}
}
