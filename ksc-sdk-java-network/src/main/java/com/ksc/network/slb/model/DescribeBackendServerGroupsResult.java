package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeBackendServerGroups.
 * </p>
 */
@Data
public class DescribeBackendServerGroupsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<BackendServerGroup> BackendServerGroupSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeBackendServerGroupsResult that = (DescribeBackendServerGroupsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (BackendServerGroupSet != null ? !BackendServerGroupSet.equals(that.BackendServerGroupSet) : that.BackendServerGroupSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (BackendServerGroupSet != null ? BackendServerGroupSet.hashCode() : 0);
        return result;
    }

    public void addBackendServerGroupSet(BackendServerGroup... backendServerGroups) {
		if (this.BackendServerGroupSet == null) {
			this.BackendServerGroupSet = new SdkInternalList<BackendServerGroup>();
		}
		for (BackendServerGroup backendServerGroup : backendServerGroups) {
			this.BackendServerGroupSet.add(backendServerGroup);
		}
	}


    @Override
    public DescribeBackendServerGroupsResult clone() {
        try {
            return (DescribeBackendServerGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
