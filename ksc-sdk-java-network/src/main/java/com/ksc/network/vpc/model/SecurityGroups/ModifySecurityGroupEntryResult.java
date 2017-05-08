package com.ksc.network.vpc.model.SecurityGroups;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifySecurityGroupEntry.
 * </p>
 */
@ToString
public class ModifySecurityGroupEntryResult implements Serializable, Cloneable {


    private String RequestId;

    private SecurityGroupRule SecurityGroupEntry;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public SecurityGroupRule getSecurityGroupEntry() {
        return SecurityGroupEntry;
    }

    public void setSecurityGroupEntry(SecurityGroupRule securityGroupEntry) {
        SecurityGroupEntry = securityGroupEntry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifySecurityGroupEntryResult that = (ModifySecurityGroupEntryResult) o;

        if (!RequestId.equals(that.RequestId)) return false;
        return SecurityGroupEntry.equals(that.SecurityGroupEntry);
    }

    @Override
    public int hashCode() {
        int result = RequestId.hashCode();
        result = 31 * result + SecurityGroupEntry.hashCode();
        return result;
    }

    @Override
    public ModifySecurityGroupEntryResult clone() {
        try {
            return (ModifySecurityGroupEntryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}