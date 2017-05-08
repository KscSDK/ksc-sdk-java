package com.ksc.network.vpc.model.vpc;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode

public class Vpc {
	/**
	 * VPC创建时间
	 */
	private String createTime;
	/**
	 * Vpc的ID
	 */
	private String vpcId;
	/**
	 * Vpc的名称
	 */
	private String vpcName;
	/**
	 * Vpc的网段信息
	 */
	private String cidrBlock;
	/**
	 * 是否为默认Vpc
	 */
	private Boolean isDefault;

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getVpcId() {
		return vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getVpcName() {
		return vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
	}

	public String getCidrBlock() {
		return cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public Boolean getDefault() {
		return isDefault;
	}

	public void setDefault(Boolean aDefault) {
		isDefault = aDefault;
	}
}
