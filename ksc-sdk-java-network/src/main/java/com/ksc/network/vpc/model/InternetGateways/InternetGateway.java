package com.ksc.network.vpc.model.InternetGateways;

import lombok.ToString;

@ToString
public class InternetGateway {

	private String InternetGatewayName;

	private String VpcId;

	private String CreateTime;

	private String InternetGatewayId;

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
