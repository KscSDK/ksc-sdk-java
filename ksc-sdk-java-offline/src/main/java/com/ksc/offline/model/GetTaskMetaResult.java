package com.ksc.offline.model;

public class GetTaskMetaResult {
	
	private String errMsg;
	private int errNum;
	private com.ksc.internal.SdkInternalList<MetaInfo> metaInfoList;
	
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
	
	public void addMeta(MetaInfo... metaInfos){
		if (metaInfoList == null) {
			metaInfoList = new com.ksc.internal.SdkInternalList<MetaInfo>();
        }
		for(MetaInfo metainfo:metaInfos){
			metaInfoList.add(metainfo);
		}
	}
}
