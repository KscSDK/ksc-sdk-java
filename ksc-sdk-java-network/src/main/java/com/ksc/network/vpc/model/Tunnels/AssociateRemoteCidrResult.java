package com.ksc.network.vpc.model.Tunnels;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of AssociateRemoteCidr.
 * </p>
 */
@ToString
public class AssociateRemoteCidrResult implements Serializable, Cloneable {

	private String RequestId;

	private com.ksc.internal.SdkInternalList<AssociateRemoteCidr> AssociateRemoteCidrSet;


    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public java.util.List<AssociateRemoteCidr> getAssociateRemoteCidrSet() {
        if (AssociateRemoteCidrSet == null) {
            AssociateRemoteCidrSet = new com.ksc.internal.SdkInternalList<AssociateRemoteCidr>();
        }
        return AssociateRemoteCidrSet;
    }


    public void setAssociateRemoteCidrSet(java.util.Collection<AssociateRemoteCidr> associateRemoteCidr) {
        if (associateRemoteCidr == null) {
            this.AssociateRemoteCidrSet = null;
            return;
        }

        this.AssociateRemoteCidrSet = new com.ksc.internal.SdkInternalList<AssociateRemoteCidr>(associateRemoteCidr);
    }

    public AssociateRemoteCidrResult withAssociateRemoteCidrSet(AssociateRemoteCidr... associateRemoteCidr) {
        if (this.AssociateRemoteCidrSet == null) {
            setAssociateRemoteCidrSet(new com.ksc.internal.SdkInternalList<AssociateRemoteCidr>(associateRemoteCidr.length));
        }
        for (AssociateRemoteCidr ele : associateRemoteCidr) {
            this.AssociateRemoteCidrSet.add(ele);
        }
        return this;
    }

    public AssociateRemoteCidrResult withAssociateRemoteCidrSet(java.util.Collection<AssociateRemoteCidr> associateRemoteCidr) {
        setAssociateRemoteCidrSet(associateRemoteCidr);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssociateRemoteCidrResult that = (AssociateRemoteCidrResult) o;

        if (!RequestId.equals(that.RequestId)) return false;
        return AssociateRemoteCidrSet.equals(that.AssociateRemoteCidrSet);
    }

    @Override
    public int hashCode() {
        int result = RequestId.hashCode();
        result = 31 * result + AssociateRemoteCidrSet.hashCode();
        return result;
    }

    @Override
    public AssociateRemoteCidrResult clone() {
        try {
            return (AssociateRemoteCidrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}
	