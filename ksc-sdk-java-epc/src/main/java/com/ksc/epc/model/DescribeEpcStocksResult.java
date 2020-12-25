package com.ksc.epc.model;

import lombok.Data;

import java.io.Serializable;
import com.ksc.internal.SdkInternalList;
import java.util.List;

/**
 * <p>
 * Contains the output of DescribeEpcStocks.
 * </p>
 */
@Data
public class DescribeEpcStocksResult implements Serializable, Cloneable {

    private String RequestId;
    private SdkInternalList<Stock> EpcStockSet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeEpcStocksResult that = (DescribeEpcStocksResult) o;
        if (RequestId != null ? !RequestId.equals(that.RequestId) : that.RequestId != null) return false;
        if (EpcStockSet != null ? !EpcStockSet.equals(that.EpcStockSet) : that.EpcStockSet != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (RequestId != null ? RequestId.hashCode() : 0);
        result = 31 * result + (EpcStockSet != null ? EpcStockSet.hashCode() : 0);
        return result;
    }

    public void addEpcStockSet(Stock... stocks) {
		if (this.EpcStockSet == null) {
			this.EpcStockSet = new SdkInternalList<Stock>();
		}
		for (Stock stock : stocks) {
			this.EpcStockSet.add(stock);
		}
	}

    public void setEpcStockSet(List<Stock> stocks) {
        this.EpcStockSet = new SdkInternalList<Stock>(stocks);
    }

    @Override
    public DescribeEpcStocksResult clone() {
        try {
            return (DescribeEpcStocksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
