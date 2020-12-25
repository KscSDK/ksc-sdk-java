package com.ksc.network.dns.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeResourceRecords.
 * </p>
 */
@Data
public class DescribeResourceRecordsResult implements Serializable, Cloneable {

    private String RequestId;
    private String TotalCount;
    private String NextToken;
    private SdkInternalList<ResourceRecord> ResourceRecordSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeResourceRecordsResult that = (DescribeResourceRecordsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        if (ResourceRecordSet != null ? !ResourceRecordSet.equals(that.ResourceRecordSet) : that.ResourceRecordSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (TotalCount != null ? TotalCount.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        result = 31 * result + (ResourceRecordSet != null ? ResourceRecordSet.hashCode() : 0);
        return result;
    }

    public void addResourceRecordSet(ResourceRecord... resourceRecords) {
		if (this.ResourceRecordSet == null) {
			this.ResourceRecordSet = new SdkInternalList<ResourceRecord>();
		}
		for (ResourceRecord resourceRecord : resourceRecords) {
			this.ResourceRecordSet.add(resourceRecord);
		}
	}


    @Override
    public DescribeResourceRecordsResult clone() {
        try {
            return (DescribeResourceRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
