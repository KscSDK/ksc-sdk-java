package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeEpcAvailableStocks.
 * </p>
 */
@Data
public class DescribeEpcAvailableStocksResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Stock> EpcAvailableStockSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeEpcAvailableStocksResult that = (DescribeEpcAvailableStocksResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (EpcAvailableStockSet != null ? !EpcAvailableStockSet.equals(that.EpcAvailableStockSet) : that.EpcAvailableStockSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (EpcAvailableStockSet != null ? EpcAvailableStockSet.hashCode() : 0);
        return result;
    }

    public void addEpcAvailableStockSet(Stock... stocks) {
		if (this.EpcAvailableStockSet == null) {
			this.EpcAvailableStockSet = new SdkInternalList<Stock>();
		}
		for (Stock stock : stocks) {
			this.EpcAvailableStockSet.add(stock);
		}
	}

    public void setEpcAvailableStockSet(List<Stock> stocks) {
        this.EpcAvailableStockSet = new SdkInternalList<Stock>(stocks);
    }

    @Override
    public DescribeEpcAvailableStocksResult clone() {
        try {
            return (DescribeEpcAvailableStocksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
