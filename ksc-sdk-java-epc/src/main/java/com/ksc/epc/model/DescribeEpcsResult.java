package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeEpcs.
 * </p>
 */
@Data
public class DescribeEpcsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Host> HostSet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeEpcsResult that = (DescribeEpcsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (HostSet != null ? !HostSet.equals(that.HostSet) : that.HostSet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (HostSet != null ? HostSet.hashCode() : 0);
        result = 31 * result + (TotalCount != null ? TotalCount.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        return result;
    }

    public void addHostSet(Host... hosts) {
		if (this.HostSet == null) {
			this.HostSet = new SdkInternalList<Host>();
		}
		for (Host host : hosts) {
			this.HostSet.add(host);
		}
	}

    public void setHostSet(List<Host> hosts) {
        this.HostSet = new SdkInternalList<Host>(hosts);
    }

    @Override
    public DescribeEpcsResult clone() {
        try {
            return (DescribeEpcsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
