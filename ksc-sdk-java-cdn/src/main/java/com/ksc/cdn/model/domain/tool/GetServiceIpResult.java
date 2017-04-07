package com.ksc.cdn.model.domain.tool;

import java.util.List;

public class GetServiceIpResult {
	/**
	 * 域名ID
	 */
	private String DomainId;
	
	/**
	 * 服务域名的IP列表
	 */
	private IpList[] Datas;

	/**
	 * @return the domainId
	 */
	public String getDomainId() {
		return DomainId;
	}

	/**
	 * @param domainId the domainId to set
	 */
	public void setDomainId(String domainId) {
		DomainId = domainId;
	}

	/**
	 * @return the datas
	 */
	public IpList[] getDatas() {
		return Datas;
	}

	/**
	 * @param datas the datas to set
	 */
	public void setDatas(IpList[] datas) {
		Datas = datas;
	}
	
}
