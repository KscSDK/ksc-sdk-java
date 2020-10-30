package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeEpcManagements.
 * </p>
 */
@Data
public class DescribeEpcManagementsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<EpcManagement> EpcManagementSet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeEpcManagementsResult that = (DescribeEpcManagementsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (EpcManagementSet != null ? !EpcManagementSet.equals(that.EpcManagementSet) : that.EpcManagementSet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (EpcManagementSet != null ? EpcManagementSet.hashCode() : 0);
        result = 31 * result + (TotalCount != null ? TotalCount.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        return result;
    }

    public void addEpcManagementSet(EpcManagement... epcManagements) {
		if (this.EpcManagementSet == null) {
			this.EpcManagementSet = new SdkInternalList<EpcManagement>();
		}
		for (EpcManagement epcManagement : epcManagements) {
			this.EpcManagementSet.add(epcManagement);
		}
	}

    public void setEpcManagementSet(List<EpcManagement> epcManagements) {
        this.EpcManagementSet = new SdkInternalList<EpcManagement>(epcManagements);
    }

    @Override
    public DescribeEpcManagementsResult clone() {
        try {
            return (DescribeEpcManagementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
