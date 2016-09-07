package com.ksc.network.eip;

import com.ksc.network.eip.model.DescribeAddressesRequest;
import com.ksc.network.eip.model.DescribeAddressesResult;
import com.ksc.network.eip.model.GetLinesRequest;
import com.ksc.network.eip.model.GetLinesResult;

public interface KSCEIP {
	/**
	 * <p>
	 * Describes one or more of your Elastic IP addresses.
	 * </p>
	 * 
	 * @param describeAddressesRequest
	 *            Contains the parameters for DescribeAddresses.
	 * @return Result of the DescribeAddresses operation returned by the
	 *         service.
	 * @sample KSC.DescribeAddresses
	 */
	public DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest);

	public DescribeAddressesResult describeAddresses();

	/**
	 * <p>
	 * Describes one or more of your Line.
	 * </p>
	 * 
	 * @param getLinesRequest
	 *            Contains the parameters for GetLines.
	 * @return Result of the Line operation returned by the service.
	 * @sample KSC.GetLines
	 */
	public GetLinesResult getLines(GetLinesRequest getLinesRequest);

	public GetLinesResult getLines();
}
