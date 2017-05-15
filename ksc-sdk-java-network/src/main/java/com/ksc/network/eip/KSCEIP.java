package com.ksc.network.eip;

<<<<<<< HEAD
import com.ksc.network.eip.model.AllocateAddressRequest;
import com.ksc.network.eip.model.AllocateAddressResult;
import com.ksc.network.eip.model.AssociateAddressRequest;
import com.ksc.network.eip.model.AssociateAddressResult;
import com.ksc.network.eip.model.DescribeAddressesRequest;
import com.ksc.network.eip.model.DescribeAddressesResult;
import com.ksc.network.eip.model.DisassociateAddressRequest;
import com.ksc.network.eip.model.DisassociateAddressResult;
import com.ksc.network.eip.model.GetLinesRequest;
import com.ksc.network.eip.model.GetLinesResult;
import com.ksc.network.eip.model.ReleaseAddressRequest;
import com.ksc.network.eip.model.ReleaseAddressResult;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryResult;
=======
import com.ksc.network.eip.model.*;
>>>>>>> v4.0.0

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
<<<<<<< HEAD
=======

>>>>>>> v4.0.0
}
