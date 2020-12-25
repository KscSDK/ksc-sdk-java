package com.ksc.epc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class PriceInfo {

    /**
     * 价格信息
     */
    private List<Price> priceSet;

    public void addPriceSet(Price... priceSet) {
        if (this.priceSet == null) {
            this.priceSet = new com.ksc.internal.SdkInternalList<Price>();
        }
        for (Price value : priceSet) {
            this.priceSet.add(value);
        }
    }
    public void setPriceSet(List<Price> priceSet) {
        this.priceSet = new com.ksc.internal.SdkInternalList<Price>(priceSet);
    }

}
