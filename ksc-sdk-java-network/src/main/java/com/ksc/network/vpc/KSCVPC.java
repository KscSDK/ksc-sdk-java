package com.ksc.network.vpc;

import com.ksc.network.vpc.model.AvailabilityZone.DescribeAvailabilityZonesRequest;
import com.ksc.network.vpc.model.AvailabilityZone.DescribeAvailabilityZonesResult;
import com.ksc.network.vpc.model.InternetGateways.DescribeInternetGatewaysRequest;
import com.ksc.network.vpc.model.InternetGateways.DescribeInternetGatewaysResult;
import com.ksc.network.vpc.model.Nat.*;
import com.ksc.network.vpc.model.NetworkAcl.*;
import com.ksc.network.vpc.model.NetworkInterface.DescribeNetworkInterfacesRequest;
import com.ksc.network.vpc.model.NetworkInterface.DescribeNetworkInterfacesResult;
import com.ksc.network.vpc.model.Route.*;
import com.ksc.network.vpc.model.SecurityGroups.*;
import com.ksc.network.vpc.model.subnet.*;
import com.ksc.network.vpc.model.vpc.*;
import com.ksc.network.vpc.model.peering.*;
import com.ksc.network.vpc.model.vpn.*;
import com.ksc.network.vpc.model.NetworkInterface.*;

public interface KSCVPC {

	public DescribeVpcsResult describeVpcs();

