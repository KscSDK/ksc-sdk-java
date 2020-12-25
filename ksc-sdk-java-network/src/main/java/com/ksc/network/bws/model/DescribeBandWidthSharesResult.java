package com.ksc.network.bws.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;

/**
 * <p>
 * Contains the output of DescribeBandWidthShares.
 * </p>
 */
@Data
public class DescribeBandWidthSharesResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<BandWidthShare> BandWidthShareSet;
    /**
     * 当返回结果被截断时，使用NextToken值用于标示下次调用查询用户操作的起始点，可以缺省
     */
    private String NextToken;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeBandWidthSharesResult that = (DescribeBandWidthSharesResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (BandWidthShareSet != null ? !BandWidthShareSet.equals(that.BandWidthShareSet) : that.BandWidthShareSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (BandWidthShareSet != null ? BandWidthShareSet.hashCode() : 0);
        return result;
    }

    public void addBandWidthShareSet(BandWidthShare... bandWidthShares) {
		if (this.BandWidthShareSet == null) {
			this.BandWidthShareSet = new SdkInternalList<BandWidthShare>();
		}
		for (BandWidthShare bandWidthShare : bandWidthShares) {
			this.BandWidthShareSet.add(bandWidthShare);
		}
	}


    @Override
    public DescribeBandWidthSharesResult clone() {
        try {
            return (DescribeBandWidthSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
