package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeRemoteManagements.
 * </p>
 */
@Data
public class DescribeRemoteManagementsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<RemoteManagement> RemoteManagementSet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeRemoteManagementsResult that = (DescribeRemoteManagementsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (RemoteManagementSet != null ? !RemoteManagementSet.equals(that.RemoteManagementSet) : that.RemoteManagementSet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (RemoteManagementSet != null ? RemoteManagementSet.hashCode() : 0);
        result = 31 * result + (TotalCount != null ? TotalCount.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        return result;
    }

    public void addRemoteManagementSet(RemoteManagement... remoteManagements) {
		if (this.RemoteManagementSet == null) {
			this.RemoteManagementSet = new SdkInternalList<RemoteManagement>();
		}
		for (RemoteManagement remoteManagement : remoteManagements) {
			this.RemoteManagementSet.add(remoteManagement);
		}
	}

    public void setRemoteManagementSet(List<RemoteManagement> remoteManagements) {
        this.RemoteManagementSet = new SdkInternalList<RemoteManagement>(remoteManagements);
    }

    @Override
    public DescribeRemoteManagementsResult clone() {
        try {
            return (DescribeRemoteManagementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
