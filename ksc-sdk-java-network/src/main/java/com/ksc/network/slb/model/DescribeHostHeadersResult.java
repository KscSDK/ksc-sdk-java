package com.ksc.network.slb.model;

import lombok.Data;

import java.io.Serializable;

import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeHostHeaders.
 * </p>
 */
@Data
public class DescribeHostHeadersResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<HostHeader> HostHeaderSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeHostHeadersResult that = (DescribeHostHeadersResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (HostHeaderSet != null ? !HostHeaderSet.equals(that.HostHeaderSet) : that.HostHeaderSet != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (HostHeaderSet != null ? HostHeaderSet.hashCode() : 0);
        return result;
    }

    public void addHostHeaderSet(HostHeader... hostHeaders) {
        if (this.HostHeaderSet == null) {
            this.HostHeaderSet = new SdkInternalList<HostHeader>();
        }
        for (HostHeader hostHeader : hostHeaders) {
            this.HostHeaderSet.add(hostHeader);
        }
    }


    @Override
    public DescribeHostHeadersResult clone() {
        try {
            return (DescribeHostHeadersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
