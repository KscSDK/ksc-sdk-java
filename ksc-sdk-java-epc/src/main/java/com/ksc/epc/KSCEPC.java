package com.ksc.epc;

import com.ksc.epc.model.GetEpcRequest;
import com.ksc.epc.model.GetEpcResult;
import com.ksc.epc.model.ListEpcsRequest;
import com.ksc.epc.model.ListEpcsResult;

public interface KSCEPC  {
	/**
	 * 获取云物理主机列表信息
	 * @param listEpcsRequest
	 * @return ListEpcsResult
	 */
	public ListEpcsResult listEpcs(ListEpcsRequest listEpcsRequest) ;
	/**
	 * 获取云物理机详细信息
	 * @param getEpcRequest
	 * @return getEpcResult
	 */
	public GetEpcResult getEpc(GetEpcRequest getEpcRequest) ;
}
