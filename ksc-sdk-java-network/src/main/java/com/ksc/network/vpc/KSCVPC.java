package com.ksc.network.vpc;

import com.ksc.network.vpc.model.DescribeInternetGatewaysRequest;
import com.ksc.network.vpc.model.DescribeInternetGatewaysResult;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesRequest;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesResult;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.DescribeSecurityGroupsRequest;
import com.ksc.network.vpc.model.SecurityGroups.DescribeSecurityGroupsResult;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupResult;
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

public interface KSCVPC {
	/**
	 * Simplified method form for invoking the DescribeInstances operation.
	 *
	 * @see #describeInstances(DescribeInstancesRequest)
	 */
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
}


