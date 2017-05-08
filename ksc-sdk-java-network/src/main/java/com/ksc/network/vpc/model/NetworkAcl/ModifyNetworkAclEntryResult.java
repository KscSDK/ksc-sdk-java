package com.ksc.network.vpc.model.NetworkAcl;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyNetworkAclEntry.
 * </p>
 */
@ToString
public class ModifyNetworkAclEntryResult implements Serializable, Cloneable {


    private String RequestId;

    private NetworkAclEntry NetworkAclEntry;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public com.ksc.network.vpc.model.NetworkAcl.NetworkAclEntry getNetworkAclEntry() {
        return NetworkAclEntry;
    }

    public void setNetworkAclEntry(com.ksc.network.vpc.model.NetworkAcl.NetworkAclEntry networkAclEntry) {
        NetworkAclEntry = networkAclEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyNetworkAclEntryResult that = (ModifyNetworkAclEntryResult) o;

        if (!RequestId.equals(that.RequestId)) return false;
        return NetworkAclEntry.equals(that.NetworkAclEntry);
    }

    @Override
    public int hashCode() {
        int result = RequestId.hashCode();
        result = 31 * result + NetworkAclEntry.hashCode();
        return result;
    }

    @Override
    public ModifyNetworkAclEntryResult clone() {
        try {
            return (ModifyNetworkAclEntryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}