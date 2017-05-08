package com.ksc.network.vpc.model.InternetGateways;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class InternetGateway {

	/**
	 * 互联网网关的名称
	 */
	private String InternetGatewayName;

	/**
	 * Vpc的ID
	 */
	private String VpcId;

	/**
	 * VPC创建时间
	 */
	private String CreateTime;

	/**
	 * 互联网网关的ID
	 */
	private String InternetGatewayId;

	/**
	 * 可用区的名称
	 */
	private com.ksc.internal.SdkInternalList<Portfwd> PortfwdSet;

	public String getInternetGatewayName() {
		return InternetGatewayName;
	}

	public void setInternetGatewayName(String internetGatewayName) {
		InternetGatewayName = internetGatewayName;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getInternetGatewayId() {
		return InternetGatewayId;
	}

	public void setInternetGatewayId(String internetGatewayId) {
		InternetGatewayId = internetGatewayId;
	}

	public com.ksc.internal.SdkInternalList<Portfwd> getPortfwdSet() {
		return PortfwdSet;
	}

	public void setPortfwdSet(com.ksc.internal.SdkInternalList<Portfwd> portfwdSet) {
		PortfwdSet = portfwdSet;
	}

	public void addPortfwds(Portfwd... portfwds) {
		if (this.PortfwdSet == null) {
			this.PortfwdSet = new com.ksc.internal.SdkInternalList<Portfwd>();
		}
		for (Portfwd portfwd : portfwds) {
			this.PortfwdSet.add(portfwd);
		}
	}
}
