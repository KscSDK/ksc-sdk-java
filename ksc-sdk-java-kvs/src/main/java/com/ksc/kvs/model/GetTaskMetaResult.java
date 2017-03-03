package com.ksc.kvs.model;

public class GetTaskMetaResult {
	
	private String errMsg;
	private int ErrNum;
	private com.ksc.internal.SdkInternalList<MetaInfo> metaInfoList;
	
	private String StartDate;
	private String EndDate;
	private int Marker;
	private int Count;
	private int Total;
	
	
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public int getErrNum() {
		return ErrNum;
	}
	public void setErrNum(int errNum) {
		ErrNum = errNum;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public int getMarker() {
		return Marker;
	}
	public void setMarker(int marker) {
		Marker = marker;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public void setMetaInfoList(
			com.ksc.internal.SdkInternalList<MetaInfo> metaInfoList) {
		this.metaInfoList = metaInfoList;
	}
	public com.ksc.internal.SdkInternalList<MetaInfo> getMetaInfoList() {
		return metaInfoList;
	}
	public void setMetaInfo(java.util.Collection<MetaInfo> metainfoList) {
		if (metainfoList != null) {
			metaInfoList = new com.ksc.internal.SdkInternalList<MetaInfo>(metainfoList);
        }
	}
	
	public void addMeta(MetaInfo... metaInfos){
		if (metaInfoList == null) {
			metaInfoList = new com.ksc.internal.SdkInternalList<MetaInfo>();
        }
		for(MetaInfo metainfo:metaInfos){
			metaInfoList.add(metainfo);
		}
	}
}
