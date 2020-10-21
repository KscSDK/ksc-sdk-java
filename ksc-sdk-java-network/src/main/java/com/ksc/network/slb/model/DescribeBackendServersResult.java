package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeBackendServers.
 * </p>
 */
@Data
public class DescribeBackendServersResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<BackendServer> BackendServerSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeBackendServersResult that = (DescribeBackendServersResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (BackendServerSet != null ? !BackendServerSet.equals(that.BackendServerSet) : that.BackendServerSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (BackendServerSet != null ? BackendServerSet.hashCode() : 0);
        return result;
    }

    public void addBackendServerSet(BackendServer... backendServers) {
		if (this.BackendServerSet == null) {
			this.BackendServerSet = new SdkInternalList<BackendServer>();
		}
		for (BackendServer backendServer : backendServers) {
			this.BackendServerSet.add(backendServer);
		}
	}


    @Override
    public DescribeBackendServersResult clone() {
        try {
            return (DescribeBackendServersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
