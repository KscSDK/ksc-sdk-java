
package com.ksc.network.vpc.model.vpc;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of AddSecondaryCidrBlock.
 * </p>
 */
@ToString
public class AddSecondaryCidrBlockResult implements Serializable, Cloneable {

	private String RequestId;

	private Vpc vpc;

    public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		this.RequestId = requestId;
	}

    public Vpc getVpc() {
        return vpc;
    }

    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
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
        if (other.getVpcSet() == null ^ vpc == null)
            return false;
        if (other.getVpcSet() != null
                && other.getVpcSet().equals(this.vpc) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((vpc == null) ? 0 : vpc.hashCode());
        return hashCode;
    }

    @Override
    public AddSecondaryCidrBlockResult clone() {
        try {
            return (AddSecondaryCidrBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}