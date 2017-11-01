package com.ksc.kvs.model;

public class FlowDataInfo {
	private String Preset;
	private String DstBucket;
	private String DstDir;
	private String DstObjectKey;
	private String DstAcl;
	private com.ksc.internal.SdkInternalList<SrcInfo> SrcInfoList;
	private String ExtParam;

	public void setSrcInfoList(java.util.Collection<SrcInfo> srcInfoList) {
		if (srcInfoList != null) {
			SrcInfoList = new com.ksc.internal.SdkInternalList<SrcInfo>(srcInfoList);
		}
	}

	public void addSrcInfoList(SrcInfo... scrinfos) {
		if (SrcInfoList == null) {
			SrcInfoList = new com.ksc.internal.SdkInternalList<SrcInfo>();
		}
		for (SrcInfo srcInfo : scrinfos) {
			SrcInfoList.add(srcInfo);
		}
	}

	public String getPreset() {
		return Preset;
	}

	public void setPreset(String preset) {
		Preset = preset;
	}

	public String getDstBucket() {
		return DstBucket;
	}

	public void setDstBucket(String dstBucket) {
		DstBucket = dstBucket;
	}

	public String getDstDir() {
		return DstDir;
	}

	public void setDstDir(String dstDir) {
		DstDir = dstDir;
	}

	public String getDstObjectKey() {
		return DstObjectKey;
	}

	public void setDstObjectKey(String dstObjectKey) {
		DstObjectKey = dstObjectKey;
	}

	public com.ksc.internal.SdkInternalList<SrcInfo> getSrcInfoList() {
		return SrcInfoList;
	}

	public void setSrcInfoList(com.ksc.internal.SdkInternalList<SrcInfo> srcInfoList) {
		SrcInfoList = srcInfoList;
	}

	public String getExtParam() {
		return ExtParam;
	}

	public void setExtParam(String extParam) {
		ExtParam = extParam;
	}

	public String getDstAcl() {
		return DstAcl;
	}

	public void setDstAcl(String dstAcl) {
		DstAcl = dstAcl;
	}

}
