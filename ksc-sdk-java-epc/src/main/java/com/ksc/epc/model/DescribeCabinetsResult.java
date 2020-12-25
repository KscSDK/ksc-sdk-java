package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeCabinets.
 * </p>
 */
@Data
public class DescribeCabinetsResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Cabinet> CabinetSet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeCabinetsResult that = (DescribeCabinetsResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (CabinetSet != null ? !CabinetSet.equals(that.CabinetSet) : that.CabinetSet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (CabinetSet != null ? CabinetSet.hashCode() : 0);
        result = 31 * result + (TotalCount != null ? TotalCount.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        return result;
    }

    public void addCabinetSet(Cabinet... cabinets) {
		if (this.CabinetSet == null) {
			this.CabinetSet = new SdkInternalList<Cabinet>();
		}
		for (Cabinet cabinet : cabinets) {
			this.CabinetSet.add(cabinet);
		}
	}

    public void setCabinetSet(List<Cabinet> cabinets) {
        this.CabinetSet = new SdkInternalList<Cabinet>(cabinets);
    }

    @Override
    public DescribeCabinetsResult clone() {
        try {
            return (DescribeCabinetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
