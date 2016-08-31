package com.ksc.network.vpc;

import com.ksc.network.vpc.model.DescribeNetworkInterfacesRequest;
import com.ksc.network.vpc.model.DescribeNetworkInterfacesResult;
import com.ksc.network.vpc.model.DescribeSecurityGroupsRequest;
import com.ksc.network.vpc.model.DescribeSecurityGroupsResult;
import com.ksc.network.vpc.model.DescribeSubnetsRequest;
import com.ksc.network.vpc.model.DescribeSubnetsResult;
import com.ksc.network.vpc.model.DescribeVpcsRequest;
import com.ksc.network.vpc.model.DescribeVpcsResult;

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
	 * @return Result of the DescribeSecurityGroups operation returned by the service.
	 * @sample KSC.DescribeSecurityGroups
	 */
	public DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest);
}
