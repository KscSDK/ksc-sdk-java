package com.ksc.network.vpc.model.vpc;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeVpcs.
 * </p>
 */
@ToString
public class DescribeVpcsResult implements Serializable, Cloneable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4342231836921805816L;
	
	private String RequestId;
	/**
     * <p>
     * Information about one or more VPCs.
     * </p>
     */
	
    private com.ksc.internal.SdkInternalList<Vpc> VpcSet;
    
    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

	/**
     * <p>
     * Information about one or more VPCs.
     * </p>
     * 
     * @return Information about one or more VPCs.
     */
    public java.util.List<Vpc> getVpcSet() {
        if (VpcSet == null) {
        	VpcSet = new com.ksc.internal.SdkInternalList<Vpc>();
        }
        return VpcSet;
    }

    /**
     * <p>
     * Information about one or more VPCs.
     * </p>
     * 
     * @param vpcs
     *        Information about one or more VPCs.
     */

    public void setVpcSet(java.util.Collection<Vpc> vpcs) {
        if (vpcs == null) {
            this.VpcSet = null;
            return;
        }

        this.VpcSet = new com.ksc.internal.SdkInternalList<Vpc>(vpcs);
    }

    public DescribeVpcsResult withVpcs(Vpc... vpcs) {
        if (this.VpcSet == null) {
            setVpcSet(new com.ksc.internal.SdkInternalList<Vpc>(vpcs.length));
        }
        for (Vpc ele : vpcs) {
            this.VpcSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more VPCs.
     * </p>
     * 
     * @param vpcs
     *        Information about one or more VPCs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVpcsResult withVpcs(java.util.Collection<Vpc> vpcs) {
        setVpcSet(vpcs);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcsResult == false)
            return false;
        DescribeVpcsResult other = (DescribeVpcsResult) obj;
        if (other.getVpcSet() == null ^ this.getVpcSet() == null)
            return false;
        if (other.getVpcSet() != null
                && other.getVpcSet().equals(this.getVpcSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVpcSet() == null) ? 0 : getVpcSet().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcsResult clone() {
        try {
            return (DescribeVpcsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}