	/**
	 * <p>
	 * Describes one or more of your VPCs.
	 * </p>
	 * 
	 * @param describeVpcsRequest
	 *            Contains the parameters for DescribeVpcs.
	 * @return Result of the DescribeVpcs operation returned by the service.
	 * @sample KSC.DescribeVpcs
	 */
	public DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest);
	
	public DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest);

	/**
	 * <p>
	 * Describes one or more of your NetworkInterfaces.
	 * </p>
	 * 
	 * @param describeNetworkInterfacesRequest
	 *            Contains the parameters for DescribeNetworkInterfaces.
	 * @return Result of the DescribeNetworkInterfaces operation returned by the
	 *         service.
	 * @sample KSC.DescribeNetworkInterfaces
	 */
	public DescribeNetworkInterfacesResult describeNetworkInterfaces(
			DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest);

	/**
	 * <p>
	 * Describes one or more of your Subnets.
	 * </p>
	 * 
	 * @param describeSubnetsRequest
	 *            Contains the parameters for DescribeSubnets.
	 * @return Result of the DescribeSubnets operation returned by the service.
	 * @sample KSC.DescribeSubnets
	 */
	public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest);

	/**
	 * <p>
	 * Describes one or more of your SecurityGroups.
	 * </p>
	 * 
	 * @param describeSecurityGroupsRequest
	 *            Contains the parameters for DescribeSecurityGroups.
	 * @return Result of the DescribeSecurityGroups operation returned by the
	 *         service.
	 * @sample KSC.DescribeSecurityGroups
	 */
	public DescribeSecurityGroupsResult describeSecurityGroups(
			DescribeSecurityGroupsRequest describeSecurityGroupsRequest);

	/**
	 * <p>
	 * Describes one or more of your InternetGateways.
	 * </p>
	 * 
	 * @param describeInternetGatewaysRequest
	 *            Contains the parameters for DescribeInternetGateways.
	 * @return Result of the DescribeInternetGateways operation returned by the
	 *         service.
	 * @sample KSC.DescribeInternetGateways
	 */
	public DescribeInternetGatewaysResult describeInternetGateways(
			DescribeInternetGatewaysRequest describeInternetGatewaysRequest);

    /**
     * 创建VPC
     */
    public CreateVpcResult createVpc(CreateVpcRequest createVpcRequest);
    
    /**
     * 删除VPC
     */
    public DeleteVpcResult deleteVpc(DeleteVpcRequest deleteVpcRequest);

    /**
     * 创建Subnet
     */
    public CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest);
    
    /**
     * 删除Subnet
     */
    public DeleteSubnetResult deleteSubnet(DeleteSubnetRequest deleteSubnetRequest);

	/**
	 * 子网关联ACL
	 */
	public AssociateNetworkAclResult associateNetworkAcl(AssociateNetworkAclRequest associateNetworkAclRequest);

    /**
     * 子网解绑ACL
     */
    public DisassociateNetworkAclResult disassociateNetworkAcl(DisassociateNetworkAclRequest disassociateNetworkAclRequest);
    
    /**
     * 创建安全组
     */
    public CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest createSecurityGroup);
    
    /**
     * 删除安全组
     */
    public DeleteSecurityGroupResult deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest);
    
    /**
     * 更改安全组信息
     */
    public ModifySecurityGroupResult modifySecurityGroup(ModifySecurityGroupRequest modifySecurityGroupRequest);
    
    /**
     * 创建安全组规则
     */
    public AuthorizeSecurityGroupEntryResult authorizeSecurityGroupEntry(AuthorizeSecurityGroupEntryRequest authorizeSecurityGroupEntryRequest);
    
    /**
     * 删除安全组规则
     */
    public RevokeSecurityGroupEntryResult revokeSecurityGroupEntry(RevokeSecurityGroupEntryRequest revokeSecurityGroupEntryRequest);
    
    /**
     * 创建路由
     */
    public CreateRouteResult createRoute(CreateRouteRequest createRoute);
    
    /**
     * 删除路由
     */
    public DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRoute);

	/**
	 * 描述路由
	 */
	public DescribeRoutesResult describeRoutes(
			DescribeRoutesRequest describeRoutesRequest);

	/**
	 * 更改子网信息
	 */
	public ModifySubnetResult modifySubnet(ModifySubnetRequest modifySubnetRequest);

	/**
	 * 创建NetworkAcl
	 */
	public CreateNetworkAclResult createNetworkAcl(CreateNetworkAclRequest createNetworkAcl);

	/**
	 * 删除NetworkAcl
	 */
	public DeleteNetworkAclResult deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAcl);

	/**
	 * 更改NetworkAcl信息
	 */
	public ModifyNetworkAclResult modifyNetworkAcl(ModifyNetworkAclRequest modifyNetworkAclRequest);

    /**
     * 创建安全组规则
     */
    public CreateNetworkAclEntryResult createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest);

    /**
     * 删除NetworkAcl
     */
    public DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntry);

	/**
	 * 描述NetworkAcl
	 */
	public DescribeNetworkAclsResult describeNetworkAcls(
			DescribeNetworkAclsRequest describeNetworkAclsRequest);

    /**
     * 子网可用IP信息
     */
    public DescribeSubnetAvailableAddressesResult describeSubnetAvailableAddresses(
            DescribeSubnetAvailableAddressesRequest describeSubnetAvailableAddressesRequest);

	/**
	 * 创建Nat
	 */
	public CreateNatResult createNat(CreateNatRequest createNatRequest);

	/**
	 * 删除Nat
	 */
	public DeleteNatResult deleteNat(DeleteNatRequest deleteNat);

	/**
	 * 更新NAT信息
	 */
	public ModifyNatResult modifyNat(ModifyNatRequest modifyNatRequest);

	/**
	 * Nat关联子网
	 */
	public AssociateNatResult associateNat(AssociateNatRequest associateNatRequest);

    /**
     * Nat解绑子网
     */
    public DisassociateNatResult disassociateNat(DisassociateNatRequest disassociateNatRequest);

    /**
     * 描述Nat
     */
    public DescribeNatsResult describeNats(DescribeNatsRequest describeNatsRequest);

	/**
	 * 创建对等连接
	 */
	public CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest);
	/**
	 * 修改对等连接
	 */
	public ModifyVpcPeeringConnectionResult modifyVpcPeeringConnection(ModifyVpcPeeringConnectionRequest modifyVpcPeeringConnectionRequest);
	/**
	 * 删除对等连接
	 */
	public DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest);
	/**
	 * 查询对等连接
	 */
	public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest);
	/**
	 * 接受对等连接
	 */
	public AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest);
	/**
	 * 拒绝对等连接
	 */
	public RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest);

	/**
	 * 创建VPN网关
	 */
	public CreateVpnGatewayResult createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest);
	/**
	 * 修改VPN网关
	 */
	public ModifyVpnGatewayResult modifyVpnGateway(ModifyVpnGatewayRequest modifyVpnGatewayRequest);
	/**
	 * 删除VPN网关
	 */
	public DeleteVpnGatewayResult deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest);
	/**
	 * 查询VPN网关
	 */
	public DescribeVpnGatewaysResult describeVpnGateways(DescribeVpnGatewaysRequest describeVpnGatewaysRequest);
	/**
	 * 创建弹性网卡
	 */
	public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest createNetworkInterfaceRequest);
	/**
	 * 删除弹性网卡
	 */
	public DeleteNetworkInterfaceResult deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest);

	/**
	 * 创建客户网关
	 */
	public CreateCustomerGatewayResult createCustomerGateway(CreateCustomerGatewayRequest createCustomerGatewayRequest);
	/**
	 * 删除客户网关
	 */
	public DeleteCustomerGatewayResult deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest);
	/**
	 * 修改客户网关
	 */
	public ModifyCustomerGatewayResult modifyCustomerGateway(ModifyCustomerGatewayRequest modifyCustomerGatewayRequest);
	/**
	 * 获取客户网关
	 */
	public DescribeCustomerGatewaysResult describeCustomerGateways(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest);

	/**
	 * 创建VPN通道
	 */
	public CreateVpnTunnelResult createVpnTunnel(CreateVpnTunnelRequest createVpnTunnelRequest);
	/**
	 * 删除VPN通道
	 */
	public DeleteVpnTunnelResult deleteVpnTunnel(DeleteVpnTunnelRequest deleteVpnTunnelRequest);
	/**
	 * 修改VPN通道
	 */
	public ModifyVpnTunnelResult modifyVpnTunnel(ModifyVpnTunnelRequest modifyVpnTunnelRequest);
	/**
	 * 获取VPN通道
	 */
	public DescribeVpnTunnelsResult describeVpnTunnels(DescribeVpnTunnelsRequest describeVpnTunnelsRequest);

}


