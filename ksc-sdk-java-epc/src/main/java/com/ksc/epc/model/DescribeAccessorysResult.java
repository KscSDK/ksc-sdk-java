package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeAccessorys.
 * </p>
 */
@Data
public class DescribeAccessorysResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Accessory> AccessorySet;
    private Integer TotalCount;
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeAccessorysResult that = (DescribeAccessorysResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (AccessorySet != null ? !AccessorySet.equals(that.AccessorySet) : that.AccessorySet != null) return false;
        if (TotalCount != null ? !TotalCount.equals(that.TotalCount) : that.TotalCount != null) return false;
        if (NextToken != null ? !NextToken.equals(that.NextToken) : that.NextToken != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (AccessorySet != null ? AccessorySet.hashCode() : 0);
        result = 31 * result + (TotalCount != null ? TotalCount.hashCode() : 0);
        result = 31 * result + (NextToken != null ? NextToken.hashCode() : 0);
        return result;
    }

    public void addAccessorySet(Accessory... accessorys) {
		if (this.AccessorySet == null) {
			this.AccessorySet = new SdkInternalList<Accessory>();
		}
		for (Accessory accessory : accessorys) {
			this.AccessorySet.add(accessory);
		}
	}

    public void setAccessorySet(List<Accessory> accessorys) {
        this.AccessorySet = new SdkInternalList<Accessory>(accessorys);
    }

    @Override
    public DescribeAccessorysResult clone() {
        try {
            return (DescribeAccessorysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
