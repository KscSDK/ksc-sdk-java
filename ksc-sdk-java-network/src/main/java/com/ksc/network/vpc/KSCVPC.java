package com.ksc.network.vpc;

<<<<<<< HEAD
import com.ksc.network.vpc.model.DescribeInternetGatewaysRequest;
import com.ksc.network.vpc.model.DescribeInternetGatewaysResult;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesRequest;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesResult;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryResult;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.DescribeSecurityGroupsRequest;
import com.ksc.network.vpc.model.SecurityGroups.DescribeSecurityGroupsResult;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryResult;
import com.ksc.network.vpc.model.subnet.CreateSubnetRequest;
import com.ksc.network.vpc.model.subnet.CreateSubnetResult;
import com.ksc.network.vpc.model.subnet.DeleteSubnetRequest;
import com.ksc.network.vpc.model.subnet.DeleteSubnetResult;
import com.ksc.network.vpc.model.subnet.DescribeSubnetsRequest;
import com.ksc.network.vpc.model.subnet.DescribeSubnetsResult;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
import com.ksc.network.vpc.model.vpc.CreateVpcResult;
import com.ksc.network.vpc.model.vpc.DeleteVpcRequest;
import com.ksc.network.vpc.model.vpc.DeleteVpcResult;
import com.ksc.network.vpc.model.vpc.DescribeVpcsRequest;
import com.ksc.network.vpc.model.vpc.DescribeVpcsResult;
=======
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
>>>>>>> v4.0.0

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
<<<<<<< HEAD
=======
    
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
    public DescribeNatsResult describeNats(
            DescribeNatsRequest describeNatsRequest);

>>>>>>> v4.0.0
}


