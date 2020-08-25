package com.ksc.network.eip;

import com.ksc.network.eip.model.*;

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

    /**
     * 创建EIP
     */
    public AllocateAddressResult allocateAddress(AllocateAddressRequest allocateAddressRequest);

    /**
     * 删除EIP
     */
    public ReleaseAddressResult releaseAddress(ReleaseAddressRequest releaseAddressRequest);

    /**
     * 绑定弹性IP
     */
    public AssociateAddressResult associateAddress(AssociateAddressRequest associateAddressRequest);

    /**
     * 解绑弹性IP
     */
    public DisassociateAddressResult disassociateAddress(DisassociateAddressRequest disassociateAddressRequest);

    /**
     * 更配弹性IP
     */
    public ModifyAddressResult modifyAddress(ModifyAddressRequest modifyAddressRequest);

}
