package com.ksc.network.vpc.model.subnet;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.vpc.transform.subnet.CreateSubnetRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateSubnet.
 * </p>
 */
public class CreateSubnetRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateSubnetRequest> {


    /**
     * 可用区的名称
     */
    private String AvailabilityZone;
    /**
     * 子网的名称
     */
    private String SubnetName;
    /**
     * 子网的网络范围，例如：10.0.0.0/24
     */
    private String CidrBlock;
    /**
     * 子网的类型，终端子网（Reserve）、普通子网（Normal）
     */
    private String SubnetType;
    /**
     * DHCP起始IP，Reserve类型时可以缺省。
     */
    private String DhcpIpFrom;
    /**
     * DHCP结束IP，Reserve类型时可以缺省。
     */
    private String DhcpIpTo;
    /**
     * 网关的IP，Reserve类型时可以缺省。
     */
    private String GatewayIp;
    /**
     * Vpc的ID
     */
    private String VpcId;
    /**
     * 子网的Dns1，Reserve类型时可以缺省。
     */
    private String Dns1;
    /**
     * 子网的Dns2，Reserve类型时可以缺省。
     */
    private String Dns2;
    
    public String getAvailabilityZone() {
		return AvailabilityZone;
	}

	public void setAvailabilityZone(String availabilityZone) {
		AvailabilityZone = availabilityZone;
	}

	public String getSubnetName() {
		return SubnetName;
	}

	public void setSubnetName(String subnetName) {
		SubnetName = subnetName;
	}

	public String getCidrBlock() {
		return CidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		CidrBlock = cidrBlock;
	}

	public String getSubnetType() {
		return SubnetType;
	}

	public void setSubnetType(String subnetType) {
		SubnetType = subnetType;
	}

	public String getDhcpIpFrom() {
		return DhcpIpFrom;
	}

	public void setDhcpIpFrom(String dhcpIpFrom) {
		DhcpIpFrom = dhcpIpFrom;
	}

	public String getDhcpIpTo() {
		return DhcpIpTo;
	}

	public void setDhcpIpTo(String dhcpIpTo) {
		DhcpIpTo = dhcpIpTo;
	}

	public String getGatewayIp() {
		return GatewayIp;
	}

	public void setGatewayIp(String gatewayIp) {
		GatewayIp = gatewayIp;
	}

	public String getVpcId() {
		return VpcId;
	}

	public void setVpcId(String vpcId) {
		VpcId = vpcId;
	}

	public String getDns1() {
		return Dns1;
	}

	public void setDns1(String dns1) {
		Dns1 = dns1;
	}

	public String getDns2() {
		return Dns2;
	}

	public void setDns2(String dns2) {
		Dns2 = dns2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((AvailabilityZone == null) ? 0 : AvailabilityZone.hashCode());
		result = prime * result
				+ ((CidrBlock == null) ? 0 : CidrBlock.hashCode());
		result = prime * result
				+ ((DhcpIpFrom == null) ? 0 : DhcpIpFrom.hashCode());
		result = prime * result
				+ ((DhcpIpTo == null) ? 0 : DhcpIpTo.hashCode());
		result = prime * result + ((Dns1 == null) ? 0 : Dns1.hashCode());
		result = prime * result + ((Dns2 == null) ? 0 : Dns2.hashCode());
		result = prime * result
				+ ((GatewayIp == null) ? 0 : GatewayIp.hashCode());
		result = prime * result
				+ ((SubnetName == null) ? 0 : SubnetName.hashCode());
		result = prime * result
				+ ((SubnetType == null) ? 0 : SubnetType.hashCode());
		result = prime * result + ((VpcId == null) ? 0 : VpcId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateSubnetRequest other = (CreateSubnetRequest) obj;
		if (AvailabilityZone == null) {
			if (other.AvailabilityZone != null)
				return false;
		} else if (!AvailabilityZone.equals(other.AvailabilityZone))
			return false;
		if (CidrBlock == null) {
			if (other.CidrBlock != null)
				return false;
		} else if (!CidrBlock.equals(other.CidrBlock))
			return false;
		if (DhcpIpFrom == null) {
			if (other.DhcpIpFrom != null)
				return false;
		} else if (!DhcpIpFrom.equals(other.DhcpIpFrom))
			return false;
		if (DhcpIpTo == null) {
			if (other.DhcpIpTo != null)
				return false;
		} else if (!DhcpIpTo.equals(other.DhcpIpTo))
			return false;
		if (Dns1 == null) {
			if (other.Dns1 != null)
				return false;
		} else if (!Dns1.equals(other.Dns1))
			return false;
		if (Dns2 == null) {
			if (other.Dns2 != null)
				return false;
		} else if (!Dns2.equals(other.Dns2))
			return false;
		if (GatewayIp == null) {
			if (other.GatewayIp != null)
				return false;
		} else if (!GatewayIp.equals(other.GatewayIp))
			return false;
		if (SubnetName == null) {
			if (other.SubnetName != null)
				return false;
		} else if (!SubnetName.equals(other.SubnetName))
			return false;
		if (SubnetType == null) {
			if (other.SubnetType != null)
				return false;
		} else if (!SubnetType.equals(other.SubnetType))
			return false;
		if (VpcId == null) {
			if (other.VpcId != null)
				return false;
		} else if (!VpcId.equals(other.VpcId))
			return false;
		return true;
	}

	@Override
    public CreateSubnetRequest clone() {
        return (CreateSubnetRequest) super.clone();
    }

    @Override
    public Request<CreateSubnetRequest> getDryRunRequest() {
        Request<CreateSubnetRequest> request = new CreateSubnetRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

}